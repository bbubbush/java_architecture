package com.github.bbubbush.part5;

public class ArrayEx5 {
	public static void main(String[] args) {
		/* �������� �迭
		 * �� �簢�� ������ �迭�� ������ �ʾƵ� �ȴ�.
		 * �ڹٿ��� �迭�� 1�������� ������ �ϱ� �����̴�. �̿� ���� �迭�� �������� �迭�̶�� �Ѵ�.
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
