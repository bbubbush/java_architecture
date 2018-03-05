package com.github.bbubbush.part10;

public class StringBufferEx1 {
	public static void main(String[] args) {
		/* StringBuffer
		 * ���� ������ ������ Ŭ������ ���ڿ��� ������ ���� �Ͼ ��� ����ϱ⿡ �����ϴ�.
		 * �Ʒ� �ڵ�� �⺻���� ���ڿ� ���� ��ɰ� ���õ� �޼��带 ����ߴ�.
		 * buffer�� �ʱ� ũ��� 16�̴�.
		 * */
		StringBuffer sb = new StringBuffer("JAVA");
		sb.append("1.6");
		System.out.println(sb + " " + sb.capacity());
		
		sb.delete(3,  5);
		System.out.println(sb + " " + sb.capacity());
		
		sb.insert(3,  "A1");
		System.out.println(sb + " " + sb.capacity());
		
		sb.replace(4,  7,  "������");
		System.out.println(sb + " " + sb.capacity());
		
		sb.reverse();
		System.out.println(sb + " " + sb.capacity());
		
		
		
	}
}
