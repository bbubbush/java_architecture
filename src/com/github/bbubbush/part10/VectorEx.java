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
		 * 정의할 때 고정 크기를 정하는 array의 단점을 개선하기 위해 등장.
		 * 가변길이 배열이라고 생각하면 좋다.
		 * 
		 * 현재는 ArrayList를 Vector를 대신해서 사용한다.
		 * Vector와 ArrayList의 가장 큰 차이는 동기화(synchronized)의 여부이다.
		 * Vector는 동기화를 무조건 지원하고 ArrayList는 지원하지 않는다.
		 * 따라서 단일스레드 환경에서는 Vector가 ArrayList에 비해 느릴 수 밖에 없다.
		 * 반면, 다중스레드에선 필요에 따라 Vector가 ArrayList보다 활용될 여지가 있다. 
		 * 하지만 이 마저도 ArrayList가 Collection 객체를 통해 동기화를 할 수 있기 때문에 Vector를 대체할 수 있다. 
		 * 따라서 요즘엔 과거의 코드를 유지하는 경우가 아니면 ArrayList를 사용한다.
		 * 
		 * 동기화와 관련된 예제는 쓰레드학습 시에 자체적으로 만들어서 해봐야겠다.(국내자료중엔 이를 비교한 코드를 찾을 수 없었다.)
		 * */
		Vector<Temp> v = new Vector<Temp>();
		v.add(new Temp(10));
		v.add(new Temp(20));
		v.add(new Temp(30));
		v.add(new Temp(10));
		v.add(new Temp(40));
		v.add(new Temp(50));
		v.add(1, new Temp(15));		// add할 index를 선택하지 않으면 자동으로 맨 뒤로 간다.
		
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
