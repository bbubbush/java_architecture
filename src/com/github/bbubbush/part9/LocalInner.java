package com.github.bbubbush.part9;

public class LocalInner {
	int a = 100;
	
	public void test(){
		int b = 20;
		final int D = 40;
		
		class LocalInnerTest{
			private int c = 30;
			
//			static int f = 100;	// local inner������ static�� ����� �� ����.
			public void print(){
				System.out.println(a);
				System.out.println(b);	// JDK 8���� ���������� ȣ���� �� �ִ�. ���� ������ ����� ȣ���� �����ߴ�.
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
		 * Ư�� �޼��� �ȿ��� ���ǵǴ� Ŭ������ ���Ѵ�. �ٽ� ���� Ư�� �޼��� �ȿ��� ���������� ���Ұ� ����ϴ�.
		 * �޼��尡 ������ ������ �ڵ� �Ҹ��ϰ� �ȴ�.
		 * �� ������ �ʴ´�.
		 * ������ ������ JDK 8�������� ���������� ������ �� �ְ� �ƴ�. ���� ������ ������ �Ұ����ߴ�.
		 * */
		LocalInner l = new LocalInner();
		l.innerTest(300);
	}
}
