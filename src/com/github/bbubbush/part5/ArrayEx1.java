package com.github.bbubbush.part5;

public class ArrayEx1 {
	public static void main(String[] args) {
		/* Array ����
		 * �迭�� �ʱ�ȭ �� ����, ��� ��� ��
		 * main method�� String�迭�� �Ű������� ����Ѵ�. args�� ���� �ֱ� ���ؼ� java FileName arg1 arg2... ó�� �������� �����ؼ� ������ �ȴ�.
		 * �迭�� ref�� 4byte�� ������ ����Ѵ�.
		 * */
		
		char[] ch;
		ch = new char[4];
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 'A';
		
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		System.out.println();
		
		
		for (char c : ch) {
			System.out.println(c);
		}
	}
}
