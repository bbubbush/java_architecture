package com.github.bbubbush.part6;

class Salary{
	private int pay;
	public int getPay(){
		return pay;
	}
	public void setPay(int pay){
		this.pay = pay;
	}
}

public class SalaryEx {
	public static void main(String[] args) {
		/* encapsulation�� ���� ���� 
		 * ���� pay�� �������� ���ϰ� �ϰ�, �޼��带 ���� ������ �� �ְ� �Ѵ�.
		 * private + get/set�� �ſ� ���� Ȱ���ϴ� ����̹Ƿ� ����ص־��Ѵ�.
		 * */
		
		Salary s = new Salary();
		// s.pay = 1000; ������ �Ұ����ϴ�.
		
		s.setPay(10000);
		System.out.println("���� �ܾ��� " + s.getPay() + "�Դϴ�.");
	}
}
