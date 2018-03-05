package com.github.bbubbush.part10;

public class RuntimeEx {
	public static void main(String[] args) {
		/* Runtime class
		 * 실행시간에 실행환경에 대한 정보를 얻거나, 명령을 수행하는 클래스.
		 * 
		 * 주요메서드
		 * freeMemory(): 현재 JVM에서 사용 가능한 메모리의 양. byte 단위이다.
		 * totalMemory(): 전체 메모리의 양을 byte단위로 출력.
		 * */
		Runtime rt = Runtime.getRuntime();
		long fr = rt.freeMemory();
		System.out.println("Free memory = " + (fr/1024) + "KB");
		
		long fr2 = rt.totalMemory();
		System.out.println("Total memory = " + (fr2/2014) + "KB");
		
		try {
			// rt.exec("C:\\windows\\system32\\calc.exe");				// 계산기 프로그램 실행
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
	}
}
