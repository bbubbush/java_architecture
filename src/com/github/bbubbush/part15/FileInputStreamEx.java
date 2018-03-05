package com.github.bbubbush.part15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx {
	public static void main(String[] args) {
		/* FileInputStream ����
		 * �Է��� ���ϰ�ο� ������ ������ ��� ���� ������ �о ����ϴ� ���α׷��̴�.
		 * FileInputStream�� InputStream�� ��ӹ޴´�.
		 * byte ������ ����� �� �ְ�, �׻� close�� �ݾ��ִ� ���� �ʿ��ϴ�.
		 * fis.read() �޼���� �� �������� ������ EOF(End of file) ��ȯ(-1)
		 * 
		 * �Ʒ��� �ڵ�� �ѹ��� ������ ����ϱ� ���� ������ ũ���� ���۸� �����ϴ� ���� �߿��ϴ�. 
		 * �ʹ� ������ ����� ��������� �������ϸ�, �ʹ� ũ�� �ѹ��� �д� ���̰� ����� ���۸��� �����.
		 * ������ ũ��� 1024, 2048, 4096, 8192�� ���� ����� ���ϴ� ���� �Ϲ����̴�. 
		 * */
		FileInputStream fis = null;
		byte _read[] = new byte[1024];
		byte console[] = new byte[1024];
		
		try {
			System.out.print("File name : ");		// File path >>> F:/JAVA/DB����.txt
			System.in.read(console);				// console�ȿ� �Էµ� byte�� ����
			String file = new String(console).trim();	// file value >>> F:/JAVA/DB����.txt
			fis = new FileInputStream(file);			
			fis.read(_read, 0, _read.length);		// F:/JAVA/DB����.txt�� ���ۺ��� �������� ���� _read�� ����(��, ũ�Ⱑ 1000byte ���ϸ� ����)
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
