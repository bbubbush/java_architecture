package com.github.bbubbush.part11;

public class ExceptionEx7 {
	public static void main(String[] args) {
		/* Try~catch~finally
		 * ������ try ~ catch������ ���ܹ߻����ο� ������� �����ؾ� �ϴ� �κ��� finally������ �ۼ��Ѵ�.
		 * �Ʒ� �ڵ�ó�� 0���� �����ų� �ƴϰų� ������� ����ȴ�.
		 * */
		
		for (int i = 1; i <= 10; i++) {
			try {
				System.out.println(i/(int)(Math.random()*2));
			}catch(ArithmeticException e){
				System.out.println("ArithmeticException");
			}finally {
				// TODO: handle finally clause
				System.out.println("Finally" + i);
				System.out.println();
			}
		}
		
		
	}
}
