package com.github.bbubbush.part10;

import java.util.Random;

public class RandomEx {
	public static void main(String[] args) {
		/* Random class
		 * 0.0 ~ 1.0 ������ ������ �߻���Ų��.
		 * ���� ������Ÿ������ ������ �߻���Ű�� �޼������ ���������� ���� Math.random�� ���ϴ� ���� ������ ����ϴ� ���� ���ؼ� �� Ŭ������ �� ������� �ʴ´�.
		 * */
		String[] lesson = {"Java Basic", "JSP", "XML&Java", "EJB"};
		Random r = new Random();
		int index = r.nextInt(4);
		System.out.println("���ð���: " + lesson[index]);
	}
}
