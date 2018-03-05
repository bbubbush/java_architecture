package com.github.bbubbush.part15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamEx2 {
	public static void main(String[] args) {
		/* FileInputStream & FileOutputStream ����
		 * Ư�� txt������ ������ �о� ������ ���ϸ����� �����ϴ� ���α׷�
		 * ������ �����͸� �о�� ���� FileInputStream, �����͸� ������ ���� FileOutputStream�� ����Ѵ�.
		 * 
		 * Input, Output Stream�� �����ڵ鿡 ���� ���ο� ������ ������ �� ������ �� �� �ִ�.
		 * */
		final int BUFFER_SIZE = 1024;
		final String PATH = "F:/JAVA/DB����.txt";
		final String COPY_PATH = "F:/JAVA/DB����copy.txt";
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(PATH);
			fos = new FileOutputStream(COPY_PATH);		// ���ο� ���� ����
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
