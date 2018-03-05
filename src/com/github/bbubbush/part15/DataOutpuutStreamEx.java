package com.github.bbubbush.part15;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutpuutStreamEx {
	public static void main(String[] args) {
		/* DataOutputStream 예제
		 * 특정 데이터 타입과 포멧을 유지한 채 데이터를 기록하고 읽어올 수 있는 스트림이다.
		 * 데이터를 엄격하게 write할 때 유용하다.
		 * 1차 스트림이 아니기 때문에 다른 스트림을 이용해서 특정 디바이스와 연결될 수 있다.
		 * DataOutputStream의 생성자는 OutputStream 객체를 받기 때문에 하위 자식들은 모두 올 수 있다. 
		 * */
		DataOutputStream dos = null;
		FileOutputStream fos = null;
		
		try{
			fos = new FileOutputStream("F:/JAVA/data.sav");
			dos = new DataOutputStream(fos);
			
			int i = 10;
			double d = 3.14;
			String s = "JAVA program";
			dos.writeInt(i);
			dos.writeDouble(d);
			dos.writeUTF(s);			
			
		}catch( FileNotFoundException e ){
			e.printStackTrace();
		}catch( IOException e2 ){
			e2.printStackTrace();
		}finally{
			try {
				fos.close();
				dos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
