### [ Garbage Collection ]

'stop-the-world'란 용어는 GC를 설명함에 있어 중요하다. GC를 실행하기 위해 JVM이 app 실행을 멈추는 것을 의미하기 때문이다. stop-the-world가 발생하면 GC를 실행하는 쓰레드를 제외한 나머지 모든 쓰레드가 작업을 멈춘다. GC작업이 비로소 끝나야 중단되었던 작업들을 재개한다. 어떤 GC 알고리즘을 사용하더라도 stop-the-world는 발생한다. 보통 GC 튜닝이라고 말하는 것은 stop-the-world의 시간을 줄이는 것이다.

Java는 사용자가 직접 메모리를 해제하지 않는다. 물론 System.gc() 메서드를 사용하면 가능하지만 절대 사용하면 안된다. 직접 gc를 호출할 경우 항상 Full GC가 수행된다. 후에 Full GC에 대해 언급하겠지만 Full GC가 일어난 시간동안 app 수행은 완전히 멈춰 버린다. (GC에도 여러 종류가 있고 그중 하나가 Full GC이다) 팁으로 JVM Option중에는 System.gc()의 수행을 못하도록 설정하는 부분이 존재한다.

Java에서는 GC가 더이상 사용하지 않는 객체(Garbage)를 찾아 지우는데, 여기에는 두 가지 가설 하에 만들어졌다.~~(가정 혹은 전제조건이라 표현하는 것이 맞다)~~

>- 대부분의 객체는 금방 접근 불가능 상태(unreachable)가 된다.
>- 오래된(old) 객체에서 젊은(young) 객체로의 참조는 아주 적게 존재한다.

이런 가설을 'weak generational hypothesis'라 한다. 이 가설의 장점을 살리기 위해 HotSpot VM에서는 크게 2개의 물리적 공간을 나누었다. 바로 Young Generation과 Old Generation이다.

>- Young Generation 영역 : 새롭게 생성한 객체의 대부분이 여기에 위치한다. 대부분의 객체가 금방 unreachable상태가 되기 때문에 많은 객체가 Young 영역에 생성되었다가 사라진다. 이 영역에서 객체가 사라질 때 Minor GC가 발생한다고 한다.

>- Old Generation 영역 : Unreachable상태로 되지 않아 Young 영역에서 살아남은 객체가 여기로 복사된다. 대부분 Young 영역보다 크게 할당하며, 크기가 큰 만큼 Young 영역보다 GC는 적게 발생한다. 이 영역에서 객체가 사라질 때 Full GC(혹은 Major GC)가 발생한다고 한다.

정리하면 GC는 메모리를 할당받은 객체가 Young 영역에 존재하다가 계속 살아남은 경우 Old 영역으로 이동한다. 이 밖에도 하나의 영역이 더 있는데 바로 Permanent Generation 영역 (이하 Perm 영역)이다. Method Area라고도 불리며 객체나 억류된 문자열 정보를 저장하는 곳이다. Old 영역에서 살아남은 객체가 영원히 남는 영역이 절대 아님을 강조한다. Perm영역에서도 GC가 발생할 수 있는데 이럴 경우 Full GC의 횟수에 포함된다.

그럼 "Old 영역에 있는 객체가 Young 영역의 객체를 참조하는 경우는 어떻게 처리될까?"라고 생각하는 분도 있을 것이다. 이런 경우를 처리하기 위해 Old 영역 내에는 512byte의 덩어리로 된 Card table이 존재한다. 

Card table에는 Old영역에 있는 객체가 Young 영역의 객체를 참조할 때마다 정보가 표시된다. Young 영역의 GC를 실행할 때에는 Old 영역에 있는 모든 객체의 참조를 확인하지 않고, 이 카드 테이블만 뒤져서 GC 대상인지 식별한다. 즉, Minor GC 실행 전에 Card table을 찾아 Young 영역의 객체 중 참조되는 것이 있으면 제거하지 않는다. 

Card table은 write barrier를 사용하여 관리한다. write barrier는 Minor GC를 빠르게 할 수 있도록 하는 장치이다. write barrirer때문에 약간의 오버헤드는 발생하지만 전반적인 GC 시간은 줄어들게 된다.(아리애 내용은 write barrier를 찾아보면서 얻어온 내용이다)

>Principle of dirty card write-barrier is very simple. Each time when program modifies reference in memory, it should mark modified memory page as dirty. There is a special card table in JVM and each 512 byte page of memory has associated one byte entry in card table. Normally collection of all references from old space to young would require scanning through all objects in old space. That is why we need write-barrier. All objects in young space have been created (or relocated) since last reset of write-barrier, so non-dirty pages cannot have references into young space. This means we can scan only object in dirty pages.(요약하자면 write barrier는 일반적으로 Old 영역에서 Young 영역의 참조를 할 경우 모든 객체를 스캔해야 하는데 이를 대신하여 Card table의 dirty pages만 확인하면 된다.(참조의 변화를 일으킨 객체를 담은 Card table내 공간을 dirty pages라 칭하는 듯 하다))

