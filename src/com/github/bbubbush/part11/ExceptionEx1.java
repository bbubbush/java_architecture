package com.github.bbubbush.part11;

public class ExceptionEx1 {
	public static void main(String[] args) {
		/* Exception
		 * �������� ������ ���� ���������� �����ϵ����� ��Ÿ���߿� ������ ����� ��� ���ܶ�� �Ѵ�.
		 * IDE�� �������� ������ ���� �̸� �߻� ���������� �˷��ֱ⵵ �Ѵ�.
		 * 
		 * Exception�� ���������� ����, Ȥ�� �ڵ忡 ���ؼ� �ٷ����� �� �ִ� �����̴�.
		 * Error�� �����Ұ����� ����, Ȥ�� �ڵ忡 ���� �ٷ����� �� ���� �����̴�.
		 * */
		int number = 50;
		int result = 0;
		for (int i = 0; i < 10; i++) {
			result = number / (int)(Math.random() * 5);		// 0~4�� ���� �� 0�� �߻��� ��� exception �߻�
			System.out.println(result);
		}
	}
}
