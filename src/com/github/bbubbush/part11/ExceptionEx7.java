package com.github.bbubbush.part11;

public class ExceptionEx7 {
	public static void main(String[] args) {
		/* Try~catch~finally
		 * 기존의 try ~ catch문에서 예외발생여부와 상관없이 실행해야 하는 부분을 finally영역에 작성한다.
		 * 아래 코드처럼 0으로 나누거나 아니거나 상관없이 진행된다.
		 * */
		
		for (int i = 1; i <= 10; i++) {
			try {
				System.out.println(i/(int)(Math.random()*2));
			}catch(ArithmeticException e){
				System.out.println("ArithmeticException");
			}finally {
				// TODO: handle finally clause
				System.out.println("Finally" + i);
				System.out.println();
			}
		}
		
		
	}
}
