package com.github.bbubbush.part8;

interface InterEx{
	static final int A = 100;
	int B = 200;		// static final�� ���� �ʾƵ� �ڵ����� �ٿ��ش�.
	abstract int getA();
	int getB();			// abstract�� ������ �ʾƵ� �ڵ����� �ٿ��ش�.
}


public class InterfaceEx implements InterEx{
	@Override
	public int getA() {
		// TODO Auto-generated method stub
		return A;
	}
	
	@Override
	public int getB() {
		// TODO Auto-generated method stub
		return A;
	}
	
	public static void main(String[] args) {
		/* Interface �⺻
		 * abstract method�� static constant�� ���� �����ϴ�.
		 * interface�� static�� final, abstract�� �����ص� �ڵ����� ���Ǹ� ���ش�.
		 * ��, ������ ����ƽ ����� �߻�޼���θ� �����Ǿ��ִ�.
		 * */
		
		InterfaceEx i = new InterfaceEx();
		System.out.println(i.getA());
		System.out.println(i.getB());
		
		
	}
}
