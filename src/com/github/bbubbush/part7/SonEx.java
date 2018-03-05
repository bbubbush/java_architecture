package com.github.bbubbush.part7;

class ParenEx{
	int foo = 5;
	
	public int getNumber(int a){
		return a + 1;
	}
}

public class SonEx extends ParenEx {
	int foo = 7;
	public int getNumber(int a){
		return a + 2;
	}
	
	public static void main(String[] args) {
		/* Polymorphism 기본
		 * 부모의 이름으로 자식객체를 사용하는 것을 말한다.
		 * 메서드는 자식, 멤버는 부모의 것을 사용한다.
		 * 메서드가 자식의 것을 사용하는 것은 오버라이딩 때문이라 생각된다.
		 * 복습하는대도 어색한 문법이다. 자주 사용해서 익숙해질 필요가 있다.
		 * */
		ParenEx p = new SonEx();
		System.out.println(p.getNumber(0));
		System.out.println(p.foo);
	}
}
