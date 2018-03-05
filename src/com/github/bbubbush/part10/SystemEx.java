package com.github.bbubbush.part10;

public class SystemEx {
	public static void main(String[] args) {
		/* System class
		 * 표준 입출력을 포함한 시스템 전반에 걸친 제어를 담당.
		 * 
		 * 주요 메서드
		 * System.in.read()
		 * System.exit(int status)
		 * System.getProperty(String key): 현재 시스템의 환경속성을 가져온다. key의 값에 따라 원하는 정보를 가져온다.
		 * */
		long startLoopTime = System.currentTimeMillis();
		long startLoopTime1 = System.nanoTime();
		
		for (int i = 0; i < 1000000; i++) {
			for (int j = 0; j < 1000000; j++) {
				int k = i*j;
			}
		}
		
		long tTime = System.currentTimeMillis() - startLoopTime;
		long tTime1 = System.nanoTime() - startLoopTime1;
		System.out.println("System.currentTimeMillis() 소요시간 >>> " + tTime);
		System.out.println("System.nanoTime() 소요시간 >>> " + (tTime1/1000000));
		
		byte[] buffer = new byte[255];
		System.out.println("\nType a line of text: ");
		try {
//			System.in.read(buffer, 0, 255);		// 입력받은 내용을 버퍼에 저장
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
		
		System.out.println( new String(buffer)); 	// byte[] -> String
		
		System.out.println(System.getProperty("os.name"));		// os의 이름을 가져옴
		System.out.println(System.getProperty("user.name"));	// user name을 가져옴
		
		// https://docs.oracle.com/javase/tutorial/essential/environment/sysprop.html 에서 key list를 확인할 수 있음
	}
}
