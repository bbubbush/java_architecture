package com.github.bbubbush.part11;

import static java.lang.Math.*;
import static java.lang.System.out;

public class StaticImpTest {
	public static void main(String[] args) {
		/* Static Import
		 * 기본으로 제공되는 Math와 System 패키지를 애초에 import하여 그 과정을 줄일 수 있다.
		 * 하지만 대중적인 방법이 아니라 소스분석이 더 어렵다.
		 * 그래서 꼭 필요한 경우가 아니면 자제하는 것이 좋다.
		 * */
		int i = (int)(random()*26+25);
		out.println((char)i);
		
		int j = (int)(Math.random()*26+25);
		System.out.println((char)j);
	}
}
