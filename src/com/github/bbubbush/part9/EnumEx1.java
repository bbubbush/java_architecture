package com.github.bbubbush.part9;

public class EnumEx1 {
	public enum Lesson{
		JAVA{}, XML, EJB
	}
	public static void main(String[] args) {
		/* Enum
		 * 열거형 타입. 
		 * 교재에 정보가 부족하여 다른 예제를 통해 추가설명을 진행.
		 * */
		Lesson l = Lesson.JAVA;
		System.out.println("Lesson : " + l);
		System.out.println("XML : " + Lesson.XML);
	}
}
