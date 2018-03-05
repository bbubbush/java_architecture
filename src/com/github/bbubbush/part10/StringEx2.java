package com.github.bbubbush.part10;

public class StringEx2 {
	public static void main(String[] args) {
		/* String 객체의 불변성(immutability)
		 * 한번 생성되면 그 내용을 바꿀 수 없는 것을 불변성이라고 한다.
		 * 따라서 String constant pool에 계속 남아 있게 되므로(Garbage) 메모리 낭비가 발생한다.
		 * 또한 String constant pool은 GC가 동작하지 않고, 지속적인 객체 생성이 성능저하로 이어진다.
		 * 따라서 문자열을 계속 더하는 경우 StringBuffer 클래스를 사용하는 것이 바람직하다.
		 * String 객체의 doc을 보면 대부분 return 값이 new String으로 새로운 객체를 생성한다.
		 * 
		 * 하지만 JDK 1.5버전 이후에는 String 객체를 선언했어도, StringBuilder로 치환시켜 컴파일을 하기 때문에 성능적인 차이가 거의 없다.
		 * */
		String str = new String();	
		str += "Hello";				// str = new StringBuffer("").append("Hello").toString(); 
		str += " Java";				// str = new StringBuffer("Hello").append(" Java").toString();
		System.out.println("str = " + str);
		
		// append 되는 문자열 역시 String 객체이므로 총 5개의 String 객체가 생성된다.
		
	}
}
