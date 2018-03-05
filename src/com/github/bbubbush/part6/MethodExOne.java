package com.github.bbubbush.part6;

class MethodEx{
	public int sum(int i, int j){
		return i+j;
	}
	public int sub(int i, int j){
		return i-j;
	}
	public int multi(int i, int j){
		return j*i;
	}
	public int divi(int i, int j){
		return j/i;
	}
}

public class MethodExOne {
	public static void main(String[] args) {
		/* 간단한 메소드예제
		 * 단순하게 값을 전달하는 문제이므로 크게 어려운 부분이 없다.
		 * */
		MethodEx m = new MethodEx();
		int i = 10, j = 10;
		System.out.println("두 수를 더한 값은 " + m.sum(i, j));
		System.out.println("두 수를 뺀 값은 " + m.sub(i, j));
		System.out.println("두 수를 곱한 값은 " + m.multi(i, j));
		System.out.println("두 수를 나눈 값은 " + m.divi(i, j));
		
	}
}
