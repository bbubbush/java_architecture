package com.github.bbubbush.part4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfEx2 {
	public static void main(String[] args) throws IOException {
		/* 키워드를 통해 평문을 암호화하는 프로그램이다.
		 * 생각보다 char와 String의 관계를 정리하는데 오래걸렸다. 변수를 나누어 쓰면 편하게 할 수 있었는데
		 * String에 담아서 한번에 처리하려고 하니 캐스팅이 생각만큼 자유롭게 되지 못했다.
		 * 암/복호화 시키는 프로그램을 한번 만들어봐야겠다.
		 * */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("암호문을 3글자 입력하세요 >>> ");
		String[] input_data = br.readLine().split("");
		System.out.println();
		System.out.print("키워크 값을 입력하세요(범위: 1~3) >>> ");
		char keyword = (char)(br.read());
		System.out.println("암호문이 전송되었습니다.");
		
		String result = "";
		for (String s : input_data) {
			result += (char)(s.charAt(0) + keyword - '0');
		}
		
		System.out.println("전송된 암호문은 " + result + "입니다.");
		
		System.out.println("[ 수신자 ]");
		System.out.println("키워드는 " + keyword + "입니다.");
		System.out.println("보내온 암호문은 " + result + "입니다.");
		
	}
}
