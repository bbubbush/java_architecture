package com.github.bbubbush.part12;

import java.util.HashMap;
import java.util.Set;

public class HashMapEx {
	public static void main(String[] args) {
		/* HashMap
		 * key�� ����ũ�ؾ��Ѵ�. ���� �ߺ��� ������� �ʴ´�.
		 * key ������ null�� ����ϳ�, �ߺ��� ������� �����Ƿ� �� ���� null�� key�� ���� �� �ִ�.
		 * value�� key�� ���� �����Ӱ� ���� ������ �� �ִ�. 
		 * */
		String[] msg = {"����", "������", "������", "����", "����Ʈ����"};
		HashMap<Integer, String> h = new HashMap<Integer, String>();
		for (int i = 0; i < msg.length; i++) {
			h.put(i, msg[i]);
		}
		Set<Integer> keys = h.keySet();
		
		for (Integer n : keys) {
			System.out.println(h.get(n));
		}
	}
}
