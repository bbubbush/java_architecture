package com.github.bbubbush.test;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

import org.junit.Test;

/* 예제 활용 자료: http://d2.naver.com/helloworld/645609 에서 발췌. */

public class JUnitExample{
	@Test
    public void shouldGetAfterOneDay() {
		/* 1582년 10월 4일의 다음 날은?
		 * 1582.10.05일 것 같지만 실제로는 1582.10.15일이다.
		 * 이는 그레고리력을 처음으로 적용하면서 기존에 사용하던 율리우스력에 의해 그동안 누적된 오차를 교정하기 위해 건너 뛴 기간이다.
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
		/* 서울 1961년 8월 9일 23시 59분의 1분 후는?
		 * 시간의 지역적 특성을 반영한 부분.
		 * 1961년 8월 10일은 대한민국의 표준시가 UTC+8:30에서 현재와 같은 UTC+9:00으로 변경되었다.
		 * 일제 강점기 동안 UTC+9:00을 유지하다 해방 이후 1954년에 UTC+8:30으로 바뀌었다.
		 * 1961년에 다시 UTC+9:00으로 변경하면서 30분이 사라지게 되었다.
		 * 
		 * 우리나라 근현대사와 관련된 이슈이다.
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
