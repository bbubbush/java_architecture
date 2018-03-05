package com.github.bbubbush.part5;

public class ArrayEx3 {
	public static void main(String[] args) {
		/* 다차원배열 기초예제
		 * 차원수에 맞춰서 for의 depth도 결정된다. n차원 배열의 출력은 n중 for문으로 출력한다.
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
