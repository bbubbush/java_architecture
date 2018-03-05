package com.github.bbubbush.part7;

class ParenEx{
	int foo = 5;
	
	public int getNumber(int a){
		return a + 1;
	}
}

public class SonEx extends ParenEx {
	int foo = 7;
	public int getNumber(int a){
		return a + 2;
	}
	
	public static void main(String[] args) {
		/* Polymorphism �⺻
		 * �θ��� �̸����� �ڽİ�ü�� ����ϴ� ���� ���Ѵ�.
		 * �޼���� �ڽ�, ����� �θ��� ���� ����Ѵ�.
		 * �޼��尡 �ڽ��� ���� ����ϴ� ���� �������̵� �����̶� �����ȴ�.
		 * �����ϴ´뵵 ����� �����̴�. ���� ����ؼ� �ͼ����� �ʿ䰡 �ִ�.
		 * */
		ParenEx p = new SonEx();
		System.out.println(p.getNumber(0));
		System.out.println(p.foo);
	}
}
