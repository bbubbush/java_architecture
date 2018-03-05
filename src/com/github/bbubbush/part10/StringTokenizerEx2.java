package com.github.bbubbush.part10;

import java.util.StringTokenizer;

public class StringTokenizerEx2 {
	public static void main(String[] args) {
		/* StringTokenizer�� split()�� ����
		 * StringTokenizer: white space, tab, new line ���� ����
		 * split(): white space, tab, new line ���� ������ ������
		 * */
		String str = "�б�, ��,, ���ӹ�";
		StringTokenizer st = new StringTokenizer(str, ",");
		for (int i = 1; st.hasMoreTokens(); i++) {
			System.out.print("����" + i + " = " + st.nextToken() + "\t");
		}
		System.out.println();
		System.out.println("===============================================");
		
		String[] strArr = str.split(",");
		
		for (int i = 0; i < strArr.length; i++) {
			System.out.print("����" + (i+1) + " = " + strArr[i] + "\t");
		}
		System.out.println();
	}
}
