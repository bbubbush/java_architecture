package com.github.bbubbush.part11;

public class ExceptionEx4 {
	public static void main(String[] args) {
		/* Try~catch���� ���� ����
		 * try �������� ���ܰ� �߻��� ��� �� �������� ���߰� catch������ �����Ѵ�.
		 * */
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);	// ArithmeticException�� �߻���Ų��.
			System.out.println(4);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(5);		// ���ܰ� �߻��� ��쿡�� catch�� body�� ź��.
		}// end of catch
		System.out.println(6);
	}
}