#### Young 영역의 구성

Young 영역은 3개의 영역으로 나뉜다.

>- Eden 영역
>- Survivor 영역(2개)

각 영역의 처리 절차를 순서에 따라서 기술하면 다음과 같다.

>- 새로 생성한 대부분의 객체는 Eden 영역에 위치한다.
>- Eden 영역에서는 GC가 한 번 발생한 후 살아남은 객체는 Survivor 영역 중 하나로 이동된다. 
>- Eden 영역에서 GC가 발생하면 이미 살아남은 객체가 존재하는 Survivor 영역으로 객체가 계속 쌓인다.
>- 하나의 Survivor 영역이 가득 차게 되면 그 중에서 살아남은 객체를 다른 Survivor 영역으로 이동한다. 그리고 가득 찬 Survivor 영역은 아무 데이터도 없는 상태가 된다.
>- 이 과정을 반복하다가 계속 살아남은 객체를 Old 영역으로 이동시킨다.

이 절차에 따라 Survivor 영역 중 하나는 반드시 비어 있는 상태로 남아있어야 한다. 만약 두 Survivor 영엑에 모두 데이터가 존재하거나, 두 영역 모두 사용량이 0이라면 그 시스템은 정상적인 상황이 아니라 생각하면 된다.

참고로 HotSpot VM에서는 보다 빠른 메모리 할당을 위해서 두 가지 기술을 사용한다. 하나는 bump-the-pointer이고 다른 하나는 TLABs(Thred-Local Allocation Buffers)라는 기술이다.

bump-the-pointer는 Eden영역에 마지막으로 할당 된 객체를 추적한다. 마지막 객체는 Eden 영역의 맨 위에 있다. 그리고 다음 생성되는 객체가 있으면, 해당 객체의 크기가 Eden 영역에 넣기 정당한지만 확인하고, 만약 크기가 적당하면 Eden 영역 맨 위에 새로운 객체를 넣게 된다. 따라서 새로운 객체를 생성할 때 마지막에 추가된 객체만 점검하면 되므로 매우 빠르게 메모리 할당이 이이루어진다.

하지만 multi thread환경에서는 상황이 다르다. Thread-Safe하기 위해 여러 thread에서 사용하는 객체를 Eden 영역에 저장하려고 하면 lock이 발생하게 되고 lock-contention때문에 성능은 매우 떨어지게 될 것이다. 따라서 이러한 문제를 해결하기 위해 등장한 것이 TLABs이다.

TLABs은 개별 thread에게 Eden의 영역을 작은 덩어리로 쪼개 개별소유할 수 있도록 하는 것이다. 각 thread는 자기가 가지고 있는 TLAB에만 접근할 수 있기 때문에 bump-the-pointer 기술을 사용해도 lock에 대한 이슈 없이 메모리할당이 가능하다.

#### Old 영역에 대한 GC

Old 영역은 기본적으로 데이터가 가득 차면 GC를 실행한다. GC 방식에 따라서 처리절차가 달라지므로 어떤 GC 방식이 있는지 살펴보면 이해가 쉬울 것이다. JDK7 기분으로 5가지의 GC 방식이 있다.

>- Serial GC
>- Parallel GC
>- Parallel Old GC(Parallel Compacting GC)
>- Concurrent Mark & Sweep GC(이하 CMS)
>- G1(Gabage First) GC

이중에서 운영 서버에서 절대 사용하면 안 되는 방식이 Serial GC다. Serial GC는 데스크톱의 CPU 코어가 하나만 있을 때 사용하기 위해 만든 방식이다. 따라서 Serial GC를 사용하면 app의 성능이 많이 떨어진다.

**1. Serial GC (-XX:+UseSerialGC)**

Old 영역의 GC는 mark-sweep-compact라는 알고리즘을 사용한다. 이 알고리즘은 Old영역에 살아 있는 객체를 식별(Mark)하고, heap의 앞부분부터 확인하여 살아있는 객체만 남긴다(Sweep). 마지막으로 각 객체들이 연속되게 쌓이도록 heap의 가장 앞부분부터 채워서 객체가 존재하는부분과 객체가 없는 부분으로 나눈다(Compact).

Serial GC는 적은 메모리와 CPU 코어 개수가 적을 때 적합한 방식이다.

**2. Parallel GC (-XX:+UseParallelGC)**

