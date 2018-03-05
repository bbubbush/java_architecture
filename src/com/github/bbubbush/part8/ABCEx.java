package com.github.bbubbush.part8;

import java.util.Arrays;

class AClass{
	
}

interface CInter{
	
}

class BClass extends AClass implements CInter{
	
}


public class ABCEx {
	public static void main(String[] args) {
		/* instanceof 예약어
		 * 비교객체이름 instanceof 비교클래스명
		 * 객체와 클래스를 비교해 객체가 클래스로 형변환이 가능한지 확인할 수 있다.
		 * 이를 통해 상속관계를 정리할 수 있다.
		 * */
		BClass b = new BClass();
		System.out.println(b instanceof Object);
		System.out.println(b instanceof AClass);
		System.out.println(b instanceof BClass);
		System.out.println(b instanceof CInter);

	}	
}
