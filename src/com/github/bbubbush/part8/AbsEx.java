package com.github.bbubbush.part8;

abstract class AbsEx1{
	int a = 100;
	final String str = "abstract test";
	public String getStr(){
		return str;
	}
	
	abstract public int getA();
}

abstract class AbsEx2 extends AbsEx1{
	
	public abstract String getStr();
}

public class AbsEx extends AbsEx2{
	@Override
	public int getA() {
		// TODO Auto-generated method stub
		return a;
	}
	@Override
	public String getStr() {
		// TODO Auto-generated method stub
		return str;
	}
	public static void main(String[] args) {
		/* 추상클래스의 상속관계
		 * 추상클래스 간에도 상속이 가능하다. 대신 추상 클래스들 간의 상속에서는 상속받은 추상 메서드를 꼭 재정의할 필요는 없다.
		 * 계속 쌓아두다 일반클래스가 상속받는 순간, 추상클래스 폭탄들을 모두 일반클래스에게 구현을 것을 강제한다.
		 * */
		AbsEx a = new AbsEx();
		System.out.println(a.getA());
		System.out.println(a.getStr());
	}
}
