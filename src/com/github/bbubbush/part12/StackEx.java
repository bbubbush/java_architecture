package com.github.bbubbush.part12;

import java.util.Stack;

public class StackEx {
	public static void main(String[] args) {
		/* Stack
		 * 자주 사용되는 자료형으로 후입선출로 대표되는 특징을 갖고 있다.
		 * Queue와 비교되며 사용되는 자료형
		 * */
		String[] groupA = {"우즈베키스탄", "쿠웨이트", "사우디", "대한민국"};
		Stack<String> s = new Stack<String>();
		for(String n : groupA){
			s.push(n);
		}
		while( !s.isEmpty() ){
			System.out.println(s.pop());
		}
	}
}
