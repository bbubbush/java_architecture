package com.github.bbubbush.part6;

public class MethodExTwo {
	int var1, var2; // instance variable
	
	public int sum(int a, int b){	// method
		return a+b;
	}
	
	public static void main(String[] args) {
		/* 간단한 메서드 문제
		 * 별도의 클래스 없이 자기 자신을 인스턴스로 활용하는 문제이다.
		 * */
		MethodExTwo m = new MethodExTwo();
		int res = m.sum(1000, -10);
		System.out.println(res);
	}
}
