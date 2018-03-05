package com.github.bbubbush.part12;

import java.util.Stack;

public class StackEx {
	public static void main(String[] args) {
		/* Stack
		 * ���� ���Ǵ� �ڷ������� ���Լ���� ��ǥ�Ǵ� Ư¡�� ���� �ִ�.
		 * Queue�� �񱳵Ǹ� ���Ǵ� �ڷ���
		 * */
		String[] groupA = {"���Ű��ź", "�����Ʈ", "����", "���ѹα�"};
		Stack<String> s = new Stack<String>();
		for(String n : groupA){
			s.push(n);
		}
		while( !s.isEmpty() ){
			System.out.println(s.pop());
		}
	}
}
