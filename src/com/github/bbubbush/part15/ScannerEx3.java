package com.github.bbubbush.part15;

import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class ScannerEx3 {
	public static void main(String[] args) {
		/* Scanner URL로부터 읽어오기
		 * 생소하게 사용하지만 URL로부터 데이터를 읽어오는 방법이다.
		 * 네트워크 및 URL 관련 객체가 생소해 낯설게 느껴지지만 익숙해지면 다양한 작업을 시도할 수 있다.
		 * URL객체와 URLConnection 객체의 활용에 대한 추가공부가 필요하다.
		 * */
		URLConnection urlCon = null;
		Scanner sc = null;
		try {
			urlCon = new URL("https://www.google.co.kr/").openConnection();
			sc = new Scanner(urlCon.getInputStream());
			sc.useDelimiter("\\Z");
			String text = sc.next();
			System.out.println(text);
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			sc.close();
		}
	}
}
