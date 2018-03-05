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
		 * 내부적으로 HashMap을 사용하며 Iterator의 정렬상태를 보장하지 못한다.
		 * 또한 동일한 데이터의 허용이 안된다. 
		 * TreeSet과 함께 Set의 인터페이스의 구현객체로 대표된다.
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
