package com.github.bbubbush.part10;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {
	StringTokenizer st;
	
	public StringTokenizerEx1(String str){
		System.out.println("str >>> " + str);
		this.st = new StringTokenizer(str);	
	}
	
	public StringTokenizerEx1(String str, String delim){
		System.out.println("str >>> " + str);
		this.st = new StringTokenizer(str, delim);
	}
	
	public StringTokenizerEx1(String str, String delim, boolean returnDelims){
		System.out.println("str >>> " + str);
		this.st = new StringTokenizer(str, delim, returnDelims);
	}
	
	public void print(){
		System.out.println("Token count >>> " + st.countTokens());		// token된 자원의 수를 반환
		while( st.hasMoreTokens() ){		// token할 수 있는 자원이 존재하면 true, 아니면 false를 리턴
			System.out.println(st.nextToken());		// token된 자원을 반환하고 제거. 이로 인해 countTokens의 값에 영향을 끼침
		}
		
		System.out.println("------------------------------------------------");
	}
	public static void main(String[] args) {
		/* StringTokenizer class
		 * 문자열을 구분자(delimiter)를 기준으로하여 분할한다.
		 * split()은 공백도 자리를 차지하는거에 비해 StringTokenizer는 공백을 무시하고 제거한다.
		 * 
		 * delimiter가 없는 경우 white space, tab, new line 등을 delimiter로 삼아 분할한다.
		 * 세번째 인자인 returnDilem이 true일 경우, delimiter까지 포함하여 분할한다. default value는 false이다.
		 * */
		
		StringTokenizerEx1 st1 = new StringTokenizerEx1("Happy day");		// delimiter가 없는 경우 
		st1.print();
		
		StringTokenizerEx1 st2 = new StringTokenizerEx1("2005/08/15", "/");	// delimiter가 있는 경우
		st2.print();
		
		StringTokenizerEx1 st3 = new StringTokenizerEx1("2005/08/15", "/", true);	// delimiter가 있는 경우
		st3.print();
		
	}
}
