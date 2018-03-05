package com.github.bbubbush.part15;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutpuutStreamEx {
	public static void main(String[] args) {
		/* DataOutputStream ����
		 * Ư�� ������ Ÿ�԰� ������ ������ ä �����͸� ����ϰ� �о�� �� �ִ� ��Ʈ���̴�.
		 * �����͸� �����ϰ� write�� �� �����ϴ�.
		 * 1�� ��Ʈ���� �ƴϱ� ������ �ٸ� ��Ʈ���� �̿��ؼ� Ư�� ����̽��� ����� �� �ִ�.
		 * DataOutputStream�� �����ڴ� OutputStream ��ü�� �ޱ� ������ ���� �ڽĵ��� ��� �� �� �ִ�. 
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
