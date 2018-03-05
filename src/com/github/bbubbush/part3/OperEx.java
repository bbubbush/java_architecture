package com.github.bbubbush.part3;

public class OperEx {
	public static void main(String[] args) {
		/*
		 * ���׿�����: !, ~, +/-, ++/--, (cast) 
		 * ������������ ������������ ��������� ���̰� ũ��. 
		 * */
		int x = 10;
		int y = ++x;		// ���Կ����ں��� ���������������ڰ� �� �켱������ ���� ������ ���·� �Էµȴ�.
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		x = 10;
		y = x++;			// ���������������ڴ� �̹� ������ �̷���� �Ŀ� ���������� �����Ѵ�.
		System.out.println("x1 = " + x);
		System.out.println("y1 = " + y);
		
		/*
		 * ���������: +, -, *, /, % 
		 * ����� �⺻Ÿ���� int�̸�, int���� ū �ڷ����� ��� ū �ڷ����� ����.
		 * */
		short a, b;
		a = b = 10;
		Object obj = a;
		System.out.println(obj.getClass());
		obj = b;
		System.out.println(obj.getClass());
		obj = a + b;
		System.out.println(obj.getClass());
		System.out.println();
		//short c = a + b;		 short������ ���������� return type�� int
		
		/*
		 * ����Ʈ ����: ������ 2�� ��Ʈ�� ���� �� Ư�� ��Ʈ ����ŭ �̵����� ���ϴ� �κ��� ��Ʈ�����͸� ���� ������.
		 * <<, >>, >>>�� �ִ�. ����������, ������������� ���� �°� ����ϸ� �ȴ�.(unsigned�� ���� Ȱ���� �ٸ�)
		 * */
		int i = -10;
		int j = i >>> 2;
		System.out.println("i = " + i + " j = " + j);
		i = 1;
		for (int j2 = 1; j2 <= 10; j2++) {
			System.out.println(i << j2);
		}
		
		/*
		 * ��Ʈ������: &, |, ^
		 * and, or, exclusive or������ �� �� �ִ�. �� Ȱ���ϸ� �������� Ȱ�뵵�� ����.
		 * */
		System.out.println(14 & 1);		// 1110 & 0001
		System.out.println(14 | 1);		// 1110 | 0001
		System.out.println(14 ^ 1);		// 1110 ^ 0001
		
		/*
		 * ��������: &&, || 
		 * ��� ���� ���µ� short circuit�� �����ϱ� ���� ������.
		 * */
		x = 1;
		y = 1;
		
		if( (++x == 2) || (++y == 2) ){		//  A || B�� ���, A�� ture�� B�� �������� �ʰ� �Ѿ��.
			System.out.println("x = " + x + ", y = " + y);
		}
		
		if( (++x == 2) && (++y == 2) ){		//  A && B�� ���, A�� false�� B�� �������� �ʰ� �Ѿ��.
			System.out.println("x = " + x + ", y = " + y);
		}
		System.out.println("x = " + x + ", y = " + y);
		
		/*
		 * ������ ������ 0���� ������ ArithmeticException�� �߻������� �Ҽ��� �Ҽ��� 0���� ������ infinity�� ���.
		 * */
		float f1 = 10;
		float f2 = 0;
		System.out.println(f1/f2);
		//System.out.println(1/0);
	}
}
