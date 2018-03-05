package com.github.bbubbush.part5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayEx4 {
	public static void main(String[] args) throws IOException {
		/* ������ �迭�� ���� ���� �л��� ������ ó���ϴ� ���α׷�.
		 * args�� ����ϴ� ���� ������ �޸�, br�� ������ �Է¹޴´�.
		 * ������� ����, ����, ����, ��ǻ�� �̻� �� 4���� ������� ����Ѵ�. 
		 * �Էµ� ���� �̿��� ����, ���, ����, ����� ���� ����Ѵ�.
		 * �ٸ� �κ��� �Ļ��� �� �ִµ� ��� ���ϴ� ����� ������ �����ϴ�. ������ �� �ٽ��ѹ� ���� ����.
		 * */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 1. �� �л� �� �Է¹ޱ�
		System.out.print("�� �л� ���� �Է��ϼ��� >>> ");
		int numberOfStudent = Integer.parseInt(br.readLine());
		
		// 2. �� �л��� �̸�, ����, ����, ����, ��ǻ�� ������ ������ �Է¹޾� 2���� �迭�� ����
		String [][] infoOfStudent = new String[numberOfStudent][6];
		for (int i = 0; i < numberOfStudent; i++) {
			System.out.println(i+1 + "��° �л��� �̸��� ����, ����, ����, ��ǻ�� ������ �������� ������ �Է����ּ���. e.g ȫ�浿 99 80 100 77");
			infoOfStudent[i] = (br.readLine() + " 0").split(" ");	// ���� ������ 0���� �ʱ�ȭ �ϱ� ���� ��
			// �������ϱ�
			for (int j = 1; j < infoOfStudent[i].length-1; j++) {
				infoOfStudent[i][infoOfStudent[i].length-1] = Integer.parseInt(infoOfStudent[i][infoOfStudent[i].length-1]) + Integer.parseInt(infoOfStudent[i][j]) + "";
			}
			System.out.println();
		}
		
		// 3. �л��� ��� ���ϱ�
		float[] avg = new float[numberOfStudent];
		for (int i = 0; i < infoOfStudent.length; i++) {
			float totalScore = Float.parseFloat(infoOfStudent[i][infoOfStudent[i].length-1]) / 4.f;
			avg[i] = (int)((totalScore + 0.005f) * 100) / 100.f;			// ��°�ڸ����� �ݿø�
		}
		
		// 4. ���� ����ϱ�
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
		
		// 5. ��� ���ϱ�	
		int[] rank = new int[numberOfStudent];
		for (int i = 0; i < infoOfStudent.length; i++) {
			rank[i]++;
			for (int j = 0; j < infoOfStudent.length; j++) {
				if (Integer.parseInt(infoOfStudent[i][infoOfStudent[i].length-1]) < Integer.parseInt(infoOfStudent[j][infoOfStudent[i].length-1])){
					rank[i]++;
				}
			}
		}
		
		// 6. ����ǥ ���
		System.out.println();
		System.out.println("\t========== [ ����ǥ ] ==========\t");
		System.out.println("�̸�\t|\t����\t|\t����\t|\t����\t|\t��ǻ��\t|\t����\t|\t���\t|\t���");
		for (int i = 0; i < numberOfStudent; i++) {
			System.out.println(infoOfStudent[i][0] + "\t:\t" + infoOfStudent[i][1] + "\t:\t" + infoOfStudent[i][2] + "\t:\t" + infoOfStudent[i][4] + "\t:\t" + infoOfStudent[i][5] + "\t:\t" + avg[i] + "\t:\t" + rank[i]);
		}
		
		
	}// end of main
}// end of class
