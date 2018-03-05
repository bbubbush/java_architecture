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
		 * ����� ���信���� �����ϴ�. �θ�Ŭ�������� ���ǵ� ������ �ڽ�Ŭ�������� �ٽ� �����ϴ� ���̴�.
		 * �̸��� ���ƾ� �ϰ�, �Ű������� ���ƾ� �ϸ�, ����Ÿ���� ���̾�  �������̵����� ���ǵȴ�.
		 * ���� �ڽ��� ���������ڴ� �θ��� ���������ں��� ���� ������ �Ǿ�� �Ѵ�.
		 * */
		Dog d = new Dog();
		d.cry();
	}
}
