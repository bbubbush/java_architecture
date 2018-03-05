package com.github.bbubbush.part9;

public class EnumEx3 {
	public static void main(String[] args) {
		/* Enum method
		 * name(): ����� �̸��� �����´�.
		 * ordinal(): ��ü ��� �� ���° �������� �˷��ش�.(������ 0)
		 * compareTo(enum instance): enum instance�� �������� ȣ���� enum�� �� ��° �ε����� ��ġ�ϴ��� �˷��ش�.
		 * valueOf(String value): string value�� ȣ���� enum�� ���� ������ true, �ƴϸ� false�� �����Ѵ�.
		 * values(): enum ��ü ���� ��� ����� �迭���·� ���� ���������� �����´�.
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
			System.out.println("�ָ��Դϴ�.");
		}else{
			System.out.println("�����Դϴ�.");
		}
		
		Week[] days = Week.values();
		for (Week day : days) {
			System.out.println(day);
		}
		
	}
}
