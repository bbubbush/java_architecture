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
		// �θ�Ŭ������ �������� �ߺ����� �ʾ� this�� �ᵵ �θ�Ŭ�������� �ʱ�ȭ ������ �̸��� �ߺ��� ��� super�� this�� ������ ���ؾ��Ѵ�.
		this.model = model;
		this.number = num;
		this.chord = chord;
		this.size = size;
	}
}


public class CellPhoneEx {
	public static void main(String[] args) {
		/* inheritance ����
		 * �⺻���� ���. �Ʒ� �ڵ带 ���� �ڽ�Ŭ���� �ν��Ͻ����� �θ�Ŭ������ getModel...���� �޼��忡 �����ϴ� ����� �� �� �ִ�.
		 * */
		MP3Phone m = new MP3Phone("���̻�", "010-2222-2222", 1, 512);
		System.out.println(m.getModel());
		System.out.println(m.getNumber());
		System.out.println(m.getChord());
	}
}
