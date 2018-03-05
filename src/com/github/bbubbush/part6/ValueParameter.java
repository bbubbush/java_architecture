package com.github.bbubbush.part6;

public class ValueParameter {
	public int increase(int n){
		return ++n;
	}
	public static void main(String[] args) {
		/* Call by value E.G
		 * 앞선 예제 MethodExTwo와 크게 다르지 않다. 기본자료형을 전달하는 방식
		 * */
		int var1 = 100;
		ValueParameter v = new ValueParameter();
		int var2 = v.increase(var1);
		System.out.println("var1 >> "+var1 + ", var2>>> " + var2);
	}
}
