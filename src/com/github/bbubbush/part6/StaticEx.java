package com.github.bbubbush.part6;

class StaticTest{
	int x;
	static int y;
}

public class StaticEx {
	public static void main(String[] args) {
		/* Static 예약어
		 * 메서드 or instance variable에만 사용 가능.
		 * local variable or class에는 사용 불가.
		 * instance variable이나 instance method는 heap 영역에 생성하지만, static variable이나 static method는 static 영역에 생성.
		 * 따라서 모든 객체들이 사용할 수 있게 된다.
		 * 다만 함께 개발하는 경우 자료의 값을 수정할 수도 있고, 메모리의 문제로 인해 제한적으로 사용하게 된다.
		 * */
		// System.out.println(StaticTest.x);		compile error가 발생. 객체의 생성이 필요하기 때문.
		System.out.println(StaticTest.y);
	}
}
