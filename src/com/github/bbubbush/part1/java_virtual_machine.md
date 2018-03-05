# [ Java Virtual Machine ]

### [ 자주 사용하는 용어 정리 ]

- JVM : Java Virtual Machine(자바 가상 머신)
- JRE : Java Runtime Environment(자바 런타임 환경)
- JAR : Java Archive(파일 포멧)
- JDK : Java Development Kit(자바 개발 도구)
- JNI : Java Native Interface

### [ Feature of JVM ]

**1. Stack 기반 가상 머신**

대표적인 컴퓨터 아키텍처인 인텔 x86 아키텍처나 ARM 아키텍처와 같은 하드웨어가 레지스터 기반으로 동작하는데 비해 JVM은 스택 기반으로 동작.

**2. 심볼릭 레퍼런스**

Primitive data type을 제외한 모든 타입(클래스와 인터페이스)을 명시적인 메모리 주소 기반의 레퍼런스가 아니라 심볼릭 레퍼런스를 통해 참조.

**3. Garbage Collection**

클래스 인스턴스는 사용자 코드에 의해 명시적으로 생성되고, 가비지 컬렉션에 의해 자동으로 파괴.

**4. 기본 자료형을 명확하게 정의하여 플랫폼 독립성 보장**

C/C++ 등의 전통적인 언어는 플랫폼에 따라 int형의 크기가 변함에 비해, JVM은 Primitive data type을 명확하게 정의하여 호환성을 유지하고 플랫폼 독립성을 보장.

**5. 네트워크 바이트 오더**

자바 클래스 파일은 네트워크 바이트 오더를 사용한다. 인텔 x86 아키텍처가 사용하는 리틀 엔디안이나, RISC 계열 아키텍처가 주로 사용하는 빅 엔디안 사이에서 플랫폼 독립성을 유지하려면 고정된 바이트 오더를 유지해야 하므로 네트워크 전송 시에 사용하는 바이트 오더인 네트워크 바이트 오더를 사용한다. 네트워크 바이트 오더는 빅 엔디안이다.

Java는 썬 마이크로시스템즈가 개발했지만 JVM 명세(The Java Virtual Machine Specification)를 따르기만 하면 어떤 벤더든 JVM을 개발하여 제공할 수 있다.(내가 만들어도 된다) 이로 인해 다양한 JVM이 존재한다. 이단아 같은 존재는 안드로이드에 탑재된 Dalvik VM이다. JVM이나 레지스터기반 머신이며 JVM명세를 따르지 않는다. 

### [ Java bytecode ]

Java code를 배포하는 가장 작은 단위는 Java bytecode이다. 'JVM is blah blah~' 이렇게 장황하게 늘어놓는다고 해도 JVM의 본질은 Java bytecode를 실행하는 실행기이다. Java compiler는 C/C++ 등의 컴파일러처럼 고급언어를 CPU 명령으로 바로 변환하는 것이 아니라 java bytecode로 변환한다. 이것이 Java가 플랫폼 독립성을 유지할 수 있는 비결이다. CPU, OS가 다르다 하더라도 JVM만 설치되어 있다면 실행이 가능하다. 또한 컴파일 결과물의 크기가 소스코드의 크기와 크게 다르지 않아 네트워크로 전송하여 실행하기가 쉽다.

클래스 파일 자체는 바이너리 파일이라 사람이 이해하기 힘들다. 이 부분을 보완하기 위해 JVM 벤더들은 javap라는 역어셈블러(disassembler)를 제공한다. javap를 이용한 결과물을 흔히 '자바 어셈블리'라고 부른다. (예를 들어준 코드를 disassembler 한 코드를 보여주는데 이 부분은 생략하고 필요한 내용만 기술하겠다.)

