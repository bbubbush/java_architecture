package com.github.bbubbush.part6;

class StaticTest{
	int x;
	static int y;
}

public class StaticEx {
	public static void main(String[] args) {
		/* Static �����
		 * �޼��� or instance variable���� ��� ����.
		 * local variable or class���� ��� �Ұ�.
		 * instance variable�̳� instance method�� heap ������ ����������, static variable�̳� static method�� static ������ ����.
		 * ���� ��� ��ü���� ����� �� �ְ� �ȴ�.
		 * �ٸ� �Բ� �����ϴ� ��� �ڷ��� ���� ������ ���� �ְ�, �޸��� ������ ���� ���������� ����ϰ� �ȴ�.
		 * */
		// System.out.println(StaticTest.x);		compile error�� �߻�. ��ü�� ������ �ʿ��ϱ� ����.
		System.out.println(StaticTest.y);
	}
}
