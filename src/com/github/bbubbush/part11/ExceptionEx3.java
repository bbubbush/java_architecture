package com.github.bbubbush.part11;

public class ExceptionEx3 {
	public static void main(String[] args) {
		/* Try~catch���� ���� ����
		 * ���ܰ� �߻����� ������ catch���� ������ �ʴ´�.
		 * */
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(4);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(5);		// ���ܰ� �߻��� ��쿡�� catch�� body�� ź��.
		}// end of catch
		System.out.println(6);
	}
}
