package com.github.bbubbush.part3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputEx3 {
	public static void main(String[] args) throws IOException {
		/* 할 필요는 없었지만 BufferedReader를 오랜만에 사용하는 김에 다시한번 사용법을 보기 위해 썻다.
		 * */
		String name, age, addr, tel;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Name : ");
		name = br.readLine();
		System.out.println("Age :");
		age = br.readLine();
		System.out.println("Addr : ");
		addr = br.readLine();
		System.out.println("Tel : ");
		tel = br.readLine();
		System.out.println();
		System.out.println(name + " 씨");
		System.out.println(age + "세 네요.");
		System.out.println(addr + "에 사시는 군요.");
		System.out.println(tel + "로 전화 드리겠습니다.");
	}
}
