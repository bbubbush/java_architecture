package com.github.bbubbush.part4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfEx1 {
	public static void main(String[] args) throws IOException {
		/* ������ �Է¹޾� ����� ����ϴ� ���α׷�
		 *  if���� ũ�� ����� ������ ������ �������Ǻ��� ������������ ���������� ����ȴ�.
		 *  ���� ���� ū ������ ������ �־�� �Ѵ�. 
		 *  ���� ������ ���������� �����ϱ� ������ ���� ���ǿ� ���� ���ؼ� ���� ������ ��� ���ľ� �Ѵ�.
		 *  �߰�ȣ�� ������ �����̸� �����ص� ���������� �ٸ� �����ڰ� ���⿡ ����Ƿ� ���� ������ �ƴϴ�.
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
