package com.github.bbubbush.part6;

public class MethodExThree {
	private int var;
	public void setVar(int var){
		//var = var 		������ �߻��ϴ� �ڵ�. instance variable�� local variable�� �̸��� ���ı� ����
		this.var = var;
	}
	
	public int getVar(){
		return this.var;
	}
	
	public static void main(String[] args) {
		/* �����غ����� �޼��� ����
		 * ����ó�� �����־��µ� ��� this�� ���� ������ ������ڴ� �������� �� ��������.
		 * */
		MethodExThree m = new MethodExThree();
		m.setVar(1000);
		System.out.println(m.getVar());
	}
}
