package com.github.bbubbush.part15;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {
	public static void main(String[] args) {
		/* FileOutputStream ����
		 * �⺻���� FileOutputStream ��ü�� Ȱ���ϴ� ����̴�.
		 * ū Ʋ�� FileInputStream�� �����ϸ�, �аų� ���� ����� ���� ��ü�� �����Ѵ�.
		 * 
		 * write()�޼��带 Ȱ���� ������ ������ byte array�� ������ �ʰ� String��ü�� getBytes()�� Ȱ���ϸ� ���ϴ�.
		 * */
		FileOutputStream fos = null;
		
		try{
			fos = new FileOutputStream("F:/JAVA/fileout.txt");		// create new file
			String msg = "Hello FileOutputStream !!";
			fos.write(msg.getBytes());		// write to new file
			
		}catch( FileNotFoundException e ){
			e.printStackTrace();
		}catch( IOException e2 ){
			e2.printStackTrace();
		}finally{
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}// finally
	}// end of main method
}
