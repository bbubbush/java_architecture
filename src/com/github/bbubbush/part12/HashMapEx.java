package com.github.bbubbush.part12;

import java.util.HashMap;
import java.util.Set;

public class HashMapEx {
	public static void main(String[] args) {
		/* HashMap
		 * key는 유니크해야한다. 따라서 중복을 허용하지 않는다.
		 * key 값으로 null은 허용하나, 중복을 허용하지 않으므로 한 개의 null을 key로 가질 수 있다.
		 * value는 key에 비해 자유롭게 값을 설정할 수 있다. 
		 * */
		String[] msg = {"독일", "스위스", "프랑스", "영국", "오스트리아"};
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