자바 바이트코드에서 메서드를 호출하는 가장 기본적인 명령어의 OpCode(operation code)는 invokevirtual이다. java bytecode에서 메서드를 호출하는 명령어 OpCode는 4가지가 있다.

   - invokeinterface : 인터페이스 메서드 호출
   - invokespecial : 생성자, private 메서드, super class의 메서드 호출
   - invokestatic : static 메서드 호출
   - invokevirtual : 인스턴스 메서드 호출

java bytecode의 명령어는 OpCode와 Operand(피연산자)로 분리할 수 있으며, invokevirtual과 같은 OpCode는 2byte의 Operand를 필요로 한다.

disassambler된 코드를 보면 코드 앞에 숫자가 붙어있다. 바이트 번호이다. java bytecode라 부르는 이유는 여기에 있다고 생각한다. Operand가 필요없는 코드는 1바이트, 필요한 코드는 OpCode + Operand 해서 총 3바이트가 필요하다.

[ Java bytecode에서의 type ]

 Java bytecode | Type | Explanation 
:-------|:------- |:-------
 B | byte | signed byte 
 C | char | Unicode character 
 D | double | double-precision floating-point value 
 F | float | single-precision floating-point value 
 I | int | integer 
 J | long | long integer 
 L\<classname\>; | reference | an instance of class \<classname\> 
 S | short | signed short
 Z | boolean | true of false 
 [ | reference | one array dimension 

[ E.G of Java bytecode ]

Java code | Java bytecode
:---|:---
 double d[][][]; | [[[D
 Object mymethod(int i, double d, Thread t) | (IDLjava/lang/Thread;)Ljava/lang/Object; 


### [ Class File Format ]

<code>
Servlet.service() for servlet jsp threw exception org.apache.jasper.JasperException: Unable to compile class for JSP Generated servlet error:  
The code of method _jspService(HttpServletRequest, HttpServletResponse) is exceeding the 65535 bytes limit"  
</code>


위와 같은 오류 메세지는 web app 서버별로 조금씩 차이는 있지만 65535byte 제한 때문이라는 메시지는 같다. 이 65535byte 제한은 한 메서드의 크기가 65535byte를 넘을 수 없다는 JVM 명세 자체의 제한이다. 더 깊게 보면 이 65535byte 제한이 왜 생겼는지 알 수 있다.

java bytecode에서 일반적으로 사용하는 branch/jump 명령은 "goto"와 "jsr" 두 가지이다. 이들은 모두 2바이트의 signed branch offset을 Operend로 받으므로 최대 65535번 인덱스까지 이동할 수 있다.(아마 2byte를 받으니 2^8 * 2^8이 되어 2^16인것 같다. 1바이트는 최대 256개를 표현 가능)

그러나 java bytecode는 조금 더 여유있는 branch를 지원하기 위해 4byte의 signed branch offset을 받는 "goto_w"와 "jsr_w"를 이미 준비하고 있다.

이들을 이용하면 2^32까지의 인덱스로 branch가 가능해 자바 메서드의 65535byte 제한을 넘을 수 있을 것 같다. 하지만 java class file format의 다른 제한들 때문에 여전히 메서드는 65535byte를 넘을 수 없다. 다른 제한을 보기 위해 class file format을 간단히 보겠다.

Java classfile structure(Naver D2에 표기되었지만 출처는 "The Java Virtual Machine Specification, Second Edition"의 "4.1. The ClassFile Structure" 이다.)

>ClassFile {  
>	u4 magic;  
>	u2 minor_version;  
>	u2 major_version;  
>	u2 constant_pool_count;  
>	cp_info constant_pool[constant_pool_count-1];  
>	u2 access_flags;  
>	u2 this_class;  
>	u2 super_class;  
>	u2 interfaces_count;  
>	u2 interfaces[interfaces_count];  
>	u2 fields_count;  
>	field_info fields[fields_count];  
>	u2 methods_count;  
>	method_info methods[methods_count];  
>	u2 attributes_count;  
>	attribute_info attributes[attributes_count];  
>}


   - magic : classfile의 첫 4byte는 magic number다. 이는 java classfile을 구별하기 위해 미리 지정해 둔 값을 의미하며, 항상 0xCAFEBABE이다. 즉, 어떤 파일의 첫 4byte가 0xCAFEBABE라면 이는 java classfile 이라고 일단 추측할 수 있는 것이다. 

   - minor_version, major_version : 다음 4byte는 class version을 나타낸다. class version을 보고 JDK의 version을 알 수 있다. JDK 1.6은 50.0, JDK 1.5는 49.0이다. JVM은 자신의 버전보다 하위 버전에서 컴파일 된 클래스 파일에 대해선 하위 호환성을 유지해야 한다. 반면 하위버전의 JVM에서 상위 버전의 클래스파일을 실행하면 java.lang.UnsupportedClassVersionError가 발생한다.

   - constant_pool_count, constant_pool[] : classfile의 상수 풀 정보를 기술한다. Runtime Constant Pool에 들어갈 정보가 바로 여기에 있다. JVM은 classfile을 로드하면서 constant_pool 정보를 메서드 영역의 runtime constant pool에 넣는다. 

   - access_flags : 주로 클래스의 modifier 정보, 즉 public, final, abstract or interface 여부를 나타내는 플래그다.

   - this_class, super_class : 각각 this, super에 해당하는 클래스들에 대한 constant_pool 내의 인덱스이다.

   - interfaces_count, interfaces[] : 클래스가 구현한 인터페이스의 개수와 각 인터페이스에 대한 constant_pool 내의 인덱스이다.

   - fields_count, fields[] : 클래스의 필드 개수와 필드 정보이다. 필드 정보에는 필드 이름, 타입 정보, modifier, constant_pool에서의 인덱스 등이 포함된다.

   - methods_count, methods[] : 클래스의 메서드 개수와 메서드 정보이다. 메서드 정보는 메서드 이름, 파라미터 타입과 개수, 반환 타입, modifier, constant_pool에서의 인덱스와 함께 메서드 자체의 실행 코드, 예외 정보 등의 내용도 포함한다.

   - attributes_count, attributes[]: attribute_info 구조체는 다양한 속성을 갖고 있다. field_info나 method_info에서도 attribute_info를 사용한다.

javap -verbose 명령어를 통해 원하는 java bytecode를 분석할 수 있다.

메서드 크기 65535byte 제한은 method_info 구조체의 내용과 관련이 있다. method_info 구조체에는 Code, LineNumberTable, LocalVariableTable attribute가있다. LineNumberTable의 길이에 해당하는 값, LocalVariableTable의 길이에 해당하는 값, Code attribute에 포함된 exception_table의 길이에 해당하는 값은 모두 2byte로 고정되어 있다. 따라서 메서드의 크기는 LineNumberTable, LocalVariableTalbe, exception_table의 길이를 넘지 못하기 때문에 아무리 4byte의 goto_w, jsr_w를 사용해도 2byte를 넘지 못하는 것이다.

많은 사람들이 이런 메서드 크기 제한에 불만을 갖고 있으며, JVM 명세에서도 확장 가능성을 염두해 두었지만 아직까지 개선의 움직임은 없다. classfile의 내용을 거의 그대로 메서드 영역에 로드하는 JVM 명세 특성상, 하위 호환성을 유지하면서 메서드 크기 제한을 늘리도록 구현하기는 상당히 어려울 것이다.

java compiler의 오류 때문에 잘못된 classfile이 생성되면 어떻게 될까? 혹은 네트워크 전송이나 파일 복사 과정 중의 오류로 클래스 파일이 깨질 수도 있을 것이다. 이런 경우에 대비하기 위해 java class loader는 매우 까다로운 검증 결과를 거친다. JVM 명세는 이 과정을 매우 자세하게 서술하고 있다.

### [ JVM Structure ]

Class loader가 compile된 java bytecode를 runtime data areas에 로드하고, execution engine이 java bytecode를 실행한다.

[ Class loader ]

Java는 동적로드, 즉 compile time이 아니라 run time에 클래스를 처음으로 참조할 때 해당 클래스를 로드하고 링크하는 특징이 있다. 이 동적로드를 담당하는 부분이 JVM의 class loader이다. Java class loader의 특징은 아래와 같다.

- 계층 구조(Hierarchical): class loader끼리 부모-자식 관계를 이루어 계층 구조로 생성된다. 최상위 class loader는 bootstrap class loader이다.

- 위임 모델: 계층 구조를 바탕으로 class loader끼리 load를 위임하는 구조로 동작한다. 다시말해 상위 class loader가 우선권을 갖는다. 예를 들어 cl1 - cl2 - cl3의 순서로 class loader의 계층이 존재한다면 cl3가 특정 클래스를 로딩할 때 cl2에게 class loading을 요청하고 cl2는 다시 cl1에게 class loading을 요청한다.

- 가시성(visibility)제한: Child class loader는 Parent class loader의 클래스를 찾을 수 있지만, Parent class loader가 Child class loader를 찾을 순 없다.

- Unload 불가: Class loader는 클래스를 로드할 수 있지만 언로드할 수는 없다. 대신하여 현재 class loader를 삭제하고 아예 새로운 class loader를 생성하는 방법을 사용할 수 있다.


위의 특징은 Java의 inheritance와 비슷하다. 계층구조며, 생성자를 요청하는 모습이며 Parent-Child 간 참조관계까지말이다.

각 class loader는 로드된 클래스들을 보관하는 namespace를 갖는다. 클래스를 로드할 때 이미 로드된 클래스인지 확인하기 위해서 namespace에 보관된 FQCN(Fully Qualified Class Name)을 기준으로 클래스를 찾닌다. 비록 FQCN이 같더라도 namespace가 다르면, 즉 다른 class loader가 로드한 클래이면 다른 클래스로 간주한다.

다음 그림은 class loader 위임 모델을 표현한 것이다. 

<p align="center">
  <img src="http://d2.naver.com/content/images/2015/06/helloworld-1230-2.png" alt="class loader 위임 모델">
</p>

class loader가 클래스 로드를 요청받으면, 클래스 로더 캐시, Parent class loader, 자기 자신의 순서로 해당 클래스가 있는지 확인한다. 즉 이전에 로드된 클래스인지 클래스 로더 캐시를 확인하고, 없을 경우 Parent class loader를 거슬러 올라가며 확인한다. bootstrap class loader까지 확인해도 없으면 요청받은 class loader가 파일 시스템에서 해당 클래스를 찾는다.

- Bootstrap class loader: JVM을 기동할 때 생성되며, Object 클래스들을 비롯하여 Java API들을 로드한다. 다른 class loader와 달리 Java가 아닌 Native Code로 구현되어 있다.

- Extension Class loader: 기본 Java API를 제외한 확장 클래스들을 로드한다. 다양한 보안 확장 기능 등을 여기에서 로드하게 된다. $JAVA_HOME/lib/ext/*.jar에 있는 Java 확장 클래스들이 로드되며 별도의 CLASSPATH에 설정이 안되어 있어도 로딩이 된다.

- System Class Loader: bootstrap class loader와 extension class loader가 JVM 자체의 구성 요소들을 로드하는 것이라 한다면, system class loader는 app의 클래스들을 로드한다고 할 수 있다. 사용자가 지정한 $CLASSPATH내의 클래스들을 로드한다.

- User-Defined Class Loader: app 사용자가 직접 코드상에서 생성해 사용하는 class loader이다.

WAS(Web Application Server)와 같은 프레임워크는 Wep Apps, Enterprize Apps들이 서로 독립적으로 동작하게 하기 위해 사용자 정의 class loader를 사용한다. 즉, 클래스 로더의 위임 모델을 통해 app의 독립성을 보장하는 것이다. 이와 같은 WAS의 class loader 구조는 WAS 벤더마다 조금씩 다른 형태의 계층구조를 사용하고 있다.

Class loader가 아직 로드되지 않은 클래스를 찾으면, 다음 그림과 같은 과정을 거쳐 클래스를 로드하고 링크를 초기화한다.

<p align="center">
  <img src="http://d2.naver.com/content/images/2015/06/helloworld-1230-3.png" alt="class load 단계">
</p>

각 단계를 간단히 설명하면 다음과 같다.

- 로드: 클래스를 파일에서 가져와서 JVM의 메모리에 로드한다.

- 검증(Verifying): 읽은 클래스가 Java Language Specification에 충실하게 구현되어 있는지 검사한다.

- 준비(Preparing): 클래스가 필요로 하는 메모리를 할당하고, 클래스에서 정의된 필드, 메서드, 인터페이스들을 나타내는 데이터구조를 준비한다.

- 분석(Resolving): 클래스의 상수 풀 내 모든 심볼릭 레퍼런스를 다이렉트 레퍼런스로 변경한다.

- 초기화: 클래스 변수들을 적절한 값으로 초기화한다. 즉, static initializer들을 수행하고, static 필드들을 설정된 값으로 초기화 한다.

JVM Specification은 이 작업들에 대해 명시하고 있으나 작업에 따라서 수행 시점은 유연하게 적용할 수 있도록 하고 있다.

- - - - -
**추가내용**

[ Web Logic Class Loader ]
Web Logic Class Loader(이하 WLCL)은 User-Defined Class Loader라고 할 수 있다. 바로 위 Parent class loader는 System class loader이다. WLCL는 크게 세 종류가 있다.

- EJB-JAR Class loader: EJB를 JAR형식으로 배포하면 JAR 1개당 EJB-JAR class loader가 생성된다. 즉, 서로 JAR 간에는 클래스를 참조할 수 없고, System class loader이상의 Parent class loader의 클래스들을 참조할 수 있다. 아니면 필요한 클래스등을 동일한 JAR에 패키징 해야한다. (다른 EJB의 Remote Interface, Home Interface 등)

- WAR Class loader: JSP나 Servlet을 로딩하는 클래스 로더이다. WAR class loader는 위에서 설명한 class loader의 특징을 가지고있지만, 클래스 로딩 우선 순위를 일반적인 Parent class loader보다 WEB-INF/classes와 WEB-INF/lib directory를 우선 로딩할수있도록 하는 점을 주의해야 한다. 설정은 웹로직 관리 웹콘솔에서 PreferWebInfClasses를 true로 설정하면 된다.

- EAR Class loader: EAR을 로딩하는 class loader로서 내부적으로 EJB-JAR class loader와 WAR class loader가 Parent-Child관계로 생성된 다는 것이 특징이다. 즉, Servlet/JSP에서 EJB를 참조하여 호출 가능하다는 의미이다. Servlet/JSP가 로딩된 WAR class loader의 Parent class loader가 EJB를 로딩하는 EJB-JAR class loader이기 때문이다. 기본적으로는 EJB-JAR class loader와 WAR class loader는 서로 계층이 없지만 EAR class loader를 통해 계층을 만들어 서로 다른 WAR Class loader가 공통의 EJB-JAR class loader를 호출할 수 있게 만들었다.

- - - - -
[ Runtime Data Areas ]

<p align="center">
  <img src="http://d2.naver.com/content/images/2015/06/helloworld-1230-4.png" alt="런타임 데이터 영역 구성">
</p>

런타임 데이터 영역은 JVM이라는 프로그램이 운영체제 위에서 실행되면서 할당 받은 메모리 영역이다. 크게 6개의 영역으로 나눌 수 있다. 이중에 PC Register, JVM Stack, Native Method Stack은 Thread마다 하나씩 생성되며 Heap, Method Area, Runtime Constant Pool은 모든 Thread에서 공유해서 사용한다.

- PC Register: 각 Thread마다 하나씩 존재하며 Thread가 시작될 때 생성된다. PC Register는 현재 수행 중인 JVM 명령의 주소를 갖는다.

- JVM Stack: 각 Thread마다 하나씩 존재하며 Thread가 시작될 때 생성된다. Stack frame이라는 구조체를 저장하는 stack으로 JVM은 오직 JVM Stack에 Stack frame을 추가하고 제거하는 동작만 수행한다. 예외 발생시 printStackTrace()등의 메서드로 보여주는 Stack Trace의 각 라인은 하나의 Stack frame을 표현한다.

<p align="center">
  <img src="http://d2.naver.com/content/images/2015/06/helloworld-1230-5.png" alt="JVM Stack 구성">
</p>

   * Stack Frame: JVM 내에서 메서드가 수행될 때마다 하나의 Stack frame이 생성되어 해당 Thread의 JVM Stack에 push되고 메서드가 종료되면 Stack frame이 제거된다. 각 Stack frame은 Local Variable Array, Operend Stack, 현재 실행 중인 메서드가 속한 클래스의 runtime constant pool에 대한 reference를 갖는다. Local Variable Array, Oprend Stack의 크기는 compile시에 결정되기 때문에 Stack frame의 크기도 메서드에 따라 크기가 고정된다.

   * Local Variable Array: 0부터 시작하는 인덱스를 가진 배열이다. 0은 메서드가 속한 클래스 인스턴스의 this reference이고, 1부터 메서드에 전달된 파라미터들이 저장되며 메서드 파라미터 이후에는 메서드의 지역변수들이 저장된다.

   * Operend Stack: 메서드의 실제 작업 공간이다. 각 메서드는 Operend Stack과 Local Variable Array 사이에서 데이터를 교환하고, 다른 메서드 호출 결과를 push하거나 pop한다. Operend Stack공간이 얼마나 필요한지는 compile할 때 결정할 수 있으므로, Oprend Stack의 크기도 compile시에 결정된다.


- Native Method Stack: Java 외의 언어로 작성된 Native Code를 위한 Stack이다. 즉 JNI를 통해 호출하는 C/C++ 등의 코드를 수행하기 위한 Stack으로 언어에 맞게 C Stack이나 C++ Stack이 생성된다.

- Method Area: 모든 Thread가 공유하는 영역으로 JVM이 시작될 때 생성된다. JVM이 읽어들인 각각의 클래스와 인터페이스에 대한 runtime constant pool, 필드와 메서드 정보, Static 변수, 베서드의 바이트코드 등을 보관한다. 이 영역은 JVM 벤더마다 다양한 형태로 구현할 수 있으며, HotSpot JVM에서는 흔히 Permanent Area  혹은 Permanent Generation(PermGen)이라고 불린다. 메서드 부분의 GC는 벤더의 선택사항이다.

- Runtime Constant Pool: Class File Format에서 Constant_pool 테이블에 해당하는 영역이다. 메서드 영역에 포함되는 영역이지만, JVM동작에서 가장 핵심적인 역할을 수행하는 곳이다. 때문에 JVM 명세에서도 따로 중요하게 기술한다. 각 클래스와 인터페이스의 상수뿐만 아니라 메서드와 필드에 대한 모든 래퍼런스까지 담고 있는 테이블이다. 즉, 어떤 메서드나 필드를 참조할 때 JVM은 runtime constant pool을 통해 해당 메서드나 필드의 실제 메모리상 주소를 찾아서 참조한다.

- Heap: 인스턴스 또는 객체를 저장하는 공간으로 GC의 대상이다. JVM성능 등의 이슈에서 가장 많이 언급되는 공간이다. heap 구현 방식이나 GC 방법 등은 JVM 벤더의 재량이다.

다음으로는 간단히 disassambler된 코드를 살펴보겠다.

```
public void add(java.lang.String);  
Code:  
0: aload_0  
1: getfield #15; //Field admin:Lcom/nhn/user/UserAdmin;  
4: aload_1  
5: invokevirtual #23; //Method com/nhn/user/UserAdmin.addUser:(Ljava/lang/String;)Lcom/nhn/user/User;  
8: pop  
9: return  
```

이 코드의 각 줄을 간단히 해석하면 다음과 같다.

- aload_0: Local Variable Array의 0번 인덱스 내용을 Operend Stack에 추가한다. LVA의 0번 인덱스는 언제나 this, 즉 현재 클래스 인스턴스에 대한 reference이다.

- getfield #15: 현재 Class constant pool에서 15번 인덱스 내용을 Operend Stack에 추가한다. 즉, UserAdmin필드가 추가된다. 이처럼 내용이 class instance일 경우 reference가 추가된다.

- aload_1: LVA의 1번 인덱스 내용을 Operend Stack에 추가한다. LVA의 1번 인덱스부터는 메서드 파라미터이다. 

- invokevirtual #23: 현재 Class constant pool에서 23번 인덱스 내용에 해당하는 메서드를 호출한다. 이때 앞서 getfield로 추가한 ref와 aload_1로 추가한 파라미터를 모두 꺼내서 호출하는 메서드에 전달한다. 메서드 호출이 완료되면 그 반환값을 Operend Stack에 추가한다.

- pop: invokevirtual로 호출한 결과 반환값을 Operend Stack에서 꺼낸다. 예전 lib로 compile한 코드에서는 이 부분이 없음을 확인할 수 있다. 즉 예전 lib은 반환값이 없으므로 반환값을 Stack에서 꺼낼 필요가 없었다.

- return: 메서드를 완료한다.

이 과정을 이해하기 쉽도록 그림으로 그리면 다음과 같다.

<p align="center">
  <img src="http://d2.naver.com/content/images/2015/06/helloworld-1230-6-1.png" alt="runtime data area에 로드된 java bytecode의 예">
</p>

참고로 이 메서드에서는 LVA이 변경되지 않았으므로 위 그림은 Operend Stack변경만 표시했다. 그러나 대부분의 경우 LVA도 함께 변경된다. LVA와 Operend Stack간의 데이터 전달은 수많은 load(aload, iload 등) 및 store(asotre, istore 등) 명령어로 이뤄진다.

실제 동작에서는 각각의 클래스 인스턴스들이 힙에 할당되고, User, UserAdmin, String 등의 클래스 정보가 메서드 영역에 보관될 것이다.

[ Execution engine ]

클래스 로더를 통해 JVM 내의 runtime data area에 배치된 bytecode는 실행 엔진에 의해 실행된다. 실행 엔진은 java bytecode를 명령어 단위로 읽어서 실행한다. CPU가 기계명령어를 하나씩 수행하는 것과 비슷한다. bytecode의 각 명령어는 1byte의 OpCode와 추가 Operend으로 이루어져 있으며, 실행 엔진은 하나의 OpCode를 가져와 Operend와 함께 작업을 수행한 다음, 다음 OpCode를 수행하는 식으로 동작한다.

그런데 bytecode는 기계가 바로 수행할 수 있는 언어보다는 비교적 인간이 보기 편하게 기술된 것이다. 그래서 execution engine은 이를 실제로 JVM 내부에서 기계가 실행할 수 있는 형태로 변경하며, 그 방식은 다음 두가지가 있다.

- interpreter: bytecode를 하나씩 읽어서 해석하고 실행한다. 하나씩 해석하고 실행하기 때문에 bytecode 하나하나의 해석은 빠른대신 인터프리팅 결과의 실행은 느리다는 단점을 가지고 있다. 즉, bytecode라는 언어는 기본적으로 인터프리터 방식으로 동작한다.

- JIT(Just-In-Time) Compiler: 인터프리터의 단점을 보완하기 위해 도입된 방식이다. 인터프리터 방식으로 실행하다가 적절한 시점에 bytecode 전체를 컴파일하여 Native code로 변경하고 이후에는 해당 메서드를 더 이상 인터프리팅하지 않고 Native code로 직접 실행하는 방식이다. 하나씩 인터프리팅하는 것보다 빠르고 Native code는 캐시에 보관하기 때문에 한 번 컴파일된 코드는 계속 빠르게 수행되게 된다.

JIT Compiler가 컴파일 하는 과정은 인터프리팅하는 것보다 훨씬 오래 걸리므로, 만약 한 번만 실행되는 코드라면 컴파일 하지 않고 인터프리팅하는 것이 훨씬 유리하다. 따라서, JIT 컴파일러를 사용하는 JVM들은 내부적으로 해당 메서드가 얼마나 자주 수행되는지 체크하고, 일정 정도를 넘을 때에만 컴파일을 수행한다.

실행엔진이 어떻게 동작하는지에 대해서는 JVM 명세에 규정되지 않았기 때문에 JVM 벤더들은 다양한 기법으로 실행 엔진을 향상시키고 다양한 방식의 JIT 컴파일러를 도입하고 있다.

대부분의 JIT Compiler는 다음과 같은 형태로 동작한다.

<p align="center">
  <img src="http://d2.naver.com/content/images/2015/06/helloworld-1230-8.png" alt="JIT Compiler">
</p>

JIT Compiler는 bytecode를 일단 중간 단계의 표현인 IR(Intermediate Representation)로 변환하여 최적화를 수행하고 그 다음에 Native Code를 생성한다.

Oracle HotSpot VM은 핫스팟 컴파일러라고 불리는 JIT Compiler를 사용한다. 핫스팟이라고 불리는 이유는 내부적으로 프로파일링을 통해 가장 컴파일이 필요한부분, 즉 'HotSpot'을 찾아낸 다음 이 핫스팟을 Native Code로 컴파일하기 때문이다. HotSpot VM은 한번 컴파일된 bytecode라도 해당 메서드가 더 이상 자주 불리지 않는다면 캐시에서 Native code를 덜어내고 다시 인터프리터 모드로 동작한다. 핫스팟 VM은 Server VM과 Client VM으로 나뉘어 있고, 각각 다른 JIT 컴파일러를 사용한다.

<p align="center">
  <img src="http://d2.naver.com/content/images/2015/06/helloworld-1230-9.png" alt="HotSpot Client VM and Server VM">
</p>

둘은 동일한 런타임을 사용하지만 위 그림과 같이 다른 JIT Compiler를 사용한다. 

자바 성능 개선의 많은 부분은 바로 이 실행 엔진을 개선하여 이뤄지고 있다. JIT Compiler는 물론 다양한 최적화 기법을 도입하여 JVM의 성능은 계속 향상되고 있다. 초창기 JVM과 지금의 JVM은 이 실행 엔진에서 큰 차이가 있다.

### [ 마치며 ]

자바라는 도구를 잘 사용하기 위해서 도구를 어떻게 만들었는지 자세히 살펴볼 필요까지는 없다. 실제로 많은 자바 개발자들이 JVM을 깊게 이해하지 않고도 훌륭한 app과 lib를 만들어내고 있다. 그렇지만 JVM을 이해하면 자바를 더 깊게 이해할 수 있고, 앞에서 본 사례와 같은 문제를 해결할 때에도 도움이 될 것이다.

JVM 내부 구조에 대해서 보다 자세히 알고 싶은 독자가 있다면 "Java Performance Fundamental"(김한도, 서울, 엑셈, 2009)라는 책을 참고하길 바란다. 

(Naver D2의 박세훈님의 글을 거의 복붙 했으며 필요한 부분은 아래 페이지에서 참고해서 함께 기술했다)

[Ref : Naver D2](http://d2.naver.com/helloworld/1230)  
[Ref : 이상현 개발자 블로그](https://sangdol.github.io/blog/2012/08/19/introduction-to-java-bytecode/)  
[Ref : IT 이야기](http://blueyikim.tistory.com/37)  