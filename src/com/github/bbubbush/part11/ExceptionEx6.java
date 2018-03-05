package com.github.bbubbush.part11;

public class ExceptionEx6 {
	public static void main(String[] args) {
		/* ���� catch��
		 * if�� ó�� ������ ���Ǻ��� ���� ��������� ����
		 * if���� ������ ���� ������ ���� �����ϴ°� ó�� exception ���� ���� ���ܰ� ���� �����ؾ��Ѵ�.
		 * ���� Exception�� ���� ������ ���� ��� ���� ���ܴ� �� deadline�� �ȴ�.
		 * */
		
		System.out.println(1);
		System.out.println(2);
		try{
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		}catch(ArithmeticException e){
			if ( e instanceof ArithmeticException) {
				System.out.println("true");
			}
			System.out.println("ArithmeticException");
		}catch(Exception e){
			System.out.println("Exception");
		}
//		catch(NullPointerException e){			// �����Ͽ���
//			
//		}// end of catch
		System.out.println(5);
	}// end of main method
}// end of class
