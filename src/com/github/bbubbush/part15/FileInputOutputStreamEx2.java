package com.github.bbubbush.part15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamEx2 {
	public static void main(String[] args) {
		/* FileInputStream & FileOutputStream 예제
		 * 특정 txt파일의 내용을 읽어 지정한 파일명으로 복사하는 프로그램
		 * 파일의 데이터를 읽어올 때는 FileInputStream, 데이터를 주입할 때는 FileOutputStream을 사용한다.
		 * 
		 * Input, Output Stream의 생성자들에 의해 새로운 파일을 생성할 수 있음을 알 수 있다.
		 * */
		final int BUFFER_SIZE = 1024;
		final String PATH = "F:/JAVA/DB연동.txt";
		final String COPY_PATH = "F:/JAVA/DB연동copy.txt";
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(PATH);
			fos = new FileOutputStream(COPY_PATH);		// 새로운 파일 생성
			byte[] buffer = new byte[BUFFER_SIZE];
			int temp = 0;
			
			while( (temp = fis.read(buffer)) != -1 ){
				fos.write(buffer, 0, temp);
			}
			
			fis.read(buffer);
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
				System.out.println("End");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
