package com.github.bbubbush.part7;

class Super{
	int a = 5;
	public Super(int x) {
		// TODO Auto-generated constructor stub
		System.out.println("부모클래스 생성자 : " + x);
	}
}

class Sub extends Super{
	int a =10;
	public Sub() {
		// TODO Auto-generated constructor stub
		super(5);
		System.out.println("자식클래스 생성자");
		
	}
	
	void test(){
		System.out.println(this.a);
		System.out.println(super.a);
	}
}


public class SuperEx {
	public static void main(String[] args) {
		/* super 키워드
		 * 부모 객체의 레퍼런스.
		 * 부모의 멤버와 자식의 멤버가 중복 정의되어 구별이 필요할 경우에만 사용하는 것이 좋다고 한다. 
		 * 개인적으로는 명확한 구분을 위해 this와 super를 명시적으로 사용하는 것이 좋다고 생각하지만 아닐 수도 있나보다.
		 * 
		 * 또한 super()를 통해 부모클래스의 생성자를 호출할 수도 있다.
		 * */
		Sub sub = new Sub();
		sub.test();
	}
}
