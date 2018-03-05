package com.github.bbubbush.part5;

public class ArrayEx1 {
	public static void main(String[] args) {
		/* Array 기초
		 * 배열의 초기화 및 선언, 출력 방법 등
		 * main method도 String배열을 매개변수로 사용한다. args에 값을 넣기 위해선 java FileName arg1 arg2... 처럼 공백으로 구분해서 넣으면 된다.
		 * 배열은 ref로 4byte의 공간을 사용한다.
		 * */
		
		char[] ch;
		ch = new char[4];
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 'A';
		
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		System.out.println();
		
		
		for (char c : ch) {
			System.out.println(c);
		}
	}
}
