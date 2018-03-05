package com.github.bbubbush.part9;



public class StaticInner {
	int a = 10;
	private int b = 100;
	static int c = 200;
	static class Inner{
		static int d = 1000;
		public void printData(){
//			System.out.println("int a : " + a);			non static �ʵ带 ����� �� ����
//			System.out.println("private int b : " + b);
			System.out.println("static int c : " + c);
		}
	}
	
	
	public static void main(String[] args) {
		/* Static Inner Class
		 * �̳�Ŭ������ ����ƽ���� ������ ���̴�.
		 * ��¿�� ���� �̳�Ŭ���� ���� ����ƽ������ ����ƽ�޼��带 �����ؾ��� ��쿡 ����Ѵ�.
		 * ����ƽ�� Ŭ�����ε��ÿ� static memory�� �ö󰡱� �ν��Ͻ��� ������ �� heap memory�� �ö󰡴� non static �ʵ带 ����� �� ����.
		 * �Ʒ��� static inner class�� ���� �ٸ� ������� ȣ���ϴ� ����̴�. 
		 * */
		System.out.println(Inner.d);
		System.out.println(StaticInner.Inner.d);
		StaticInner.Inner i = new Inner();
		i.printData();
	}
}
