package com.github.bbubbush.part6;

class ThisTest{
	String name, jumin, tel;
	public ThisTest() {
		this.name = "Guest";
		this.jumin = "000000-0000000";
		this.tel = "010-0000-0000";
	}
	
	public ThisTest(String name){
		this();
		this.name = name;
	}
	
	public ThisTest(String name, String jumin){
		this(name);
		this.jumin = jumin;
	}
	
	public ThisTest(String name, String jumin, String tel){
		this(name, jumin);
		this.tel = tel;
	}
	
	public String getName(){
		return this.name;
	}
	public String getJumin(){
		return this.jumin;
	}
	public String getTel(){
		return this.tel;
	}
	
}

public class ThisEx {
	public static void main(String[] args) {
		/* this �⺻ ����
		 * this�� Ư�� ��ü ������ �ڽ��� �����Ǿ��� ���� �ּ� �� �����̴�.
		 * Constructor.java���� �� �κп� ���� ����߾����Ƿ� ����� ������ ������� �Ѿ�ڴ�.
		 * */
		ThisTest t = new ThisTest();
		System.out.println(t.getName());
		System.out.println(t.getJumin());
		System.out.println(t.getTel());
		
		ThisTest t1 = new ThisTest("Hong", "123456-1234567", "010-2222-2222");
		System.out.println(t1.getName());
		System.out.println(t1.getJumin());
		System.out.println(t1.getTel());
	}
}
