package com.github.bbubbush.part10;

public class MathEx {
	public static void main(String[] args) {
		/* Math class
		 * 수학계산을 위한 상수 값과 수학관련 메서드
		 * 인스턴스를 생성하지 않고 사용
		 * 유용한 메서드를 확인하는 예제
		 * */
		
		double temp;
		temp = Math.pow(2, 3);
		System.out.println("2의 3승 >>> " + temp);
		
		temp = Math.max(300f, 301.0);
		System.out.println("300f, 301.0 중 큰수 >>> " + temp);
		
		temp = Math.min(300f, 301.0);
		System.out.println("300f, 301.0 중 작은수 >>> " + temp);
		
		temp = Math.abs(-1234.1);
		System.out.println("-1234.1의 절대값 >>> " + temp);
		
		temp = Math.random();
		System.out.println("0~1 사이의 난수 >>> " + temp);
		
		temp = Math.random();
		System.out.println("0~1 사이의 난수 >>> " + temp);
		
		temp = Math.sqrt(90000);
		System.out.println("90000의 제곱근 >>> " + temp);
		
		temp = Math.round(123.56);
		System.out.println("123.56의 반올림 >>> " + temp);
		
		temp = Math.round(123.46);
		System.out.println("123.46의 반올림 >>> " + temp);
		
		temp = Math.ceil(123.56);
		System.out.println("123.56의 올림 >>> " + temp);
		
		temp = Math.ceil(123.46);
		System.out.println("123.46의 올림 >>> " + temp);
		
		temp = Math.floor(123.56);
		System.out.println("123.56의 버림 >>> " + temp);
		
		temp = Math.floor(123.46);
		System.out.println("123.46의 버림 >>> " + temp);
		
		temp = Math.rint(123.56);
		System.out.println("123.56의 가장 가까운 정수 값 >>> " + temp);
		
		temp = Math.rint(123.46);
		System.out.println("123.46의 가장 가까운 정수 값 >>> " + temp);
		
		temp = Math.sin(45);
		System.out.println("45의 sin 값 >>> " + temp);
		
		//
		int degrees = 360;
		
		temp = Math.toRadians(degrees);
		System.out.println("60도의 파이 라디안 값 >>> " + temp);
		
		double radians = ((double)degrees/180.0) * Math.PI;
		System.out.println("60도의 파이 라디안 값 >>> " + radians);
		
		temp = Math.toDegrees(radians);
		System.out.println("라디안 값으로 구한 각도 >>> " + temp);
		
		temp = Math.PI;
		System.out.println("PI값 >>> " + temp);
		
		temp = Math.E;
		System.out.println("자연로그상수 e값 >>> " + temp);
		
	}// end of main method
}
