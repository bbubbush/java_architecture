package com.github.bbubbush.part9;

public class EnumEx1 {
	public enum Lesson{
		JAVA{}, XML, EJB
	}
	public static void main(String[] args) {
		/* Enum
		 * ������ Ÿ��. 
		 * ���翡 ������ �����Ͽ� �ٸ� ������ ���� �߰������� ����.
		 * */
		Lesson l = Lesson.JAVA;
		System.out.println("Lesson : " + l);
		System.out.println("XML : " + Lesson.XML);
	}
}
