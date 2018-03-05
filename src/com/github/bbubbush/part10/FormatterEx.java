package com.github.bbubbush.part10;

import java.util.Formatter;

public class FormatterEx {
	public static void main(String[] args) {
		/* Formatter class
		 * 출력형식을 지정하여 값의 형태를 변형하는 클래스
		 * 숫자, 문자열, 날짜 및 시간과 지역 특징적 출력형식 제공
		 * 
		 * 기본문법
		 * 1) 일반 문자, 그리고 숫자 형들을 위해 포맷규칙
		 * 		%[argument_index$][flags][width][precision]conversion
		 * 2) 날짜/시간들을 표현하도록 사용된 형들에 대한 포맷 규칙
		 * 		%[argument_index$][flags][width]conversion
		 * 3) 인자들에 부합하지 않은 포맷 규칙
		 * 		%[flags][width]conversion
		 * 
		 * 생소해서 복잡하지만 막상 이렇게 외워서 쓰기보다는 printf문 처럼 사용하는 경우가 보편적인듯 싶다.
		 * */
		
		Formatter f = new Formatter();
		f.format("%1$b, %3$h, %2$5s", false, 500, 'A');		// 'A'의 ASCII value는 65, 따라서 16진수로 변환하면 41이 됨.
		System.out.println(f.toString());
	}
}
