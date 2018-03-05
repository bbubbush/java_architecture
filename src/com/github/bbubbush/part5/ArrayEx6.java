package com.github.bbubbush.part5;

public class ArrayEx6 {
	public static void main(String[] args) {
		/* 배열 복사
		 * 배열은 한번 크기가 정해지면 변경할 수 없다. 따라서 크기를 늘리고 싶으면 확장된 크기의 배열을 선언 후, 기존의 배열의 값을 복사해서 옮겨야 한다.
		 * 기존의 배열은 그대로 남아있다. 복사를 하면서 자동으로 제거되는 것이 아님.
		 * System.arraycopy(src, srcPos, dest, destPos, length)를 사용. 
		 * src = 기존 배열, srcPos = 기존배열의 복사 시작위치, dest = 새로운 배열, destPost = 새로운 배열의 복사 시작위치, length = 복사할 값의 수
		 * */
		
		String[] src = {"Java", "Database", "JSP", "XML"};
		String[] des = new String[6];
		des[0] = "OS";
		des[1] = "Network";
		System.arraycopy(src, 0, des, 2, 4);
		for (String value : des) {
			System.out.println(value);
		}
	}
}
