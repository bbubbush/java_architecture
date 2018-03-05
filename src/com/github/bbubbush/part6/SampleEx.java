package com.github.bbubbush.part6;

class Sample{
	int x, y;		// instance variable
	static int z;	// class variable or static variable
}

public class SampleEx {
	public static void main(String[] args) {
		/* OOP의 기본개념에 대한 설명
		 * OOP의 대한 설명이지만 하다보니 variable의 개념을 설명하는 코드가 되었다. 
		 * 하지만 이 또한 OOP 내에서 중요한 개념이니 짚고 넘어갈만 하다.
		 * */
		Sample sp = new Sample();			// local variable   	 main() 안에서만 호출이 가능하다.
		System.out.println(sp.x);			// instance variable	정의 및 선언된 인스턴스를 통해 접근할 수 있다.
		System.out.println(Sample.z); 		// static variable		정의 및 선언 없이 바로 접근할 수 있다.
	}
	
	
}
