package com.github.bbubbush.part11;

public class ExceptionEx4 {
	public static void main(String[] args) {
		/* Try~catch문의 실행 순서
		 * try 구문에서 예외가 발생할 경우 그 지점에서 멈추고 catch문으로 점프한다.
		 * */
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);	// ArithmeticException을 발생시킨다.
			System.out.println(4);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(5);		// 예외가 발생할 경우에만 catch의 body를 탄다.
		}// end of catch
		System.out.println(6);
	}
}
