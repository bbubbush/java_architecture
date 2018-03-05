package com.github.bbubbush.part5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayEx2 {
	public static void main(String[] args) throws IOException {
		/* �迭�� Ȱ���Ͽ� �� ���� �л��� ���� ����ó�� ���α׷�
		 * ���� ������ args�� ����� ó�������� ������ ������ ����� �ۼ�.
		 * */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 1. ��ü ����� �Է�
		int length = 0;
		System.out.print("��ü ������ ���� �Է����ּ��� >>> ");
		length = Integer.parseInt(br.readLine());
		
		// 2. ��ü ����� ������ ���� �迭�� ���� �� �Է°����� �ʱ�ȭ
		String[] subject = new String[length];
		int[] score = new int[length+1];
		
		for (int i = 0; i < length; i++) {
			System.out.print(i+1 + "��° ������� �Է��ϼ��� >> ");
			subject[i] = br.readLine();
			System.out.print(subject[i] + "�� ������ �Է��ϼ��� >> ");
			score[i] = Integer.parseInt(br.readLine());
			score[length] += score[i];	// total score
		}
		
		// 3. avg ���ϱ�
		float average = score[length] / (float)length;
		float average2 = score[length] / (float)length;
		float average3 = score[length] / (float)length;
		System.out.println(average);
		average = (int)((average2 + 0.005) * 100)/100.0f;	// �Ҽ��� ��°�ڸ����� �ݿø�(round)
		average2 = (int)(average * 100)/100.0f;				// �Ҽ��� ��°�ڸ����� ����(floor)
		average3 = (int)((average3 + 0.009) * 100)/100.0f;	// �Ҽ��� ��°�ڸ����� �ø�()
		System.out.println(average);
		System.out.println(average2);
		System.out.println(average3);
		
		// 4. ���� ���ϱ�
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
		System.out.println("\t========== [ ����ǥ ] ==========\t");
		System.out.println("�����\t\t|\t\t����");
		for (int i = 0; i < subject.length; i++) {
			System.out.println(subject[i] + "\t\t:\t\t" + score[i]);
		}
		System.out.println();
		System.out.println("����\t\t:\t\t" + score[length]);
		System.out.println("���\t\t:\t\t" + average);
		System.out.println("����\t\t:\t\t" + grade);
	}

}
