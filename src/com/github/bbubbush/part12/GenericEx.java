package com.github.bbubbush.part12;

class GenericTest<T>{
	T[] v;
	public void set(T[] n){
		v = n;
	}
	
	public void print(){
		for(T s : v){
			System.out.println(s);
		}
	}
}


public class GenericEx {
	public static void main(String[] args) {
		/* Generic 기본
		 * 자료형일 경우 T, 엘리먼트일 경우 E, Key값일 경우 K, Value일 경우 V로 알파벳 대문자 1글자를 활용해 표기한다.
		 * 제네릭으로 인해 컴파일 전에 지정된 객체가 아니면 저장이 불가능하게 바뀌었다.
		 * 
		 * 따라서 런타임 시에 발생할 수 있는 심각한 에러를 사전에 방지하게 되었다. 
		 * 더 나아가 사용할 객체 혹은 데이터타입을 후에 기술할 수 있게 하여 개발자의 편의가 증가되었고, 무분별하게 Object를 통해 Casting하는 것을 막아 안전성을 확보하였다. 
		 * 
		 * 자세한 설명은 대원이형이 정리했던 Generic 자료를 한번 더 보면 좋겠다.
		 * */
		GenericTest<String> g = new GenericTest<String>();
		String[] strArr = {"J", "A", "V", "A"};
		g.set(strArr);
		g.print();
		
	}
}
