package com.github.bbubbush.part3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputEx3 {
	public static void main(String[] args) throws IOException {
		/* �� �ʿ�� �������� BufferedReader�� �������� ����ϴ� �迡 �ٽ��ѹ� ������ ���� ���� ����.
		 * */
		String name, age, addr, tel;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Name : ");
		name = br.readLine();
		System.out.println("Age :");
		age = br.readLine();
		System.out.println("Addr : ");
		addr = br.readLine();
		System.out.println("Tel : ");
		tel = br.readLine();
		System.out.println();
		System.out.println(name + " ��");
		System.out.println(age + "�� �׿�.");
		System.out.println(addr + "�� ��ô� ����.");
		System.out.println(tel + "�� ��ȭ �帮�ڽ��ϴ�.");
	}
}
