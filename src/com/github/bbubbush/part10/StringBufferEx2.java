package com.github.bbubbush.part10;

public class StringBufferEx2 {
	public static void main(String[] args) {
		/* StringBuffer class
		 * ������ �뷮�� �⺻������ 16�̸�, �����ڿ� ���޵� ���ڿ��� ���̸�ŭ ���ϰ� �ȴ�.
		 * ������� ���̰� 10�� ���ڿ��� ������ ��� 10 + 16�� �Ǿ� ������ ũ��� 26�� �ȴ�.
		 * �Ϲ������� ���̰� �߰��Ǹ� ������ ũ�⵵ �þ�� �ȴ�.
		 * ��, �ѹ� �þ ������ ũ��� �����ص� �ٽ� �پ���� �ʴ´�.
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
