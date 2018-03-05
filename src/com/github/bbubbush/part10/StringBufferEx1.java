package com.github.bbubbush.part10;

public class StringBufferEx1 {
	public static void main(String[] args) {
		/* StringBuffer
		 * 직접 변경이 가능한 클래스라 문자열의 변경이 자주 일어날 경우 사용하기에 적합하다.
		 * 아래 코드는 기본적인 문자열 조작 기능과 관련된 메서드를 기술했다.
		 * buffer의 초기 크기는 16이다.
		 * */
		StringBuffer sb = new StringBuffer("JAVA");
		sb.append("1.6");
		System.out.println(sb + " " + sb.capacity());
		
		sb.delete(3,  5);
		System.out.println(sb + " " + sb.capacity());
		
		sb.insert(3,  "A1");
		System.out.println(sb + " " + sb.capacity());
		
		sb.replace(4,  7,  "일점육");
		System.out.println(sb + " " + sb.capacity());
		
		sb.reverse();
		System.out.println(sb + " " + sb.capacity());
		
		
		
	}
}
