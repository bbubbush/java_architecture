package com.github.bbubbush.part3;

public class WriteEx {
	public static void main(String[] args) {
		/*
		 * write() �޼���� ȭ�� ��� �� ���ۿ� ��´�. ���� System.out.flush() ȣ���� ���� ���۸� ������Ѵ�.
		 * �� ������ flush�� �Ͼ�� ������ ���ۿ� ���� ������ �̸� ������� �ʴ´�.
		 * �׷��� ������ System.out.write(65)�� �ڵ常 ������ ��� �ƹ��� ����� ���� �ʴ´�.
		 * */
		
		System.out.write(65);	// buffer�� ��⸸ ��
		System.out.flush();	// buffer�� �ִ� ���� ���
		System.out.println();
		byte[] by = {'J', 'A', 'V', 'A'};
		System.out.write(by, 0, 1);		// ����Ʈ �迭 ����� ��쿡�� auto flush����� ����
		System.out.println();
		
	}
}
