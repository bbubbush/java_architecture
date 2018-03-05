package com.github.bbubbush.part5;

public class ArrayEx5 {
	public static void main(String[] args) {
		/* 가변길이 배열
		 * 꼭 사각형 형태의 배열을 만들지 않아도 된다.
		 * 자바에서 배열은 1차원씩만 관리를 하기 때문이다. 이와 같은 배열을 가변길이 배열이라고 한다.
		 * */
		int[][] test = new int[3][];
		test[0] = new int[3];
		test[1] = new int[1];
		test[2] = new int[5];
		for (int i = 0; i < test.length; i++) {
			for (int j = 0; j < test[i].length; j++) {
				System.out.print(test[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
