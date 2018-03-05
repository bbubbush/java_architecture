package com.github.bbubbush.part15;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEx {
	public static void main(String[] args) {
		/* BufferedReader 예제
		 * readLine 메서드는 개행문자를 만나기 전까지의 문자열을 반환하고 끝에 도달하면 null을 반환한다.
		 * 따라서 줄 단위로 버퍼가 동작한다고 생각해도 된다. 
		 * 입출력에 있어 편리하기 때문에 자주 사용된다.
		 * */
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			fis = new FileInputStream("F:/JAVA/data.sav");
			isr = new InputStreamReader(fis);
			br = new BufferedReader(isr);
			
			String str = null;
			while( (str = br.readLine()) != null ){
				System.out.println(str);
			}
		
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		} finally{
			try {
				fis.close();
				isr.close();
				br.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}// finally
	}
}
