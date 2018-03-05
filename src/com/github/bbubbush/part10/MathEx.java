package com.github.bbubbush.part10;

public class MathEx {
	public static void main(String[] args) {
		/* Math class
		 * ���а���� ���� ��� ���� ���а��� �޼���
		 * �ν��Ͻ��� �������� �ʰ� ���
		 * ������ �޼��带 Ȯ���ϴ� ����
		 * */
		
		double temp;
		temp = Math.pow(2, 3);
		System.out.println("2�� 3�� >>> " + temp);
		
		temp = Math.max(300f, 301.0);
		System.out.println("300f, 301.0 �� ū�� >>> " + temp);
		
		temp = Math.min(300f, 301.0);
		System.out.println("300f, 301.0 �� ������ >>> " + temp);
		
		temp = Math.abs(-1234.1);
		System.out.println("-1234.1�� ���밪 >>> " + temp);
		
		temp = Math.random();
		System.out.println("0~1 ������ ���� >>> " + temp);
		
		temp = Math.random();
		System.out.println("0~1 ������ ���� >>> " + temp);
		
		temp = Math.sqrt(90000);
		System.out.println("90000�� ������ >>> " + temp);
		
		temp = Math.round(123.56);
		System.out.println("123.56�� �ݿø� >>> " + temp);
		
		temp = Math.round(123.46);
		System.out.println("123.46�� �ݿø� >>> " + temp);
		
		temp = Math.ceil(123.56);
		System.out.println("123.56�� �ø� >>> " + temp);
		
		temp = Math.ceil(123.46);
		System.out.println("123.46�� �ø� >>> " + temp);
		
		temp = Math.floor(123.56);
		System.out.println("123.56�� ���� >>> " + temp);
		
		temp = Math.floor(123.46);
		System.out.println("123.46�� ���� >>> " + temp);
		
		temp = Math.rint(123.56);
		System.out.println("123.56�� ���� ����� ���� �� >>> " + temp);
		
		temp = Math.rint(123.46);
		System.out.println("123.46�� ���� ����� ���� �� >>> " + temp);
		
		temp = Math.sin(45);
		System.out.println("45�� sin �� >>> " + temp);
		
		//
		int degrees = 360;
		
		temp = Math.toRadians(degrees);
		System.out.println("60���� ���� ���� �� >>> " + temp);
		
		double radians = ((double)degrees/180.0) * Math.PI;
		System.out.println("60���� ���� ���� �� >>> " + radians);
		
		temp = Math.toDegrees(radians);
		System.out.println("���� ������ ���� ���� >>> " + temp);
		
		temp = Math.PI;
		System.out.println("PI�� >>> " + temp);
		
		temp = Math.E;
		System.out.println("�ڿ��α׻�� e�� >>> " + temp);
		
	}// end of main method
}
