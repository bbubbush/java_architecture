package com.github.bbubbush.part10;

import java.util.Calendar;
import java.util.Date;

public class CalendarEx {
	public static void main(String[] args) {
		/* Calendar class
		 * �Ϲ����� �޷�, �ð��� ����� �����ϴ� Ŭ�����̴�.
		 * 
		 * Calendar class�� ���õ� ��մ� �̾߱�� com.github.bbubbush.test �ȿ� ����ִ�.(Naver D2�� ���� ����)
		 * 
		 *  */
		StringBuffer sb = new StringBuffer("���� ");
		Calendar now = Calendar.getInstance();
		int week_yy = now.get(Calendar.WEEK_OF_YEAR);
		int yy = now.get(Calendar.YEAR);
		int mm = now.get(Calendar.MONTH) + 1;	// 1���� 0�̴�.
		int dd = now.get(Calendar.DAY_OF_MONTH);
		sb.append(week_yy);
		sb.append("��°�� ");
		sb.append(yy);
		sb.append("�� ");
		sb.append(mm);
		sb.append("�� ");
		sb.append(dd);
		sb.append("�� ");
		System.out.println(sb.toString());
				
		
	}
}