Parallel GC는 Serial GC와 기본적인 알고리즘은 같다. 그러나 Serial GC는 GC를 처리하는 스레드가 하나인 것에 비해, Parallel GC는 GC를 처리하는 쓰레드가 여러개다. 그래서 Serial GC 보다 빠르게 객체를 처리할 수 있다. Parallel GC는 메모리가 충분하고 코어의 개수가 많을수록 유리하다. Parallel GC는 Throughput GC라고도 부른다.

**3. Parallel Old GC (-XX:+UseParallelOldGC)**

Parallel Old GC는 JDK 5updata 6부터 제공한 GC 방식이다. 앞서 설명한 Parallel GC와 비교하여 Old영역의 GC 알고리즘만 다르다. 이 방식은 Mark-Summary-Compaction 단계를 거친다. Summary단계는 이전에 GC를 수행한 영역에 대해서 별도로 살아있는 객체를 식별한다는 점에서 Mark-Sweep-Compaction 알고리즘의 Sweep 단계와는 다르며 조금 더 복잡한 단계를 거친다.

**4. CMS GC (-XX:+UseConcMarkSweepGC)**

처음 Initial mark 단계에서 클래스로더에서 가장 가까운 객체 중 살아있는 객체만 찾는 것으로 끝낸다. 따라서 stop-the-world가 매우 짧다. 그리고 Concurrent mark 단계에서 방금 살아있다고 확인한 객체에서 참조하고 있는 객체들을 따라가면서 확인한다. 이 단계의 특징은 다른 thread가 실행 중인 상태에서 동시에 진행된다는 점이다.

다음은 Remark 단계이다. 여기서는 Concurrent Mark 단계에서 새로 추가되거나 참조가 끊긴 객체를 확인한다. 마지막으로 Concurrent Sweep 단계에서는 쓰레기를 정리하는 작업을 실행한다. 이 작업도 다른 스레드가 실행되고 있는 상황에서 진행한다.

이렇게 진행되기 때문에 stop-the-world 시간이 매우 짧다. 모든 app의 응답속도가 매우 중요할 때 CMS GC를 사용하며, 다른 말로는 Low Latency GC라고 부르기도 한다.

장점이 있으면 단점이 있는법. CMS GC는 아래와 같은 단점이 있다.

>- 다른 GC 방식보다 메모리와 CPU를 더 많이 사용한다.
>- Compaction 단계가 기본적으로 제공되지 않는다.

따라서 CMS GC를 사용할 때는 신중히 검토한 후에 사용해야 한다. 그리고 조각난 메모리가 많아 Compaction 작업을 실행하면 다른 GC 방식의 stop-the-world 시간보다 stop-the-world 시간이 더 길기 때문에 Compaction 작업이 얼마나 자주, 오랫동안 수행되는지 꼭 확인해야 한다.

**5. G1 GC**

G1 GC는 지금까지 Young 영역과 Old 영역에 대해 잊어야 한다. G1 GC는 바둑판의 각 영역에 객체를 할당하고 GC를 실행한다. 그러다 해당영역이 꽉 차면 다른 영역에서 객체를 할당하고 GC를 실행한다. 지금까지 설명하던 Young 영역의 세가지 영역에서 데이터가 Old영역으로 이동하는 단계가 사라진 GC 방식이라고 생각하면 좋다. 등장한 이유는 장기적으로 뜨거운 감자가 된 CMS GC를 대체하기 위해서다.

G1 GC의 가장 큰 장점은 성능이다. 지금까지 설명한 어떤 GC 방식보다도 빠르지만, JDK6에서는 G1 GC를 eqrly access라고 부르며 그냥 시험삼아 사용할 수만 있도록 한다. 그리고 JDK7에서 정식으로 G1 GC를 포함하여 제공한다. 


#### [ Etc ]

이번에 최적의 성능을 낸 GC의 설정이 다음번에도 그런다는 보장은 없다. 각 서비스의 WAS에서 생성하는 객체의 크기, 생존주기 등이 모두 다르고 장비 역시 다양하다. 때문에 해당 서비스에 적합한 GC를 찾기 위해 지속적인 튜닝과 모니터링을 해야한다. 

추가로 Young 영역의 default 값은 작게 잡혀있다. 그래서 기본값으로 사용하기 보단 알맞게 수정해서 사용하는 것이 바람직하다.


[Ref : Naver D2](http://d2.naver.com/helloworld/1329)  
[Ref : stackoverflow](https://stackoverflow.com/questions/2414105/why-is-it-bad-practice-to-call-system-gc)  
[Ref : understanding-gc-pauses-in-jvm-hotspots](http://blog.ragozin.info/2011/06/understanding-gc-pauses-in-jvm-hotspots.html)  