package com.github.bbubbush.part8;

abstract class AbsEx1{
	int a = 100;
	final String str = "abstract test";
	public String getStr(){
		return str;
	}
	
	abstract public int getA();
}

abstract class AbsEx2 extends AbsEx1{
	
	public abstract String getStr();
}

public class AbsEx extends AbsEx2{
	@Override
	public int getA() {
		// TODO Auto-generated method stub
		return a;
	}
	@Override
	public String getStr() {
		// TODO Auto-generated method stub
		return str;
	}
	public static void main(String[] args) {
		/* �߻�Ŭ������ ��Ӱ���
		 * �߻�Ŭ���� ������ ����� �����ϴ�. ��� �߻� Ŭ������ ���� ��ӿ����� ��ӹ��� �߻� �޼��带 �� �������� �ʿ�� ����.
		 * ��� �׾Ƶδ� �Ϲ�Ŭ������ ��ӹ޴� ����, �߻�Ŭ���� ��ź���� ��� �Ϲ�Ŭ�������� ������ ���� �����Ѵ�.
		 * */
		AbsEx a = new AbsEx();
		System.out.println(a.getA());
		System.out.println(a.getStr());
	}
}
