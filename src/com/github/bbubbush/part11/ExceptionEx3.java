package com.github.bbubbush.part11;

public class ExceptionEx3 {
	public static void main(String[] args) {
		/* Try~catch문의 실행 순서
		 * 예외가 발생하지 않으면 catch문은 사용되지 않는다.
		 * */
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(4);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(5);		// 예외가 발생할 경우에만 catch의 body를 탄다.
		}// end of catch
		System.out.println(6);
	}
}
