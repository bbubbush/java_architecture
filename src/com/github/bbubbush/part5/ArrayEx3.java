package com.github.bbubbush.part5;

public class ArrayEx3 {
	public static void main(String[] args) {
		/* �������迭 ���ʿ���
		 * �������� ���缭 for�� depth�� �����ȴ�. n���� �迭�� ����� n�� for������ ����Ѵ�.
		 * */
		
		int[][] test;
		test = new int[2][3];
		test[0][0] = 100;
		test[0][1] = 200;
		test[0][2] = 300;
		
		test[1][0] = 400;
		test[1][1] = 500;
		test[1][2] = 600;
		
		for (int i = 0; i < test.length; i++) {
			for (int j = 0; j < test[i].length; j++) {
				System.out.println("test[" + i + "][" + j + "] >>> " + test[i][j]);
			}
			System.out.println();
		}
	}
}
