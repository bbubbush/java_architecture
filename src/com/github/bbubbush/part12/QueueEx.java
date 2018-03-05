package com.github.bbubbush.part12;

import java.util.LinkedList;

public class QueueEx {
	public static void main(String[] args) {
		/* Queue
		 * 자주 사용되는 자료형으로 선입선출로 대표되는 특징을 갖고 있다.
		 * Stack과 비교되며 사용되는 자료형
		 * Queue 대신 LinkedList를 활용해 사용하기도 한다. 이는 LinkedList 역시 일방통행이기 때문이다.
		 * */
		String[] groupA = {"우즈베키스탄", "쿠웨이트", "사우디", "대한민국"};
		LinkedList<String> q = new LinkedList<String>();
		for(String n : groupA){
			q.offer(n);
		}
		while( !q.isEmpty() ){
			System.out.println(q.poll());
		}
	}
}
