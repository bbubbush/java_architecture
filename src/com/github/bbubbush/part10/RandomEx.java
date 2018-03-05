package com.github.bbubbush.part10;

import java.util.Random;

public class RandomEx {
	public static void main(String[] args) {
		/* Random class
		 * 0.0 ~ 1.0 사이의 난수를 발생시킨다.
		 * 여러 데이터타입으로 난수를 발생시키는 메서드들이 존재하지만 보통 Math.random에 원하는 값을 가공해 사용하는 것이 편해서 이 클래스를 잘 사용하지 않는다.
		 * */
		String[] lesson = {"Java Basic", "JSP", "XML&Java", "EJB"};
		Random r = new Random();
		int index = r.nextInt(4);
		System.out.println("선택과목: " + lesson[index]);
	}
}
