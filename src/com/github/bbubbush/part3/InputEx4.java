package com.github.bbubbush.part3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputEx4 {
	public static void main(String[] args) throws IOException {
		/* �߾￡ ���� �Ǵ� ���� �Է¹޾� �����̳� ��� ����ϴ� ���α׷��̴�.
		 * */
		int kor, eng, mat, hap;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("���� = ");
		kor = Integer.parseInt(br.readLine());
		System.out.print("���� = ");
		eng = Integer.parseInt(br.readLine());
		System.out.print("���� = ");
		mat = Integer.parseInt(br.readLine());
		
		hap = kor + eng + mat;
		System.out.println();
		System.out.println("���� = " + hap);
	}
}
