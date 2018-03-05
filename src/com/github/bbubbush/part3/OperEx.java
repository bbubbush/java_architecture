package com.github.bbubbush.part3;

public class OperEx {
	public static void main(String[] args) {
		/*
		 * 단항연산자: !, ~, +/-, ++/--, (cast) 
		 * 전휘형증감과 후휘형증감은 연산순서에 차이가 크다. 
		 * */
		int x = 10;
		int y = ++x;		// 대입연산자보다 전휘형증감연산자가 더 우선순위가 높아 증가된 상태로 입력된다.
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		x = 10;
		y = x++;			// 후휘형증감연산자는 이미 대입이 이루어진 후에 증감연산을 실행한다.
		System.out.println("x1 = " + x);
		System.out.println("y1 = " + y);
		
		/*
		 * 산술연산자: +, -, *, /, % 
		 * 결과의 기본타입은 int이며, int보다 큰 자료형의 경우 큰 자료형을 따라감.
		 * */
		short a, b;
		a = b = 10;
		Object obj = a;
		System.out.println(obj.getClass());
		obj = b;
		System.out.println(obj.getClass());
		obj = a + b;
		System.out.println(obj.getClass());
		System.out.println();
		//short c = a + b;		 short끼리의 연산이지만 return type이 int
		
		/*
		 * 시프트 연산: 변수를 2진 비트로 변형 후 특정 비트 수만큼 이동시켜 원하는 부분의 비트데이터를 얻어내는 연산자.
		 * <<, >>, >>>가 있다. 논리연산인지, 산술연산인지에 따라 맞게 사용하면 된다.(unsigned에 따라 활용이 다름)
		 * */
		int i = -10;
		int j = i >>> 2;
		System.out.println("i = " + i + " j = " + j);
		i = 1;
		for (int j2 = 1; j2 <= 10; j2++) {
			System.out.println(i << j2);
		}
		
		/*
		 * 비트연산자: &, |, ^
		 * and, or, exclusive or연산을 할 수 있다. 잘 활용하면 생각보다 활용도가 높다.
		 * */
		System.out.println(14 & 1);		// 1110 & 0001
		System.out.println(14 | 1);		// 1110 | 0001
		System.out.println(14 ^ 1);		// 1110 ^ 0001
		
		/*
		 * 논리연산자: &&, || 
		 * 사실 별거 없는데 short circuit을 설명하기 위해 적었다.
		 * */
		x = 1;
		y = 1;
		
		if( (++x == 2) || (++y == 2) ){		//  A || B의 경우, A가 ture면 B를 연산하지 않고 넘어간다.
			System.out.println("x = " + x + ", y = " + y);
		}
		
		if( (++x == 2) && (++y == 2) ){		//  A && B의 경우, A가 false면 B를 연산하지 않고 넘어간다.
			System.out.println("x = " + x + ", y = " + y);
		}
		System.out.println("x = " + x + ", y = " + y);
		
		/*
		 * 정수를 정수를 0으로 나누면 ArithmeticException이 발생하지만 소수를 소수인 0으로 나누면 infinity가 뜬다.
		 * */
		float f1 = 10;
		float f2 = 0;
		System.out.println(f1/f2);
		//System.out.println(1/0);
	}
}
