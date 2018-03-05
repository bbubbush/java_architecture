package com.github.bbubbush.part5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayEx2 {
	public static void main(String[] args) throws IOException {
		/* 배열을 활용하여 한 명의 학생에 대한 성적처리 프로그램
		 * 기존 예제는 args를 사용해 처리하지만 별도의 변수를 만들어 작성.
		 * */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 1. 전체 과목수 입력
		int length = 0;
		System.out.print("전체 과목의 수를 입력해주세요 >>> ");
		length = Integer.parseInt(br.readLine());
		
		// 2. 전체 과목과 점수를 담을 배열을 생성 및 입력값으로 초기화
		String[] subject = new String[length];
		int[] score = new int[length+1];
		
		for (int i = 0; i < length; i++) {
			System.out.print(i+1 + "번째 과목명을 입력하세요 >> ");
			subject[i] = br.readLine();
			System.out.print(subject[i] + "의 점수를 입력하세요 >> ");
			score[i] = Integer.parseInt(br.readLine());
			score[length] += score[i];	// total score
		}
		
		// 3. avg 구하기
		float average = score[length] / (float)length;
		float average2 = score[length] / (float)length;
		float average3 = score[length] / (float)length;
		System.out.println(average);
		average = (int)((average2 + 0.005) * 100)/100.0f;	// 소수점 셋째자리에서 반올림(round)
		average2 = (int)(average * 100)/100.0f;				// 소수점 셋째자리에서 버림(floor)
		average3 = (int)((average3 + 0.009) * 100)/100.0f;	// 소수점 셋째자리에서 올림()
		System.out.println(average);
		System.out.println(average2);
		System.out.println(average3);
		
		// 4. 성적 구하기
		String grade = "";
		switch ( (int)average / 10 ){
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
		
		System.out.println();
		System.out.println("\t========== [ 성적표 ] ==========\t");
		System.out.println("과목명\t\t|\t\t점수");
		for (int i = 0; i < subject.length; i++) {
			System.out.println(subject[i] + "\t\t:\t\t" + score[i]);
		}
		System.out.println();
		System.out.println("총점\t\t:\t\t" + score[length]);
		System.out.println("평균\t\t:\t\t" + average);
		System.out.println("학점\t\t:\t\t" + grade);
	}

}
