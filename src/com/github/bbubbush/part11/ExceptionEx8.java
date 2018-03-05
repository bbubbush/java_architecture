package com.github.bbubbush.part11;

public class ExceptionEx8 {
	private static void test() throws Exception{
		System.out.println(6/0);		// 예외가 발생하지만 직접 처리하지 않고 Exception에게 위임
	}
	public static void main(String[] args) {
		/* Throws
		 * 예외처리를 다른 객체에게 전가하는 방법.
		 * 상황에 따라 여러곳에서 발생할 수 있는 예외를 한 곳에서 처리할 수도 있지만 리뷰에 있어 복잡하게 느껴질 수도 있음.
		 * 상황에 맞게 사용하는 것이 중요. 
		 * */
		try {
			test();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
