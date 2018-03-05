package com.github.bbubbush.part5;

public class ArrayEx6 {
	public static void main(String[] args) {
		/* �迭 ����
		 * �迭�� �ѹ� ũ�Ⱑ �������� ������ �� ����. ���� ũ�⸦ �ø��� ������ Ȯ��� ũ���� �迭�� ���� ��, ������ �迭�� ���� �����ؼ� �Űܾ� �Ѵ�.
		 * ������ �迭�� �״�� �����ִ�. ���縦 �ϸ鼭 �ڵ����� ���ŵǴ� ���� �ƴ�.
		 * System.arraycopy(src, srcPos, dest, destPos, length)�� ���. 
		 * src = ���� �迭, srcPos = �����迭�� ���� ������ġ, dest = ���ο� �迭, destPost = ���ο� �迭�� ���� ������ġ, length = ������ ���� ��
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
