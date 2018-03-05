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
		/* this 기본 예제
		 * this는 특정 객체 내에서 자신이 생성되었을 때의 주소 값 변수이다.
		 * Constructor.java에서 이 부분에 대해 고민했었으므로 여기는 별도의 설명없이 넘어가겠다.
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
