package com.github.bbubbush.part9;

class OuterEx{
	public class InnerEx{
		int x = 5;
	}
}

public class InnerExOne {
	public static void main(String[] args) {
		/* Inner class
		 * Ŭ���� ���� Ŭ������ ���ǵǴ� ���� ���Ѵ�.
		 * ũ�� ��� �̳�Ŭ����, ����ƽ �̳�Ŭ����, ���� �̳�Ŭ����, �͸� �̳�Ŭ���� �� 4���� ������ �� �ִ�.
		 * �̹� ������ ��� �̳�Ŭ������ ���� �����̴�. ���� �⺻���� �����̸� ����� �ʰ� ����� �� �ִ�.
		 * ���� �� ȣ���� �ƿ���Ŭ�������� dot�� ����� �̳ʷ� �����ϸ� ������ ���� ���������� �ƿ��ͺ��� �ʱ�ȭ �� �̳ʸ� �ʱ�ȭ�Ѵ�.
		 * */
		OuterEx.InnerEx i = new OuterEx().new InnerEx();
		System.out.println(i.x);
	}
}
