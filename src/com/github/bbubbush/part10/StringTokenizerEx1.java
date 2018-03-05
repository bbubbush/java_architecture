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
		System.out.println("Token count >>> " + st.countTokens());		// token�� �ڿ��� ���� ��ȯ
		while( st.hasMoreTokens() ){		// token�� �� �ִ� �ڿ��� �����ϸ� true, �ƴϸ� false�� ����
			System.out.println(st.nextToken());		// token�� �ڿ��� ��ȯ�ϰ� ����. �̷� ���� countTokens�� ���� ������ ��ħ
		}
		
		System.out.println("------------------------------------------------");
	}
	public static void main(String[] args) {
		/* StringTokenizer class
		 * ���ڿ��� ������(delimiter)�� ���������Ͽ� �����Ѵ�.
		 * split()�� ���鵵 �ڸ��� �����ϴ°ſ� ���� StringTokenizer�� ������ �����ϰ� �����Ѵ�.
		 * 
		 * delimiter�� ���� ��� white space, tab, new line ���� delimiter�� ��� �����Ѵ�.
		 * ����° ������ returnDilem�� true�� ���, delimiter���� �����Ͽ� �����Ѵ�. default value�� false�̴�.
		 * */
		
		StringTokenizerEx1 st1 = new StringTokenizerEx1("Happy day");		// delimiter�� ���� ��� 
		st1.print();
		
		StringTokenizerEx1 st2 = new StringTokenizerEx1("2005/08/15", "/");	// delimiter�� �ִ� ���
		st2.print();
		
		StringTokenizerEx1 st3 = new StringTokenizerEx1("2005/08/15", "/", true);	// delimiter�� �ִ� ���
		st3.print();
		
	}
}
