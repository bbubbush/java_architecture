package com.github.bbubbush.part6;

class Sample{
	int x, y;		// instance variable
	static int z;	// class variable or static variable
}

public class SampleEx {
	public static void main(String[] args) {
		/* OOP�� �⺻���信 ���� ����
		 * OOP�� ���� ���������� �ϴٺ��� variable�� ������ �����ϴ� �ڵ尡 �Ǿ���. 
		 * ������ �� ���� OOP ������ �߿��� �����̴� ¤�� �Ѿ�� �ϴ�.
		 * */
		Sample sp = new Sample();			// local variable   	 main() �ȿ����� ȣ���� �����ϴ�.
		System.out.println(sp.x);			// instance variable	���� �� ����� �ν��Ͻ��� ���� ������ �� �ִ�.
		System.out.println(Sample.z); 		// static variable		���� �� ���� ���� �ٷ� ������ �� �ִ�.
	}
	
	
}
