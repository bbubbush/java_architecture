package com.github.bbubbush.part9;

class OuterEx{
	public class InnerEx{
		int x = 5;
	}
}

public class InnerExOne {
	public static void main(String[] args) {
		/* Inner class
		 * 클래스 내에 클래스가 정의되는 것을 말한다.
		 * 크게 멤버 이너클래스, 스태틱 이너클래스, 로컬 이너클래스, 익명 이너클래스 등 4개로 구분할 수 있다.
		 * 이번 예제는 멤버 이너클래스에 대한 예제이다. 가장 기본적인 형태이며 어렵지 않게 사용할 수 있다.
		 * 생성 및 호출은 아우터클래스부터 dot을 사용해 이너로 접근하며 생성자 역시 마찬가지로 아우터부터 초기화 후 이너를 초기화한다.
		 * */
		OuterEx.InnerEx i = new OuterEx().new InnerEx();
		System.out.println(i.x);
	}
}
