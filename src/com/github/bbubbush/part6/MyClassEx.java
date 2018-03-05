package com.github.bbubbush.part6;

class MyClass{
	private String name;
	private int age;
	public MyClass(){
		name = "undefined";
	}
	
	public MyClass(String n){
		this.name = n;
	}
	
	public MyClass(int a, String n){
		this.age = a;
		this.name = n;
	}
	
	public MyClass(String n, int a){
		this.name = n;
		this.age = a;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getAge(){
		return this.age;
	}
}

public class MyClassEx {
	public static void main(String[] args) {
		/* Constructor Overloading
		 * �����ڴ� �ʱ�ȭ�� ����Ѵ�. Ŭ������ ���� �����ϸ� ����Ÿ���� �������� ���ƾ��Ѵ�.
		 * this()�� ���� �����ڸ� ȣ���� �� ������ �ݵ�� �� ���� �־�� �Ѵ�.
		 * */
		MyClass m = new MyClass();
		MyClass m1 = new MyClass("��ī��");
		MyClass m2 = new MyClass("���α�", 10);
		MyClass m3 = new MyClass(7, "���̸�");
		
		System.out.println(m.getName() + ", " + m.getAge());
		System.out.println(m1.getName() + ", " + m1.getAge());
		System.out.println(m2.getName() + ", " + m2.getAge());
		System.out.println(m3.getName() + ", " + m3.getAge());
	}
}
