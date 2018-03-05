package com.github.bbubbush.part11;

public class ExceptionEx2 {
	public static void main(String[] args) {
		/* Exception
		 * ExceptionEx1의 코드에 try~catch문을 더해 예외가 발생해도 프로그램이 계속 작동하게 만들었다.
		 * */
		int number = 50;
		int result = 0;
		for (int i = 0; i < 10; i++) {
			try {
				result = number / (int)(Math.random() * 5);
				System.out.println(result);
			} catch (ArithmeticException e) {
				// TODO: handle exception
				System.out.println("ArithmeticException 발생");
			}// end of catch
		}// end of for
	}// end of main method
}
