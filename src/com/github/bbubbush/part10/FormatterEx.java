package com.github.bbubbush.part10;

import java.util.Formatter;

public class FormatterEx {
	public static void main(String[] args) {
		/* Formatter class
		 * ��������� �����Ͽ� ���� ���¸� �����ϴ� Ŭ����
		 * ����, ���ڿ�, ��¥ �� �ð��� ���� Ư¡�� ������� ����
		 * 
		 * �⺻����
		 * 1) �Ϲ� ����, �׸��� ���� ������ ���� ���˱�Ģ
		 * 		%[argument_index$][flags][width][precision]conversion
		 * 2) ��¥/�ð����� ǥ���ϵ��� ���� ���鿡 ���� ���� ��Ģ
		 * 		%[argument_index$][flags][width]conversion
		 * 3) ���ڵ鿡 �������� ���� ���� ��Ģ
		 * 		%[flags][width]conversion
		 * 
		 * �����ؼ� ���������� ���� �̷��� �ܿ��� ���⺸�ٴ� printf�� ó�� ����ϴ� ��찡 �������ε� �ʹ�.
		 * */
		
		Formatter f = new Formatter();
		f.format("%1$b, %3$h, %2$5s", false, 500, 'A');		// 'A'�� ASCII value�� 65, ���� 16������ ��ȯ�ϸ� 41�� ��.
		System.out.println(f.toString());
	}
}
