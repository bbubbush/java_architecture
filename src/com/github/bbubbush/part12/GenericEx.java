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
		/* Generic �⺻
		 * �ڷ����� ��� T, ������Ʈ�� ��� E, Key���� ��� K, Value�� ��� V�� ���ĺ� �빮�� 1���ڸ� Ȱ���� ǥ���Ѵ�.
		 * ���׸����� ���� ������ ���� ������ ��ü�� �ƴϸ� ������ �Ұ����ϰ� �ٲ����.
		 * 
		 * ���� ��Ÿ�� �ÿ� �߻��� �� �ִ� �ɰ��� ������ ������ �����ϰ� �Ǿ���. 
		 * �� ���ư� ����� ��ü Ȥ�� ������Ÿ���� �Ŀ� ����� �� �ְ� �Ͽ� �������� ���ǰ� �����Ǿ���, ���к��ϰ� Object�� ���� Casting�ϴ� ���� ���� �������� Ȯ���Ͽ���. 
		 * 
		 * �ڼ��� ������ ��������� �����ߴ� Generic �ڷḦ �ѹ� �� ���� ���ڴ�.
		 * */
		GenericTest<String> g = new GenericTest<String>();
		String[] strArr = {"J", "A", "V", "A"};
		g.set(strArr);
		g.print();
		
	}
}
