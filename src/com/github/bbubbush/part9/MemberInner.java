package com.github.bbubbush.part9;

public class MemberInner {
	int a = 10;
	private int b = 100;
	
	static int c = 200;
	
	class Inner{
		public void printData(){
			System.out.println("int a : " + a);
			System.out.println("private int b : " + b);	// private ������ ���� ����
			System.out.println("static int c : " + c);
		}
	}
	
	
	public static void main(String[] args) {
		/* Member Inner Class
		 * Ư���� �κ��� MemberInner �ȿ� ������ private������ Inner �ȿ��� ȣ���� �����ϴٴ� ���̴�.
		 * �̷����� �̳�Ŭ������ �Ŵ��� �޼���, Ȥ�� �Ŵ��� ���� ������ �������� Ȯ��ȴٰ� �����غ� �� �ִ�. 
		 * */
		MemberInner.Inner i = new MemberInner().new Inner();
		i.printData();
	}
}
