package com.github.bbubbush.part7;

public class ObjectEx {
	private String name;
	private int price;
	public ObjectEx(String name, int price){
		this.name = name;
		this.price = price;
	}
	public static void main(String[] args) {
		/* Object Ŭ����
		 * ��� Ŭ������ superŬ����. ��, ���������� ��� ��ӹ޴´�,
		 * */
		ObjectEx o1 = new ObjectEx("1", 1);
		ObjectEx o2 = new ObjectEx("1", 1);
		
		System.out.println("o1 : " + o1);
		System.out.println("o2 : " + o2);
		System.out.println("o1's hashcode : " + o1.hashCode());
		System.out.println("o2's hashcode : " + o2.hashCode());
		System.out.println("o1 equals o2 : " + o1.equals(o2));
		String[] str = new String[3];
		System.out.println(str instanceof Object);
	}
}
