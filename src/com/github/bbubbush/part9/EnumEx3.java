package com.github.bbubbush.part9;

public class EnumEx3 {
	public static void main(String[] args) {
		/* Enum method
		 * name(): 상수의 이름을 가져온다.
		 * ordinal(): 전체 상수 중 몇번째 순서인지 알려준다.(시작은 0)
		 * compareTo(enum instance): enum instance를 기준으로 호출한 enum이 몇 번째 인덱스에 위치하는지 알려준다.
		 * valueOf(String value): string value와 호출한 enum을 비교해 같으면 true, 아니면 false를 리턴한다.
		 * values(): enum 객체 안의 모든 상수를 배열형태로 묶어 순차적으로 가져온다.
		 * */
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);
		
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		
		if ( today == Week.valueOf("SUNDAY") || today == Week.valueOf("SATURDAY") ) {
			System.out.println("주말입니다.");
		}else{
			System.out.println("평일입니다.");
		}
		
		Week[] days = Week.values();
		for (Week day : days) {
			System.out.println(day);
		}
		
	}
}
