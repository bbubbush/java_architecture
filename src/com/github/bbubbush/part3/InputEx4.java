package com.github.bbubbush.part3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputEx4 {
	public static void main(String[] args) throws IOException {
		/* 추억에 잠기게 되는 과목 입력받아 총점이나 평균 출력하는 프로그램이다.
		 * */
		int kor, eng, mat, hap;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("국어 = ");
		kor = Integer.parseInt(br.readLine());
		System.out.print("영어 = ");
		eng = Integer.parseInt(br.readLine());
		System.out.print("수학 = ");
		mat = Integer.parseInt(br.readLine());
		
		hap = kor + eng + mat;
		System.out.println();
		System.out.println("총점 = " + hap);
	}
}
