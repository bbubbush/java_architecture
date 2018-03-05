package com.github.bbubbush.part15;

import java.util.Scanner;

public class ScannerEx1 {
	public static void main(String[] args) {
		/* Scanner 기본 예제
		 * JDK 5.0에 등장하여 IO에 있어 편리성을 제공한다. 따라서 스캐너는 기존의 Stream 객체들의 사용에 편의를 더한 객체임을 인식해야한다.
		 * 
		 * 스캐너 객체는 생성자를 크게 4개의 형태로 구분한다.
		 * Scanner(File source)		>>>	File 객체를 받는다.
		 * Scanner(InputStream source)		>>>	키보드를 통한 입력을 받는다.
		 * Scanner(Readable source)		>>>	Reader 객체를 받는다.(e.g. FileReade)
		 * Scanner(String source)		>>>	문자열을 입력받아 초기화 시킨다.
		 * 
		 * 빈번하게 사용하는 것은 InputStream이겠지만 다른 생성자의 활용법도 숙지해야한다.
		 * */
		System.out.print("input data >>> ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.printf("num >>> %d", num);
		sc.close();
	}
}
