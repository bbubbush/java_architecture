package com.github.bbubbush.part10;

import java.util.StringTokenizer;

public class StringTokenizerEx2 {
	public static void main(String[] args) {
		/* StringTokenizer와 split()의 차이
		 * StringTokenizer: white space, tab, new line 등은 제거
		 * split(): white space, tab, new line 등이 공간을 차지함
		 * */
		String str = "학교, 집,, 게임방";
		StringTokenizer st = new StringTokenizer(str, ",");
		for (int i = 1; st.hasMoreTokens(); i++) {
			System.out.print("문자" + i + " = " + st.nextToken() + "\t");
		}
		System.out.println();
		System.out.println("===============================================");
		
		String[] strArr = str.split(",");
		
		for (int i = 0; i < strArr.length; i++) {
			System.out.print("문자" + (i+1) + " = " + strArr[i] + "\t");
		}
		System.out.println();
	}
}
