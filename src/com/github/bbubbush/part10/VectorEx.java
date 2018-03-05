package com.github.bbubbush.part10;

import java.util.Vector;

class Temp{
	int i;
	Temp(int i){
		this.i = i;
	}
}
public class VectorEx {
	public static void main(String[] args) {
		/* Vector class
		 * ������ �� ���� ũ�⸦ ���ϴ� array�� ������ �����ϱ� ���� ����.
		 * �������� �迭�̶�� �����ϸ� ����.
		 * 
		 * ����� ArrayList�� Vector�� ����ؼ� ����Ѵ�.
		 * Vector�� ArrayList�� ���� ū ���̴� ����ȭ(synchronized)�� �����̴�.
		 * Vector�� ����ȭ�� ������ �����ϰ� ArrayList�� �������� �ʴ´�.
		 * ���� ���Ͻ����� ȯ�濡���� Vector�� ArrayList�� ���� ���� �� �ۿ� ����.
		 * �ݸ�, ���߽����忡�� �ʿ信 ���� Vector�� ArrayList���� Ȱ��� ������ �ִ�. 
		 * ������ �� ������ ArrayList�� Collection ��ü�� ���� ����ȭ�� �� �� �ֱ� ������ Vector�� ��ü�� �� �ִ�. 
		 * ���� ���� ������ �ڵ带 �����ϴ� ��찡 �ƴϸ� ArrayList�� ����Ѵ�.
		 * 
		 * ����ȭ�� ���õ� ������ �������н� �ÿ� ��ü������ ���� �غ��߰ڴ�.(�����ڷ��߿� �̸� ���� �ڵ带 ã�� �� ������.)
		 * */
		Vector<Temp> v = new Vector<Temp>();
		v.add(new Temp(10));
		v.add(new Temp(20));
		v.add(new Temp(30));
		v.add(new Temp(10));
		v.add(new Temp(40));
		v.add(new Temp(50));
		v.add(1, new Temp(15));		// add�� index�� �������� ������ �ڵ����� �� �ڷ� ����.
		
		for (int i = 0; i < v.size(); i++) {
			Temp t = (Temp)v.elementAt(i);
			System.out.println(t.i);
		}
		
		v.removeElementAt(1);
		
		for (int i = 0; i < v.size(); i++) {
			Temp t = (Temp)v.elementAt(i);
			System.out.println("after remove >>> " + t.i);
		}
		
	}
}
