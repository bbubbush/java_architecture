package com.github.bbubbush.part2;

import java.math.BigDecimal;

public class PrimitiveDataType {
	public static void main(String[] args) {
		/*
		 * boolean값은 1byte지만 실제로 사용하는 것은 1bit뿐. default value = false
		 * */ 
		boolean b = true;
		System.out.println("boolean b >>>" + b);
		
		/*
		 * 1byte의 자료형이기 때문에 2^8 = 256만큼 표현이 가능하다. 따라서 -128 ~ 127 까지 표현이 가능(0때문에 양수는 2^7-1개)
		 * */ 
		byte bb = 127;
		System.out.println("byte bb + 1 >>>" + (bb+1));	// 128로 출력이 되서 확인해보니 타입이 int로 casting됐다.
		Object obj = bb+1;
		System.out.println("obj.getClass() >>>" + obj.getClass() );
		
		/*
		 *  2 byte 자료형. 2^16만큼 표현이 가능하며 -2^15 ~ 2^15-1 까지 표현. 자동으로 범위를 넘어가면 다 int로 캐스팅된다.
		 * */
		short s = -32768;
		System.out.println("short s + 1 >>>" + (s-1));
		obj = s-1;
		System.out.println(obj.getClass());
		
		/*
		 * char는 2byte 자료형. 주로 unicode 혹은 ascii code 사용 
		 * */
		char ch1 = 'A';
		char ch2 = '\u0041';	// unicode A
		
		System.out.println("ch1 + ch2 >>> " + ch1 + ch2);
		System.out.println("ch1 + ch2 >>> " + (ch1 + ch2));
		System.out.println("ch1 + ch2 >>> " + (char)(ch1 + ch2));
		
		// int는 생략
		
		/*
		 * 실수형에는 float과 double이 있는데 부동소수점의 이슈로 인해 실수를 다룰 땐 Bigdecimal을 사용하는것이 좋다.
		 * */
		float f = 0.1f;
		double d = 0.1;
		System.out.println("0.1f + 0.1 >>>" + (f + d));
		BigDecimal bd1 = new BigDecimal("0.1");
		BigDecimal bd2 = new BigDecimal("0.1");
		System.out.println("bd1 + bd2 >>>" + bd1.add(bd2));
		
	}
}
