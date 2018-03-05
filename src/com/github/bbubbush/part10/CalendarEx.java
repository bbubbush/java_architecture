package com.github.bbubbush.part10;

import java.util.Calendar;
import java.util.Date;

public class CalendarEx {
	public static void main(String[] args) {
		/* Calendar class
		 * 일반적인 달력, 시간의 기능을 선언하는 클래스이다.
		 * 
		 * Calendar class와 관련된 재밌는 이야기는 com.github.bbubbush.test 안에 담겨있다.(Naver D2의 글을 참고)
		 * 
		 *  */
		StringBuffer sb = new StringBuffer("년중 ");
		Calendar now = Calendar.getInstance();
		int week_yy = now.get(Calendar.WEEK_OF_YEAR);
		int yy = now.get(Calendar.YEAR);
		int mm = now.get(Calendar.MONTH) + 1;	// 1월이 0이다.
		int dd = now.get(Calendar.DAY_OF_MONTH);
		sb.append(week_yy);
		sb.append("주째인 ");
		sb.append(yy);
		sb.append("년 ");
		sb.append(mm);
		sb.append("월 ");
		sb.append(dd);
		sb.append("일 ");
		System.out.println(sb.toString());
				
		
	}
}
