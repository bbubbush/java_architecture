package com.github.bbubbush.part4;

public class ForEx {
	public static void main(String[] args) {
		/* for���� ���� ����ϰ� �����ϹǷ� ���⿡ ��� ������ ���Ƽ� �ۼ�.
		 * �ַ� label�� ���ؼ��� �ּ��� �ް� �������� ������ �Ѿ
		 * */
		
		// 2�� for��
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d\t*\t%d\t=\t%d\n", i, j, i*j);
			}
			System.out.println();
		}
		
		/* label�� for������ �����ڸ� �־� break�� continue�� �����ϰ� ���� for���� ������ �� �ִ�.
		 * stackoverflow������ label�� ������ ������� goto�� ������ �ٸ����� ���� ���� �ִ�. goto�ʹ� �ٸ��� for�� ������ �����Ǿ� ���Ǳ� ������
		 * �̺κп� �־� �ٸ��� �����ϴ� ��Ȳ������, label�� ����Կ� �־� ���������� �ʴ�. �Ƹ� for������ �ٴ� label�� �������� ����߸��� ������ �� ����.
		 * */
		// break label ���
		System.out.println("break lable>>>");
		First:
		for (int i = 0; i < 100; i++) {
			Secend:
			for (int j = 0; j < 100; j++) {
				if (i * j == 10) {
					System.out.println(i + ", " + j);
					break First;
				}
			}
			System.out.println("i >>> " + i);
		}
		
		// continue label ���
		System.out.println("continue lable>>>");
		First:
		for (int i = 0; i < 100; i++) {
			Secend:
				for (int j = 0; j < 100; j++) {
					if (i * j == 10) {
						System.out.println(i + ", " + j);
						continue First;
					}
				}
			System.out.println("i >>> " + i);
		}
		
		/* java 5.0���� ��� ������ foreach���̴�.
		 * ��ü �迭�� ��ȸ�ϸ鼭 �迭 �� ��� ���� �����Ѵ�.
		 * */
		// foreach
		System.out.println("foreach>>>");
		String[] str_list = {"A", "B", "C"};
		for (String s : str_list) {
			System.out.println(s);
		}
		
		
		
		
	}
}
