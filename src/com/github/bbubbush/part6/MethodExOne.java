package com.github.bbubbush.part6;

class MethodEx{
	public int sum(int i, int j){
		return i+j;
	}
	public int sub(int i, int j){
		return i-j;
	}
	public int multi(int i, int j){
		return j*i;
	}
	public int divi(int i, int j){
		return j/i;
	}
}

public class MethodExOne {
	public static void main(String[] args) {
		/* ������ �޼ҵ忹��
		 * �ܼ��ϰ� ���� �����ϴ� �����̹Ƿ� ũ�� ����� �κ��� ����.
		 * */
		MethodEx m = new MethodEx();
		int i = 10, j = 10;
		System.out.println("�� ���� ���� ���� " + m.sum(i, j));
		System.out.println("�� ���� �� ���� " + m.sub(i, j));
		System.out.println("�� ���� ���� ���� " + m.multi(i, j));
		System.out.println("�� ���� ���� ���� " + m.divi(i, j));
		
	}
}
