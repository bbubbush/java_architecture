package com.github.bbubbush.part9;



public class StaticInner {
	int a = 10;
	private int b = 100;
	static int c = 200;
	static class Inner{
		static int d = 1000;
		public void printData(){
//			System.out.println("int a : " + a);			non static 필드를 사용할 수 없다
//			System.out.println("private int b : " + b);
			System.out.println("static int c : " + c);
		}
	}
	
	
	public static void main(String[] args) {
		/* Static Inner Class
		 * 이너클래스를 스태틱으로 선언한 것이다.
		 * 어쩔수 없이 이너클래스 내에 스태틱변수나 스태틱메서드를 선언해야할 경우에 사용한다.
		 * 스태틱은 클래스로딩시에 static memory에 올라가기 인스턴스가 생성될 때 heap memory에 올라가는 non static 필드를 사용할 수 없다.
		 * 아래는 static inner class를 각기 다른 방법으로 호출하는 방법이다. 
		 * */
		System.out.println(Inner.d);
		System.out.println(StaticInner.Inner.d);
		StaticInner.Inner i = new Inner();
		i.printData();
	}
}
