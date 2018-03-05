package com.github.bbubbush.part10;

public class StringBufferEx2 {
	public static void main(String[] args) {
		/* StringBuffer class
		 * 버퍼의 용량은 기본적으로 16이며, 생성자에 전달된 문자열의 길이만큼 더하게 된다.
		 * 예를들어 길이가 10인 문자열을 생성할 경우 10 + 16이 되어 버퍼의 크기는 26이 된다.
		 * 일반적으로 길이가 추가되면 버퍼의 크기도 늘어나게 된다.
		 * 단, 한번 늘어난 버퍼의 크기는 삭제해도 다시 줄어들지 않는다.
		 * */
		StringBuffer sb = new StringBuffer("1234567890");
		System.out.println("sb.capacity() >> " + sb.capacity());
		System.out.println("sb.length() >> " + sb.length());
		
		sb.append("ABCDEFGHIJKLMNOPQ");
		System.out.println("sb.capacity() >> " + sb.capacity());
		System.out.println("sb.length() >> " + sb.length());
		
		sb.delete(1, 20);
		System.out.println("sb.capacity() >> " + sb.capacity());
		System.out.println("sb.length() >> " + sb.length());
		
		
		
	}
}
