package com.github.bbubbush.part11;

public class ExceptionEx2 {
	public static void main(String[] args) {
		/* Exception
		 * ExceptionEx1�� �ڵ忡 try~catch���� ���� ���ܰ� �߻��ص� ���α׷��� ��� �۵��ϰ� �������.
		 * */
		int number = 50;
		int result = 0;
		for (int i = 0; i < 10; i++) {
			try {
				result = number / (int)(Math.random() * 5);
				System.out.println(result);
			} catch (ArithmeticException e) {
				// TODO: handle exception
				System.out.println("ArithmeticException �߻�");
			}// end of catch
		}// end of for
	}// end of main method
}
