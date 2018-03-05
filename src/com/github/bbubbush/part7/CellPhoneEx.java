package com.github.bbubbush.part7;

class CellPhone{
	String model, number;
	int chord;
	
	public void setNumber(String number){
		this.number = number;
	}
	
	public String getModel(){
		return this.model;
	}
	
	public int getChord(){
		return this.chord;
	}
	
	public String getNumber(){
		return this.number;
	}
	
}// end of CellPhone class

class MP3Phone extends CellPhone{
	int size;
	
	public MP3Phone(String model, String num, int chord, int size) {
		// TODO Auto-generated constructor stub
		// 부모클래스와 변수명이 중복되지 않아 this를 써도 부모클래스에서 초기화 되지만 이름이 중복될 경우 super와 this의 구분을 잘해야한다.
		this.model = model;
		this.number = num;
		this.chord = chord;
		this.size = size;
	}
}


public class CellPhoneEx {
	public static void main(String[] args) {
		/* inheritance 기초
		 * 기본적인 상속. 아래 코드를 보면 자식클래스 인스턴스에서 부모클래스의 getModel...등의 메서드에 접근하는 모습을 볼 수 있다.
		 * */
		MP3Phone m = new MP3Phone("아이뻐", "010-2222-2222", 1, 512);
		System.out.println(m.getModel());
		System.out.println(m.getNumber());
		System.out.println(m.getChord());
	}
}
