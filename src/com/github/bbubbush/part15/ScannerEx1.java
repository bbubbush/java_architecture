package com.github.bbubbush.part15;

import java.util.Scanner;

public class ScannerEx1 {
	public static void main(String[] args) {
		/* Scanner �⺻ ����
		 * JDK 5.0�� �����Ͽ� IO�� �־� ������ �����Ѵ�. ���� ��ĳ�ʴ� ������ Stream ��ü���� ��뿡 ���Ǹ� ���� ��ü���� �ν��ؾ��Ѵ�.
		 * 
		 * ��ĳ�� ��ü�� �����ڸ� ũ�� 4���� ���·� �����Ѵ�.
		 * Scanner(File source)		>>>	File ��ü�� �޴´�.
		 * Scanner(InputStream source)		>>>	Ű���带 ���� �Է��� �޴´�.
		 * Scanner(Readable source)		>>>	Reader ��ü�� �޴´�.(e.g. FileReade)
		 * Scanner(String source)		>>>	���ڿ��� �Է¹޾� �ʱ�ȭ ��Ų��.
		 * 
		 * ����ϰ� ����ϴ� ���� InputStream�̰����� �ٸ� �������� Ȱ����� �����ؾ��Ѵ�.
		 * */
		System.out.print("input data >>> ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.printf("num >>> %d", num);
		sc.close();
	}
}
