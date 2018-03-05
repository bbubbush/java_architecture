package com.github.bbubbush.part6;

public class OverloadingEx1 {
	// non method overloading
	public void intLength(int i){
		String s = i + "";
		System.out.println("�Է��� ���� ���̴� " + s.length());
	}
	
	public void floatLength(float f){
		String s = f + "";
		System.out.println("�Է��� ���� ���̴� " + s.length());
	}
	
	public void stringLength(String s){
		System.out.println("�Է��� ���� ���̴� " + s.length());
	}
	
	// method overloading
	public void getLength(int i){
		String s = i + "";
		System.out.println("�Է��� ���� ���̴� " + s.length());
	}
	public void getLength(float i){
		String s = i + "";
		System.out.println("�Է��� ���� ���̴� " + s.length());
	}
	public void getLength(String s){
		System.out.println("�Է��� ���� ���̴� " + s.length());
	}
	
	// Generic
	public <T> void getGenericLength(T var){
		String s = var + "";
		System.out.println("�Է��� ���� ���̴� " + s.length());
	}
	
	public static void main(String[] args) {
		/* �޼��� �����ε�
		 * �ϳ��� Ŭ�������� ���� �̸��� ���� �޼��尡 ���� �� ���ǵǴ� ���̴�.
		 * ����Ÿ���̳� �Ű������� ����, �Ű������� Ÿ���� �޶�� �Ѵ�.
		 * �Ű������� �̸��� �ٸ��ٰ� �����ε��� ���� �ʴ´�.
		 * �ٸ� ����Ÿ���� ������ ���ϸ� �̰��� ���� �ٸ����� �޾Ƶ�� �����ε��� �ȴ�.
		 * 
		 * Generic�� ���� �����ε��� ��ü�� �� ������ ����� ��Ȯ�� Ȱ�뿡 �־� ��õ�ϴ� ����� �ƴϴ�. 
		 * ������ ��ɸ� ����� ��쿡�� �����ϰ� ����ϱ� ����.
		 * */
		OverloadingEx1 o = new OverloadingEx1();
		// non method overloading
		o.intLength(1000);
		o.floatLength(3.14f);
		o.stringLength("10000");
		System.out.println();
		
		// method overloading
		o.getLength(1000);
		o.getLength(3.14f);
		o.getLength("10000");
		System.out.println();
		
		// use generic
		o.getGenericLength(1000);
		o.getGenericLength(3.14f);
		o.getGenericLength("10000");
	}
}
