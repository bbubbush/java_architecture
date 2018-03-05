package com.github.bbubbush.part3;
import java.io.*;

public class InputEx2 {
	public static void main(String[] args) throws IOException {
		/* 한자리의 숫자를 입력받는 코드. read()를 사용하면 byte단위로 입력을 받는다.
		 * 엔터키는 2byte의 문자로 입력되기 때문에 두번의 read()를 통해 buffer의 위치를 조정해야한다.
		 * */
		int num1;
		int num2;
		System.out.print("input first integer value : ");
		num1 = System.in.read()-48;
		System.in.read();	// 입력받은 엔터키의 값인 \r\n을 처리하기 위해 두번의 read를 수행
		System.in.read();
		System.out.print("input second integer value : ");
		num2 = System.in.read()-'0';
		System.out.println((num1 > num2? num1 : num2) + "이(가) 더 큽니다.");

	}
}
