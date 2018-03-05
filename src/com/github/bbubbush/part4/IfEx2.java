package com.github.bbubbush.part4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfEx2 {
	public static void main(String[] args) throws IOException {
		/* Ű���带 ���� ���� ��ȣȭ�ϴ� ���α׷��̴�.
		 * �������� char�� String�� ���踦 �����ϴµ� �����ɷȴ�. ������ ������ ���� ���ϰ� �� �� �־��µ�
		 * String�� ��Ƽ� �ѹ��� ó���Ϸ��� �ϴ� ĳ������ ������ŭ �����Ӱ� ���� ���ߴ�.
		 * ��/��ȣȭ ��Ű�� ���α׷��� �ѹ� �������߰ڴ�.
		 * */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("��ȣ���� 3���� �Է��ϼ��� >>> ");
		String[] input_data = br.readLine().split("");
		System.out.println();
		System.out.print("Ű��ũ ���� �Է��ϼ���(����: 1~3) >>> ");
		char keyword = (char)(br.read());
		System.out.println("��ȣ���� ���۵Ǿ����ϴ�.");
		
		String result = "";
		for (String s : input_data) {
			result += (char)(s.charAt(0) + keyword - '0');
		}
		
		System.out.println("���۵� ��ȣ���� " + result + "�Դϴ�.");
		
		System.out.println("[ ������ ]");
		System.out.println("Ű����� " + keyword + "�Դϴ�.");
		System.out.println("������ ��ȣ���� " + result + "�Դϴ�.");
		
	}
}
