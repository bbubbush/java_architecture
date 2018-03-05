package com.github.bbubbush.part15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx {
	public static void main(String[] args) {
		/* FileInputStream 예제
		 * 입력한 파일경로에 파일이 존재할 경우 안의 내용을 읽어서 출력하는 프로그램이다.
		 * FileInputStream은 InputStream을 상속받는다.
		 * byte 단위로 출력할 수 있고, 항상 close로 닫아주는 것이 필요하다.
		 * fis.read() 메서드는 맨 마지막에 도착시 EOF(End of file) 반환(-1)
		 * 
		 * 아래의 코드는 한번에 내용을 출력하기 위해 적당한 크기의 버퍼를 설정하는 것이 중요하다. 
		 * 너무 작으면 빈번한 입출력으로 성능저하를, 너무 크면 한번에 읽는 길이가 길어져 버퍼링이 생긴다.
		 * 버퍼의 크기는 1024, 2048, 4096, 8192와 같은 배수로 정하는 것이 일반적이다. 
		 * */
		FileInputStream fis = null;
		byte _read[] = new byte[1024];
		byte console[] = new byte[1024];
		
		try {
			System.out.print("File name : ");		// File path >>> F:/JAVA/DB연동.txt
			System.in.read(console);				// console안에 입력된 byte값 저장
			String file = new String(console).trim();	// file value >>> F:/JAVA/DB연동.txt
			fis = new FileInputStream(file);			
			fis.read(_read, 0, _read.length);		// F:/JAVA/DB연동.txt의 시작부터 끝까지의 값을 _read에 저장(단, 크기가 1000byte 이하만 저장)
			System.out.println(new String(_read).trim());
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch ( IOException e ){
			e.printStackTrace();
		} finally {
			try {
				if( fis != null ){
					fis.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}// finally
	}// end of main method
}
