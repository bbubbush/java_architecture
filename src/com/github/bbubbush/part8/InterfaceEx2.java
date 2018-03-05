package com.github.bbubbush.part8;

interface Inter1{
	abstract public int getA();
}

interface Inter2{
	abstract public int getA();
	abstract public int getB();
}

interface Inter3 extends Inter1, Inter2{
	abstract public int getData();
}

public class InterfaceEx2 implements Inter3 {
	int a = 100;
	
	@Override
	public int getA() {
		// TODO Auto-generated method stub
		return a;
	}
	@Override
	public int getB() {
		// TODO Auto-generated method stub
		return -1;
	}
	
	@Override
	public int getData() {
		// TODO Auto-generated method stub
		return a + 10;
	}
	
	public static void main(String[] args) {
		/* Interface�� ���߻��
		 * �������̽����� ����� �ᱹ �߻�޼���� ����ƽ����� ������ ������ ��, �̸� ���������� �����ؾ��ϴ� �Ϲ�Ŭ�������� ��� å���� �����ȴ�.
		 * ���� �������̽��� ���߻���� �����ϴ�.
		 * ���� �������� ��Ģ�� ���� ���� �������̽� ��ü�� ���� �ڽ��� ������ ��ü�� ������ ����� �� �ִ�.
		 * 
		 * �߻�Ŭ������ �������̽��� �������� �������� �����غ��� ����.
		 * */
		InterfaceEx2 i = new InterfaceEx2();
		
		Inter1 i1 = i;
		Inter2 i2 = i;
		Inter3 i3 = i;
		
		System.out.println(i1.getA());
		System.out.println(i2.getB());
		System.out.println(i3.getData());
	}
}
