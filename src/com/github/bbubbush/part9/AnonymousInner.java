package com.github.bbubbush.part9;


abstract class TestAbst{
	int data = 10000;
	public abstract void printData();
}


public class AnonymousInner{
	// anonymous Inner class ���
	TestAbst t = new TestAbst() {
		
		@Override
		public void printData() {
			// TODO Auto-generated method stub
			System.out.println("data : " + data);
		}
	};
	
	
	public static void main(String[] args) {
		/* Anonymous Inner Class
		 * �̸��� ���ǵ��� ���� Ŭ����. 
		 * ������ �������̽��� ��� ���� ���� Ŭ������ ������ �ʰ� ��ȸ������ ����� �� �͸�Ŭ������ ����Ѵ�.
		 * Event ȣ��ÿ� ���� ����Ѵ�.
		 * */
		AnonymousInner a = new AnonymousInner();
		a.t.printData();
	}
}
