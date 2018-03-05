package com.github.bbubbush.test;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

import org.junit.Test;

/* ���� Ȱ�� �ڷ�: http://d2.naver.com/helloworld/645609 ���� ����. */

public class JUnitExample{
	@Test
    public void shouldGetAfterOneDay() {
		/* 1582�� 10�� 4���� ���� ����?
		 * 1582.10.05�� �� ������ �����δ� 1582.10.15���̴�.
		 * �̴� �׷������� ó������ �����ϸ鼭 ������ ����ϴ� �����콺�¿� ���� �׵��� ������ ������ �����ϱ� ���� �ǳ� �� �Ⱓ�̴�.
		 */ 
        TimeZone utc = TimeZone.getTimeZone("UTC");
        Calendar calendar = Calendar.getInstance(utc);
        calendar.set(1582, Calendar.OCTOBER , 4);
        String pattern = "yyyy.MM.dd";
        String theDay = toString(calendar, pattern, utc);
        assertEquals("1582.10.04", theDay);


        calendar.add(Calendar.DATE, 1);
        String nextDay = toString(calendar, pattern, utc);
//        assertEquals("1582.10.05", nextDay);	// fail
        assertEquals("1582.10.15", nextDay);	// success
    }
	
	@Test
	public void shouldGetAfterOneMinute() { 
		/* ���� 1961�� 8�� 9�� 23�� 59���� 1�� �Ĵ�?
		 * �ð��� ������ Ư���� �ݿ��� �κ�.
		 * 1961�� 8�� 10���� ���ѹα��� ǥ�ؽð� UTC+8:30���� ����� ���� UTC+9:00���� ����Ǿ���.
		 * ���� ������ ���� UTC+9:00�� �����ϴ� �ع� ���� 1954�⿡ UTC+8:30���� �ٲ����.
		 * 1961�⿡ �ٽ� UTC+9:00���� �����ϸ鼭 30���� ������� �Ǿ���.
		 * 
		 * �츮���� �������� ���õ� �̽��̴�.
		 * */
	    TimeZone seoul = TimeZone.getTimeZone("Asia/Seoul");
	    Calendar calendar = Calendar.getInstance(seoul);
	    calendar.set(1961, Calendar.AUGUST, 9, 23, 59);
	    String pattern = "yyyy.MM.dd HH:mm";
	    String theTime = toString(calendar, pattern, seoul);
	    assertEquals("1961.08.09 23:59", theTime);

	    calendar.add(Calendar.MINUTE, 1);
	    String after1Minute = toString(calendar, pattern, seoul);
	    assertEquals("1961.08.10 00:00", after1Minute);	// fail
	    assertEquals("1961.08.10 00:30", after1Minute);	// success
	}
	
    private String toString(Calendar calendar, String pattern, TimeZone zone) {
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        format.setTimeZone(zone);
        return format.format(calendar.getTime());
    }

}// end of JUnitExample class
