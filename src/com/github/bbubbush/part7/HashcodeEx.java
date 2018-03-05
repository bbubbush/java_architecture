package com.github.bbubbush.part7;

public class HashcodeEx {
	public static void main(String[] args) {
		/* Hashcode와 주소값
		 * 예제는 간단히 String과 객체, 각각이 주소와 해쉬코드를 비교했을때 어떤 결과를 갖는지 알려주는 것 이었다.
		 * 그러나 그 안의 문제는 그렇게 가볍지 않다. String은 클래스이기에 당연히 객체라고 생각했지만 실상은 좀더 심오했다.
		 * 만약 가정대로 String이 객체라면 객체의 비교와 결과가 같아야한다.
		 * 하지만 String은 분명 객체와는 다른 결과값이 나왔다.
		 * 우선 disassemble한 바이트코드를 살펴보면 new 키워드를 사용한 경우 java.lang.String 클래스를 호출한다.
		 * 반면 문자열 리터럴로 초기화한 경우에는 별도의 클래스호출 없이 바로 입력된다.
		 * 작은 차이지만 크게 느껴질 수 있다. String은 특이한 객체라 문자열 리터럴로 활용할 경우 String constant pool에 저장된다.
		 * 그래서 같은 값을 가리키는 String변수가 존재하면 같은 메모리주소를 공유하게 된다.
		 * new를 사용할 경우 heap영역에 생성되어 관리되기 때문에 문자열리터럴과는 다른 결과값을 같게 된다.
		 * 
		 * 하지만 아래 코드를 보면 문자열 리터럴이든, new를 활용해 객체를 생성했던 간에 동일한 해쉬코드를 갖는다.
		 * 결국 해쉬코드 자체 내에 정의된 문법에 따라 값을 산출해 리턴해주는 것을 확인했다. 메모리 위치에 상관없이 말이다.
		 * */
		// String 타입의 해쉬코드
		String str = new String("String");
		String str2 = new String("String");
		String str3 = "String";
		String str4 = "String";
		
		System.out.println("str==str2 >>> " + (str==str2));
		System.out.println("str3==str4 >>> " + (str3==str4));
		System.out.println("str.hashCode()==str2.hashCode() >>> " + (str.hashCode()==str2.hashCode()));
		System.out.println(str.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		System.out.println();
		
		str3 += "3";
		str4 += "4";
		
		System.out.println(str.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		System.out.println();
		
		// 객체의 해쉬코드
		HashcodeEx h = new HashcodeEx();
		HashcodeEx h2 = new HashcodeEx();
		System.out.println(h==h2);
		System.out.println(h.hashCode()==h2.hashCode());
		System.out.println(h.hashCode());
		System.out.println(h2.hashCode());
		

		
		
	}
}
