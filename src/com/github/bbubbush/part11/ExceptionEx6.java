package com.github.bbubbush.part11;

public class ExceptionEx6 {
	public static void main(String[] args) {
		/* 다중 catch문
		 * if문 처럼 상위의 조건부터 점점 하향식으로 진행
		 * if문이 범위가 좁은 조건이 위로 가야하는것 처럼 exception 역시 하위 예외가 먼저 등장해야한다.
		 * 만약 Exception이 가장 상위에 있을 경우 하위 예외는 다 deadline이 된다.
		 * */
		
		System.out.println(1);
		System.out.println(2);
		try{
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		}catch(ArithmeticException e){
			if ( e instanceof ArithmeticException) {
				System.out.println("true");
			}
			System.out.println("ArithmeticException");
		}catch(Exception e){
			System.out.println("Exception");
		}
//		catch(NullPointerException e){			// 컴파일에러
//			
//		}// end of catch
		System.out.println(5);
	}// end of main method
}// end of class
