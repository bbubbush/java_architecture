package com.github.bbubbush.part3;

public class PrintfEx {
	public static void main(String[] args) {
		/*
		 * C에서 사용하는 서식. Python에서도 지원하니 적응하면 꽤 유용하게 사용할 수 있다.
		 * %n은 \n과 마찬가지로 개행의 역할을 한다.
		 * */
		int a = 100;
		char b = 'A';
		float c = 12.346f;
		String d = "이상훈";
		System.out.printf("a = %d 입니다.%n", a);
		System.out.printf("b = %c 입니다.\n", b);
		System.out.printf("c = %f 입니다.%n", c);
		System.out.printf("d = %s 입니다.", d);
		
	}
}
