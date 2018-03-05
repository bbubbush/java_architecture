package com.github.bbubbush.part9;

public class MemberInner {
	int a = 10;
	private int b = 100;
	
	static int c = 200;
	
	class Inner{
		public void printData(){
			System.out.println("int a : " + a);
			System.out.println("private int b : " + b);	// private 변수도 접근 가능
			System.out.println("static int c : " + c);
		}
	}
	
	
	public static void main(String[] args) {
		/* Member Inner Class
		 * 특이한 부분은 MemberInner 안에 선언한 private변수가 Inner 안에서 호출이 가능하다는 점이다.
		 * 이로인해 이너클래스는 거대한 메서드, 혹은 거대한 변수 정도의 개념으로 확장된다고 유추해볼 수 있다. 
		 * */
		MemberInner.Inner i = new MemberInner().new Inner();
		i.printData();
	}
}
