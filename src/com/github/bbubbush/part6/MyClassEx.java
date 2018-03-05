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
		 * 생성자는 초기화를 담당한다. 클래스의 명을 따라하며 리턴타입을 정의하지 말아야한다.
		 * this()를 통해 생성자를 호출할 수 있지만 반드시 맨 위에 있어야 한다.
		 * */
		MyClass m = new MyClass();
		MyClass m1 = new MyClass("피카츄");
		MyClass m2 = new MyClass("꼬부기", 10);
		MyClass m3 = new MyClass(7, "파이리");
		
		System.out.println(m.getName() + ", " + m.getAge());
		System.out.println(m1.getName() + ", " + m1.getAge());
		System.out.println(m2.getName() + ", " + m2.getAge());
		System.out.println(m3.getName() + ", " + m3.getAge());
	}
}
