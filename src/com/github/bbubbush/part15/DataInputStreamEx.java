package com.github.bbubbush.part15;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputStreamEx {
	public static void main(String[] args) {
		/* DataInputStream 예제
		 * DataOupputStream과 크게 다르지 않으므로 생략하겠다.
		 * */
		DataInputStream dis = null;
		FileInputStream fis = null;
		
		try{
			fis = new FileInputStream("F:/JAVA/data.sav");
			dis = new DataInputStream(fis);
			
			int i = dis.readInt();
			double d = dis.readDouble();
			String s = dis.readUTF();
			System.out.println("i >>> " + i);
			System.out.println("d >>> " + d);
			System.out.println("s >>> " + s);
			
		}catch( FileNotFoundException e ){
			e.printStackTrace();
		}catch( IOException e2 ){
			e2.printStackTrace();
		}finally{
			try {
				fis.close();
				dis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
