package com.github.bbubbush.part11;

import static java.lang.Math.*;
import static java.lang.System.out;

public class StaticImpTest {
	public static void main(String[] args) {
		/* Static Import
		 * �⺻���� �����Ǵ� Math�� System ��Ű���� ���ʿ� import�Ͽ� �� ������ ���� �� �ִ�.
		 * ������ �������� ����� �ƴ϶� �ҽ��м��� �� ��ƴ�.
		 * �׷��� �� �ʿ��� ��찡 �ƴϸ� �����ϴ� ���� ����.
		 * */
		int i = (int)(random()*26+25);
		out.println((char)i);
		
		int j = (int)(Math.random()*26+25);
		System.out.println((char)j);
	}
}
