package com.github.bbubbush.part9;

import java.util.Calendar;

public class EnumEx2 {
	public static void main(String[] args) {
		/* enum ����2
		 * ������ �����Ǿ� �ִ� enum Ÿ���� ���� ������ ������ ����ϴ� ���α׷�
		 * enum�� ����� ������ŭ heap ������ ��ü�� �����ȴ�. Week�� ��� 7���� ����� �־ �� 7���� ��ü�� heap�� �����ȴ�.
		 * heap�� �ּҸ� ����Ű�� ������ ==�� ����ص� true, false�� ��Ȯ�� ���� �� �ִ�.
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
		
		System.out.println("������ " + today + "�Դϴ�.");
		
		if ( today == Week.SUNDAY ) {
			System.out.println("�Ͽ����� ���³� �Դϴ�.");
		}else{
			System.out.println("�����ϴ� ���Դϴ�.");
		}
		
	}
}
