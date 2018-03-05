package com.github.bbubbush.part8;

interface Inter1{
	abstract public int getA();
}

interface Inter2{
	abstract public int getA();
	abstract public int getB();
}

interface Inter3 extends Inter1, Inter2{
	abstract public int getData();
}

public class InterfaceEx2 implements Inter3 {
	int a = 100;
	
	@Override
	public int getA() {
		// TODO Auto-generated method stub
		return a;
	}
	@Override
	public int getB() {
		// TODO Auto-generated method stub
		return -1;
	}
	
	@Override
	public int getData() {
		// TODO Auto-generated method stub
		return a + 10;
	}
	
	public static void main(String[] args) {
		/* Interface의 다중상속
		 * 인터페이스간의 상속은 결국 추상메서드와 스태틱상수의 개수만 증가할 뿐, 이를 최종적으로 구현해야하는 일반클래스에게 모든 책임이 전가된다.
		 * 따라서 인터페이스간 다중상속이 가능하다.
		 * 또한 다형성의 규칙을 따라 상위 인터페이스 객체를 통해 자식이 구현한 객체를 가져다 사용할 수 있다.
		 * 
		 * 추상클래스와 인터페이스의 공톰점과 차이점을 구분해보면 좋다.
		 * */
		InterfaceEx2 i = new InterfaceEx2();
		
		Inter1 i1 = i;
		Inter2 i2 = i;
		Inter3 i3 = i;
		
		System.out.println(i1.getA());
		System.out.println(i2.getB());
		System.out.println(i3.getData());
	}
}
