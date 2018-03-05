package com.github.bbubbush.part10;

public class StringEx1 {
	public static void main(String[] args) {
		/* String Class
		 * 객체 자료형이지만 기본 자료형처럼 사용함.
		 * 아래 String의 성질에 대해서는 기본자료형에 대해 설명할 때 자세히 함.
		 * */
		String s1 = "TEST";
		String s2 = "TEST";
		
		if ( s1 == s2 ) {
			System.out.println("s1 == s2");
		}else{
			System.out.println("s1 != s2");
		}
		
		String s3 = new String("String");
		String s4 = new String("String");
		
		if ( s3 == s4 ) {
			System.out.println("s3 == s4");
		}else{
			System.out.println("s3 != s4");
		}
		
		
		
	}
}
