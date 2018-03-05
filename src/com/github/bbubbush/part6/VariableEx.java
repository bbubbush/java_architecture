package com.github.bbubbush.part6;

public class VariableEx {
	public void argTest(String ... n){
		System.out.println("n.length >>> " + n.length);
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}
	}
	public static void main(String[] args) {
		/* Var args기능에 대한 코드
		 * 동일한 자료형이라면 매개변수의 개수를 가변적으로 사용할 수 있는 기능이다.
		 * JDK5.0에서 새롭게 추게된 기능이며 이전의 JDK에서는 사용할 수 없다.
		 * */
		VariableEx v = new VariableEx();
		v.argTest("Varargss", "Test");
		v.argTest("100", "200", "300", "400");
	}
}
