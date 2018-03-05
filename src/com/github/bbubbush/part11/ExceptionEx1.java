package com.github.bbubbush.part11;

public class ExceptionEx1 {
	public static void main(String[] args) {
		/* Exception
		 * 문법상의 오류가 없어 정상적으로 컴파일되지만 런타임중에 문제가 생기는 경우 예외라고 한다.
		 * IDE의 발전으로 컴파일 전에 미리 발생 예상지점을 알려주기도 한다.
		 * 
		 * Exception은 예측가능한 오류, 혹은 코드에 의해서 바로잡을 수 있는 오류이다.
		 * Error는 예측불가능한 오류, 혹은 코드에 의해 바로잡을 수 없는 오류이다.
		 * */
		int number = 50;
		int result = 0;
		for (int i = 0; i < 10; i++) {
			result = number / (int)(Math.random() * 5);		// 0~4의 난수 중 0이 발생할 경우 exception 발생
			System.out.println(result);
		}
	}
}
