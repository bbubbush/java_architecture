package com.github.bbubbush.part7;

class Animal{
	void cry(){
		System.out.println("Some Animal can't cry. but usually can cry.");
	}
}

class Dog extends Animal{
	void cry(){
		System.out.println("Bow-wow!");
	}
}


public class AnimalEx {
	public static void main(String[] args) {
		/* Method Overriding
		 * 상속의 개념에서만 가능하다. 부모클래스에서 정의된 내용을 자식클래스에서 다시 정의하는 것이다.
		 * 이름이 같아야 하고, 매개변수가 같아야 하며, 리턴타입이 같이야  오버라이딩으로 정의된다.
		 * 또한 자식의 접근제한자는 부모의 접근제한자보다 넓은 범위가 되어야 한다.
		 * */
		Dog d = new Dog();
		d.cry();
	}
}
