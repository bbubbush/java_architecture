package com.github.bbubbush.part7;

class Super{
	int a = 5;
	public Super(int x) {
		// TODO Auto-generated constructor stub
		System.out.println("�θ�Ŭ���� ������ : " + x);
	}
}

class Sub extends Super{
	int a =10;
	public Sub() {
		// TODO Auto-generated constructor stub
		super(5);
		System.out.println("�ڽ�Ŭ���� ������");
		
	}
	
	void test(){
		System.out.println(this.a);
		System.out.println(super.a);
	}
}


public class SuperEx {
	public static void main(String[] args) {
		/* super Ű����
		 * �θ� ��ü�� ���۷���.
		 * �θ��� ����� �ڽ��� ����� �ߺ� ���ǵǾ� ������ �ʿ��� ��쿡�� ����ϴ� ���� ���ٰ� �Ѵ�. 
		 * ���������δ� ��Ȯ�� ������ ���� this�� super�� ��������� ����ϴ� ���� ���ٰ� ���������� �ƴ� ���� �ֳ�����.
		 * 
		 * ���� super()�� ���� �θ�Ŭ������ �����ڸ� ȣ���� ���� �ִ�.
		 * */
		Sub sub = new Sub();
		sub.test();
	}
}
