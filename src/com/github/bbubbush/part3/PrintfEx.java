package com.github.bbubbush.part3;

public class PrintfEx {
	public static void main(String[] args) {
		/*
		 * C���� ����ϴ� ����. Python������ �����ϴ� �����ϸ� �� �����ϰ� ����� �� �ִ�.
		 * %n�� \n�� ���������� ������ ������ �Ѵ�.
		 * */
		int a = 100;
		char b = 'A';
		float c = 12.346f;
		String d = "�̻���";
		System.out.printf("a = %d �Դϴ�.%n", a);
		System.out.printf("b = %c �Դϴ�.\n", b);
		System.out.printf("c = %f �Դϴ�.%n", c);
		System.out.printf("d = %s �Դϴ�.", d);
		
	}
}
