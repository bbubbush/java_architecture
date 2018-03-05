package com.github.bbubbush.part3;

public class WriteEx {
	public static void main(String[] args) {
		/*
		 * write() 메서드는 화면 출력 시 버퍼에 담는다. 따라서 System.out.flush() 호출을 통해 버퍼를 비워야한다.
		 * 즉 별도의 flush가 일어나지 않으면 버퍼에 값은 담지만 이를 비워내지 않는다.
		 * 그러한 이유로 System.out.write(65)의 코드만 실행할 경우 아무런 출력이 되지 않는다.
		 * */
		
		System.out.write(65);	// buffer에 담기만 함
		System.out.flush();	// buffer에 있는 것을 출력
		System.out.println();
		byte[] by = {'J', 'A', 'V', 'A'};
		System.out.write(by, 0, 1);		// 바이트 배열 사용의 경우에는 auto flush기능이 있음
		System.out.println();
		
	}
}
