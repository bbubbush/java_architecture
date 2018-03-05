package com.github.bbubbush.part8;

abstract class Diagram{
	abstract void draw();
}

class Triangle extends Diagram{
	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("�ﰢ���� �׸���.");
	}
}

class Rectangle extends Diagram{
	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("�簢���� �׸���.");
	}
}

class Circle extends Diagram{
	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("���� �׸���.");
	}
}

public class UseDraw {
	public static void main(String[] args) {
		/* abstract class
		 * ��ӹ��� �ڽ� Ŭ������ ���������� �����ϰ� �ϴ� �߻�޼��带 ������ Ŭ������ ���Ѵ�.
		 * �߻�޼���� private, static���� ������ �� ����. private���� �����ϸ� �ڽİ�ü���� ������ �Ұ����ϰ�, static���� �����ϸ� �� �ٵ� ȣ���ϴ� ���� �Ǳ� �����̴�.
		 * �������̵��� ����غ������� ������ �����ϴ� ���鿡���� �߻�޼��尡 �������� ����.
		 * */
		// Diagram a = new Diagram();  �߻�Ŭ������ ��ü�� ���� �� ����.
		Diagram[] d = new Diagram[3];
		d[0] = new Triangle();
		d[1] = new Rectangle();
		d[2] = new Circle();
		
		for (int i = 0; i < d.length; i++) {
			d[i].draw();
		}
	}
}
