package com.github.bbubbush.part2;

import java.math.BigDecimal;

public class PrimitiveDataType {
	public static void main(String[] args) {
		/*
		 * boolean���� 1byte���� ������ ����ϴ� ���� 1bit��. default value = false
		 * */ 
		boolean b = true;
		System.out.println("boolean b >>>" + b);
		
		/*
		 * 1byte�� �ڷ����̱� ������ 2^8 = 256��ŭ ǥ���� �����ϴ�. ���� -128 ~ 127 ���� ǥ���� ����(0������ ����� 2^7-1��)
		 * */ 
		byte bb = 127;
		System.out.println("byte bb + 1 >>>" + (bb+1));	// 128�� ����� �Ǽ� Ȯ���غ��� Ÿ���� int�� casting�ƴ�.
		Object obj = bb+1;
		System.out.println("obj.getClass() >>>" + obj.getClass() );
		
		/*
		 *  2 byte �ڷ���. 2^16��ŭ ǥ���� �����ϸ� -2^15 ~ 2^15-1 ���� ǥ��. �ڵ����� ������ �Ѿ�� �� int�� ĳ���õȴ�.
		 * */
		short s = -32768;
		System.out.println("short s + 1 >>>" + (s-1));
		obj = s-1;
		System.out.println(obj.getClass());
		
		/*
		 * char�� 2byte �ڷ���. �ַ� unicode Ȥ�� ascii code ��� 
		 * */
		char ch1 = 'A';
		char ch2 = '\u0041';	// unicode A
		
		System.out.println("ch1 + ch2 >>> " + ch1 + ch2);
		System.out.println("ch1 + ch2 >>> " + (ch1 + ch2));
		System.out.println("ch1 + ch2 >>> " + (char)(ch1 + ch2));
		
		// int�� ����
		
		/*
		 * �Ǽ������� float�� double�� �ִµ� �ε��Ҽ����� �̽��� ���� �Ǽ��� �ٷ� �� Bigdecimal�� ����ϴ°��� ����.
		 * */
		float f = 0.1f;
		double d = 0.1;
		System.out.println("0.1f + 0.1 >>>" + (f + d));
		BigDecimal bd1 = new BigDecimal("0.1");
		BigDecimal bd2 = new BigDecimal("0.1");
		System.out.println("bd1 + bd2 >>>" + bd1.add(bd2));
		
	}
}
