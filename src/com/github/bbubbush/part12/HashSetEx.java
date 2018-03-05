package com.github.bbubbush.part12;

import java.util.HashSet;
import java.util.Iterator;

class AData{
	int x, y;
	public AData(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void disp(){
		System.out.println("x >>> " + x + ", y >>> " + y);
	}
}


public class HashSetEx {
	public static void main(String[] args) {
		/* HashSet
		 * ���������� HashMap�� ����ϸ� Iterator�� ���Ļ��¸� �������� ���Ѵ�.
		 * ���� ������ �������� ����� �ȵȴ�. 
		 * TreeSet�� �Բ� Set�� �������̽��� ������ü�� ��ǥ�ȴ�.
		 * */
		AData a = new AData(10, 20);
		AData b = new AData(20, 30);
		AData c = new AData(30, 40);
		HashSet<AData> hs = new HashSet<AData>();
		hs.add(a);
		hs.add(b);
		hs.add(c);
		
		System.out.println("hs.hashCode() >>> " + hs.hashCode());
		System.out.println("hs.size() >>> " + hs.size());
		
		Iterator<AData> i = hs.iterator();
		while( i.hasNext() ){
			i.next().disp();
		}
	}
}
