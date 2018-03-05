package com.github.bbubbush.part15;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {
	public static void main(String[] args) {
		/* FileOutputStream 예제
		 * 기본적인 FileOutputStream 객체를 활용하는 방법이다.
		 * 큰 틀은 FileInputStream과 동일하며, 읽거나 쓰는 방법에 따라 객체를 선택한다.
		 * 
		 * write()메서드를 활용할 때에는 별도로 byte array를 만들지 않고 String객체의 getBytes()를 활용하면 편하다.
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
