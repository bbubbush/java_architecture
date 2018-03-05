package com.github.bbubbush.part6;

public class OverloadingEx1 {
	// non method overloading
	public void intLength(int i){
		String s = i + "";
		System.out.println("입력한 값의 길이는 " + s.length());
	}
	
	public void floatLength(float f){
		String s = f + "";
		System.out.println("입력한 값의 길이는 " + s.length());
	}
	
	public void stringLength(String s){
		System.out.println("입력한 값의 길이는 " + s.length());
	}
	
	// method overloading
	public void getLength(int i){
		String s = i + "";
		System.out.println("입력한 값의 길이는 " + s.length());
	}
	public void getLength(float i){
		String s = i + "";
		System.out.println("입력한 값의 길이는 " + s.length());
	}
	public void getLength(String s){
		System.out.println("입력한 값의 길이는 " + s.length());
	}
	
	// Generic
	public <T> void getGenericLength(T var){
		String s = var + "";
		System.out.println("입력한 값의 길이는 " + s.length());
	}
	
	public static void main(String[] args) {
		/* 메서드 오버로딩
		 * 하나의 클래스에서 같은 이름을 가진 메서드가 여러 개 정의되는 것이다.
		 * 리턴타입이나 매개변수의 개수, 매개변수의 타입이 달라야 한다.
		 * 매개변수의 이름이 다르다고 오버로딩이 되지 않는다.
		 * 다만 변수타입의 순서가 변하면 이것은 서로 다름으로 받아드려 오버로딩이 된다.
		 * 
		 * Generic을 통해 오버로딩을 대체할 수 있지만 기능의 정확한 활용에 있어 추천하는 방법은 아니다. 
		 * 간단한 기능만 사용할 경우에는 간편하게 사용하기 좋다.
		 * */
		OverloadingEx1 o = new OverloadingEx1();
		// non method overloading
		o.intLength(1000);
		o.floatLength(3.14f);
		o.stringLength("10000");
		System.out.println();
		
		// method overloading
		o.getLength(1000);
		o.getLength(3.14f);
		o.getLength("10000");
		System.out.println();
		
		// use generic
		o.getGenericLength(1000);
		o.getGenericLength(3.14f);
		o.getGenericLength("10000");
	}
}
