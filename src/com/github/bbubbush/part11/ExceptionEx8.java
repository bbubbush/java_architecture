package com.github.bbubbush.part11;

public class ExceptionEx8 {
	private static void test() throws Exception{
		System.out.println(6/0);		// ���ܰ� �߻������� ���� ó������ �ʰ� Exception���� ����
	}
	public static void main(String[] args) {
		/* Throws
		 * ����ó���� �ٸ� ��ü���� �����ϴ� ���.
		 * ��Ȳ�� ���� ���������� �߻��� �� �ִ� ���ܸ� �� ������ ó���� ���� ������ ���信 �־� �����ϰ� ������ ���� ����.
		 * ��Ȳ�� �°� ����ϴ� ���� �߿�. 
		 * */
		try {
			test();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
