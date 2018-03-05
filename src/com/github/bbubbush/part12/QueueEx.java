package com.github.bbubbush.part12;

import java.util.LinkedList;

public class QueueEx {
	public static void main(String[] args) {
		/* Queue
		 * ���� ���Ǵ� �ڷ������� ���Լ���� ��ǥ�Ǵ� Ư¡�� ���� �ִ�.
		 * Stack�� �񱳵Ǹ� ���Ǵ� �ڷ���
		 * Queue ��� LinkedList�� Ȱ���� ����ϱ⵵ �Ѵ�. �̴� LinkedList ���� �Ϲ������̱� �����̴�.
		 * */
		String[] groupA = {"���Ű��ź", "�����Ʈ", "����", "���ѹα�"};
		LinkedList<String> q = new LinkedList<String>();
		for(String n : groupA){
			q.offer(n);
		}
		while( !q.isEmpty() ){
			System.out.println(q.poll());
		}
	}
}
