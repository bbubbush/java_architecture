package com.github.bbubbush.part8;

import java.util.Arrays;

class AClass{
	
}

interface CInter{
	
}

class BClass extends AClass implements CInter{
	
}


public class ABCEx {
	public static void main(String[] args) {
		/* instanceof �����
		 * �񱳰�ü�̸� instanceof ��Ŭ������
		 * ��ü�� Ŭ������ ���� ��ü�� Ŭ������ ����ȯ�� �������� Ȯ���� �� �ִ�.
		 * �̸� ���� ��Ӱ��踦 ������ �� �ִ�.
		 * */
		BClass b = new BClass();
		System.out.println(b instanceof Object);
		System.out.println(b instanceof AClass);
		System.out.println(b instanceof BClass);
		System.out.println(b instanceof CInter);

	}	
}
