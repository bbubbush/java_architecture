package com.github.bbubbush.part6;

public class ValueParameter {
	public int increase(int n){
		return ++n;
	}
	public static void main(String[] args) {
		/* Call by value E.G
		 * �ռ� ���� MethodExTwo�� ũ�� �ٸ��� �ʴ�. �⺻�ڷ����� �����ϴ� ���
		 * */
		int var1 = 100;
		ValueParameter v = new ValueParameter();
		int var2 = v.increase(var1);
		System.out.println("var1 >> "+var1 + ", var2>>> " + var2);
	}
}
