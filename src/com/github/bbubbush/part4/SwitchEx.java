package com.github.bbubbush.part4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchEx {
	public static void main(String[] args) throws IOException {
		/* 기존에 작성했던 학점출력을 switch문으로 만든 프로그램이다. 
		 * switch문은 해당 지점으로 점프한다는 점에서 if문의 순차접근과는 다르다. 다만 break가 없으면 하위 모든 조건을 순회하게된다.
		 * break문이 없어 하위조건을 계속 순회할 경우 조건에 상관없이 모두 순회하므로 주의해야한다.
		 * */
		int kor, eng, mat;
		float avg;
		String grade = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("국어 : ");
		kor = Integer.parseInt(br.readLine());
		System.out.print("영어 : ");
		eng = Integer.parseInt(br.readLine());
		System.out.print("수학 : ");
		mat = Integer.parseInt(br.readLine());
		
		avg = (kor + eng + mat) / 3.0f;
		
		switch ( (int) avg / 10 ) {
		case 10:
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";
			break;
		}
		
		System.out.println("당신의 학점은 " + grade + "입니다.");
	
	}
}
