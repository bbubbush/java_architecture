package com.github.bbubbush.part6;

public class MethodExTwo {
	int var1, var2; // instance variable
	
	public int sum(int a, int b){	// method
		return a+b;
	}
	
	public static void main(String[] args) {
		/* ������ �޼��� ����
		 * ������ Ŭ���� ���� �ڱ� �ڽ��� �ν��Ͻ��� Ȱ���ϴ� �����̴�.
		 * */
		MethodExTwo m = new MethodExTwo();
		int res = m.sum(1000, -10);
		System.out.println(res);
	}
}
