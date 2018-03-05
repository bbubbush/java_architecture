package com.github.bbubbush.part9;

public class LocalInner {
	int a = 100;
	
	public void test(){
		int b = 20;
		final int D = 40;
		
		class LocalInnerTest{
			private int c = 30;
			
//			static int f = 100;	// local inner에서는 static을 사용할 수 없다.
			public void print(){
				System.out.println(a);
				System.out.println(b);	// JDK 8부터 지역변수를 호출할 수 있다. 이전 버전은 상수만 호출이 가능했다.
			}
		}
	}
	
	
	public void innerTest(int k){
		int b = 200;
		final int C = k;
		class Inner{
			public void getData(){
				System.out.println("int a : " + a);
				System.out.println("int b : " + b);
				System.out.println("final int C : " + C);
			}
		}// end of Inner class
		Inner i = new Inner();
		i.getData();
	}// end of innerTest method
	
	
	public static void main(String[] args) {
		/* Local Inner Class
		 * 특정 메서드 안에서 정의되는 클래스를 말한다. 다시 말해 특정 메서드 안에서 지역변수의 역할과 비슷하다.
		 * 메서드가 수행이 끝나면 자동 소멸하게 된다.
		 * 잘 사용되지 않는다.
		 * 주의할 내용은 JDK 8버전부터 지역변수에 접근할 수 있게 됐다. 이전 버전은 접근이 불가능했다.
		 * */
		LocalInner l = new LocalInner();
		l.innerTest(300);
	}
}
