# 자바 소개 및 설치(인데 설치부분은 생략)

### [ Features of java ]
**1. Object Oriented Programming**

   Basic concepts of OOPs are:  
      - Object  
      - Class  
      - Inheritance  
      - Polymorshism  
      - Abstraction  
      - Encapsulation  

**2. Platform-independent**

Java code is compiled by the compiler and converted into bytecode. This bytecode is a platform-independent code because it can be run on multiple platforms i.e. Write Once and Run Anywhere(WORA).


**3. Garbage Collection**

GC is a form of automatic memory management. The GC attempts to reclaim garbage, or memory occupied by objects that are no longer in use by the program.

**4. Multi-Thread**

Multithreading is the ability of a central processing unit(CPU) or a single core in a mulit-core processor to execute muliple processes or threads concurrently, appropriately supported by the oprating system.

(자주 접하는 범위라 일부러 영어를 써서 정의를 적어봤다. 앞으로도 많이 접하게 될 기본적인 내용이니깐 익숙해지는 것이 좋다.)

### [ Process ]

큰 흐름은 .java -> .class -> class loading -> execution engine -> runtime data areas


**1. java파일을 java compiler가 class파일(바이트 코드)로 변환**

**2. cloass loder를 통해 byte code를 JVM에 로딩**

**3. execution engine을 통해 byte code를 해석**

**4. 해석된 byte code를 runtime data areas에 배치하여 동작**

[href : 글쓰는 개발자](http://asfirstalways.tistory.com/158)