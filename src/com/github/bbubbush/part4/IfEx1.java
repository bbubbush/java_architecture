package com.github.bbubbush.part4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfEx1 {
	public static void main(String[] args) throws IOException {
		/* 성적을 입력받아 등급을 출력하는 프로그램
		 *  if문은 크게 어려운 내용은 없으나 상위조건부터 하위조건으로 순차적으로 진행된다.
		 *  따라서 가장 큰 조건을 상위에 주어야 한다. 
		 *  또한 무조건 순차적으로 접근하기 때문에 하위 조건에 가기 위해선 상위 조건을 모두 거쳐야 한다.
		 *  중괄호의 내용이 한줄이면 생략해도 동작하지만 다른 개발자가 보기에 힘드므로 좋은 습관이 아니다.
		 * */
		int score = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
		String grade = null;
		
		if( score >= 90 ){
			grade = "A";
		}else if( score >= 80 ){
			grade = "B";
		}else if(score >= 70){
			grade = "C";
		}else if(score >= 60){
			grade = "D";
		}else{
			grade = "F";
		}
		
		System.out.println("Your grade is " + grade + ".");
	}
}
