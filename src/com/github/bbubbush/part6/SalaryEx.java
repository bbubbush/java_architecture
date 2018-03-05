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
		/* encapsulation에 대한 문제 
		 * 직접 pay에 접근하지 못하게 하고, 메서드를 통해 접근할 수 있게 한다.
		 * private + get/set은 매우 자주 활용하는 방법이므로 기억해둬야한다.
		 * */
		
		Salary s = new Salary();
		// s.pay = 1000; 접근이 불가능하다.
		
		s.setPay(10000);
		System.out.println("계좌 잔액은 " + s.getPay() + "입니다.");
	}
}
