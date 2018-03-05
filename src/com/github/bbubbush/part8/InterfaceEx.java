package com.github.bbubbush.part8;

interface InterEx{
	static final int A = 100;
	int B = 200;		// static final이 붙지 않아도 자동으로 붙여준다.
	abstract int getA();
	int getB();			// abstract를 붙이지 않아도 자동으로 붙여준다.
}


public class InterfaceEx implements InterEx{
	@Override
	public int getA() {
		// TODO Auto-generated method stub
		return A;
	}
	
	@Override
	public int getB() {
		// TODO Auto-generated method stub
		return A;
	}
	
	public static void main(String[] args) {
		/* Interface 기본
		 * abstract method와 static constant만 정의 가능하다.
		 * interface는 static과 final, abstract를 생략해도 자동으로 정의를 해준다.
		 * 즉, 무조건 스태틱 상수와 추상메서드로만 구현되어있다.
		 * */
		
		InterfaceEx i = new InterfaceEx();
		System.out.println(i.getA());
		System.out.println(i.getB());
		
		
	}
}
