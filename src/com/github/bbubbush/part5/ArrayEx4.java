package com.github.bbubbush.part5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayEx4 {
	public static void main(String[] args) throws IOException {
		/* 다차원 배열을 통해 여러 학생의 성적을 처리하는 프로그램.
		 * args를 사용하는 실제 예제와 달리, br로 점수를 입력받는다.
		 * 과목명은 수학, 영어, 국어, 컴퓨터 이상 총 4개를 순서대로 사용한다. 
		 * 입력된 값을 이용해 총점, 평균, 학점, 등수를 구해 출력한다.
		 * 다른 부분은 식상할 수 있는데 등수 구하는 방법은 눈여겨 볼만하다. 복습할 때 다시한번 보면 좋다.
		 * */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 1. 총 학생 수 입력받기
		System.out.print("총 학생 수를 입력하세요 >>> ");
		int numberOfStudent = Integer.parseInt(br.readLine());
		
		// 2. 각 학생의 이름, 수학, 영어, 국어, 컴퓨터 순으로 정보를 입력받아 2차원 배열에 저장
		String [][] infoOfStudent = new String[numberOfStudent][6];
		for (int i = 0; i < numberOfStudent; i++) {
			System.out.println(i+1 + "번째 학생의 이름과 수학, 영어, 국어, 컴퓨터 점수를 공백으로 구분해 입력해주세요. e.g 홍길동 99 80 100 77");
			infoOfStudent[i] = (br.readLine() + " 0").split(" ");	// 총점 공간을 0으로 초기화 하기 위한 값
			// 총점구하기
			for (int j = 1; j < infoOfStudent[i].length-1; j++) {
				infoOfStudent[i][infoOfStudent[i].length-1] = Integer.parseInt(infoOfStudent[i][infoOfStudent[i].length-1]) + Integer.parseInt(infoOfStudent[i][j]) + "";
			}
			System.out.println();
		}
		
		// 3. 학생별 평균 구하기
		float[] avg = new float[numberOfStudent];
		for (int i = 0; i < infoOfStudent.length; i++) {
			float totalScore = Float.parseFloat(infoOfStudent[i][infoOfStudent[i].length-1]) / 4.f;
			avg[i] = (int)((totalScore + 0.005f) * 100) / 100.f;			// 셋째자리에서 반올림
		}
		
		// 4. 학점 계산하기
		String[] grade = new String[numberOfStudent];
		for (int i = 0; i < infoOfStudent.length; i++) {
			switch ( (int)avg[i] / 10 ) {
			case 10:
			case 9:
				grade[i] = "A";
				break;
			case 8:
				grade[i] = "B";
				break;
			case 7:
				grade[i] = "C";
				break;
			case 6:
				grade[i] = "D";
				break;
			default:
				grade[i] = "F";
				break;
			}
		}
		
		// 5. 등수 구하기	
		int[] rank = new int[numberOfStudent];
		for (int i = 0; i < infoOfStudent.length; i++) {
			rank[i]++;
			for (int j = 0; j < infoOfStudent.length; j++) {
				if (Integer.parseInt(infoOfStudent[i][infoOfStudent[i].length-1]) < Integer.parseInt(infoOfStudent[j][infoOfStudent[i].length-1])){
					rank[i]++;
				}
			}
		}
		
		// 6. 성적표 출력
		System.out.println();
		System.out.println("\t========== [ 성적표 ] ==========\t");
		System.out.println("이름\t|\t수학\t|\t영어\t|\t국어\t|\t컴퓨터\t|\t총점\t|\t평균\t|\t등수");
		for (int i = 0; i < numberOfStudent; i++) {
			System.out.println(infoOfStudent[i][0] + "\t:\t" + infoOfStudent[i][1] + "\t:\t" + infoOfStudent[i][2] + "\t:\t" + infoOfStudent[i][4] + "\t:\t" + infoOfStudent[i][5] + "\t:\t" + avg[i] + "\t:\t" + rank[i]);
		}
		
		
	}// end of main
}// end of class
