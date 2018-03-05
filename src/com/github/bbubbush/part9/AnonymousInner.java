package com.github.bbubbush.part9;


abstract class TestAbst{
	int data = 10000;
	public abstract void printData();
}


public class AnonymousInner{
	// anonymous Inner class 사용
	TestAbst t = new TestAbst() {
		
		@Override
		public void printData() {
			// TODO Auto-generated method stub
			System.out.println("data : " + data);
		}
	};
	
	
	public static void main(String[] args) {
		/* Anonymous Inner Class
		 * 이름이 정의되지 않은 클래스. 
		 * 간단한 인터페이스의 경우 따로 구현 클래스를 만들지 않고 일회성으로 사용할 때 익명클래스를 사용한다.
		 * Event 호출시에 자주 사용한다.
		 * */
		AnonymousInner a = new AnonymousInner();
		a.t.printData();
	}
}
