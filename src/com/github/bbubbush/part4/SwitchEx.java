package com.github.bbubbush.part4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchEx {
	public static void main(String[] args) throws IOException {
		/* ������ �ۼ��ߴ� ��������� switch������ ���� ���α׷��̴�. 
		 * switch���� �ش� �������� �����Ѵٴ� ������ if���� �������ٰ��� �ٸ���. �ٸ� break�� ������ ���� ��� ������ ��ȸ�ϰԵȴ�.
		 * break���� ���� ���������� ��� ��ȸ�� ��� ���ǿ� ������� ��� ��ȸ�ϹǷ� �����ؾ��Ѵ�.
		 * */
		int kor, eng, mat;
		float avg;
		String grade = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("���� : ");
		kor = Integer.parseInt(br.readLine());
		System.out.print("���� : ");
		eng = Integer.parseInt(br.readLine());
		System.out.print("���� : ");
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
		
		System.out.println("����� ������ " + grade + "�Դϴ�.");
	
	}
}
