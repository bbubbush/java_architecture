package com.github.bbubbush.part8;

abstract class Diagram{
	abstract void draw();
}

class Triangle extends Diagram{
	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("삼각형을 그린다.");
	}
}

class Rectangle extends Diagram{
	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("사각형을 그린다.");
	}
}

class Circle extends Diagram{
	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("원을 그린다.");
	}
}

public class UseDraw {
	public static void main(String[] args) {
		/* abstract class
		 * 상속받은 자식 클래스에 강제적으로 구현하게 하는 추상메서드를 포함한 클래스를 말한다.
		 * 추상메서드는 private, static으로 선언할 수 없다. private으로 선언하면 자식객체에서 접근이 불가능하고, static으로 선언하면 빈 바디를 호출하는 꼴이 되기 때문이다.
		 * 오버라이딩과 비슷해보이지만 구현을 강제하는 측면에서는 추상메서드가 강제성이 높다.
		 * */
		// Diagram a = new Diagram();  추상클래스는 객체를 만들 수 없다.
		Diagram[] d = new Diagram[3];
		d[0] = new Triangle();
		d[1] = new Rectangle();
		d[2] = new Circle();
		
		for (int i = 0; i < d.length; i++) {
			d[i].draw();
		}
	}
}
