package com.github.bbubbush.part6;

public class VariableEx {
	public void argTest(String ... n){
		System.out.println("n.length >>> " + n.length);
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}
	}
	public static void main(String[] args) {
		/* Var args��ɿ� ���� �ڵ�
		 * ������ �ڷ����̶�� �Ű������� ������ ���������� ����� �� �ִ� ����̴�.
		 * JDK5.0���� ���Ӱ� �߰Ե� ����̸� ������ JDK������ ����� �� ����.
		 * */
		VariableEx v = new VariableEx();
		v.argTest("Varargss", "Test");
		v.argTest("100", "200", "300", "400");
	}
}
