package com.github.bbubbush.part10;

public class StringEx1 {
	public static void main(String[] args) {
		/* String Class
		 * ��ü �ڷ��������� �⺻ �ڷ���ó�� �����.
		 * �Ʒ� String�� ������ ���ؼ��� �⺻�ڷ����� ���� ������ �� �ڼ��� ��.
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
