package com.github.bbubbush.part3;
import java.io.*;

public class InputEx2 {
	public static void main(String[] args) throws IOException {
		/* ���ڸ��� ���ڸ� �Է¹޴� �ڵ�. read()�� ����ϸ� byte������ �Է��� �޴´�.
		 * ����Ű�� 2byte�� ���ڷ� �ԷµǱ� ������ �ι��� read()�� ���� buffer�� ��ġ�� �����ؾ��Ѵ�.
		 * */
		int num1;
		int num2;
		System.out.print("input first integer value : ");
		num1 = System.in.read()-48;
		System.in.read();	// �Է¹��� ����Ű�� ���� \r\n�� ó���ϱ� ���� �ι��� read�� ����
		System.in.read();
		System.out.print("input second integer value : ");
		num2 = System.in.read()-'0';
		System.out.println((num1 > num2? num1 : num2) + "��(��) �� Ů�ϴ�.");

	}
}
