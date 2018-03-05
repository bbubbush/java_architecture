package com.github.bbubbush.part9;

import java.util.Calendar;

public class EnumEx2 {
	public static void main(String[] args) {
		/* enum 예제2
		 * 기존에 생성되어 있는 enum 타입을 통해 오늘의 요일을 출력하는 프로그램
		 * enum의 상수의 개수만큼 heap 영역에 객체가 생성된다. Week의 경우 7개의 상수가 있어서 총 7개의 객체가 heap에 생성된다.
		 * heap의 주소를 가리키기 때문에 ==을 사용해도 true, false를 정확히 비교할 수 있다.
		 * */
		Week today = null;
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week){
			case 1:
				today = Week.SUNDAY;
				break;
			case 2:
				today = Week.MONDAY;
				break;
			case 3:
				today = Week.TUESDAY;
				break;
			case 4:
				today = Week.WEDNESDAY;
				break;
			case 5:
				today = Week.THURSDAY;
				break;
			case 6:
				today = Week.FRIDAY;
				break;
			case 7:
				today = Week.SATURDAY;
				break;
		}
		
		System.out.println("오늘은 " + today + "입니다.");
		
		if ( today == Week.SUNDAY ) {
			System.out.println("일요일은 쉬는날 입니다.");
		}else{
			System.out.println("공부하는 날입니다.");
		}
		
	}
}
