package com.github.bbubbush.part15;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEx {
	public static void main(String[] args) {
		/* BufferedReader ����
		 * readLine �޼���� ���๮�ڸ� ������ �������� ���ڿ��� ��ȯ�ϰ� ���� �����ϸ� null�� ��ȯ�Ѵ�.
		 * ���� �� ������ ���۰� �����Ѵٰ� �����ص� �ȴ�. 
		 * ����¿� �־� ���ϱ� ������ ���� ���ȴ�.
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
