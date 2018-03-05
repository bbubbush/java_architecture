package com.github.bbubbush.part15;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx {
	public static void main(String[] args) {
		/* BufferedWriter ����
		 * Buffered Stream�� ���ɰ����� ���� ��Ʈ���ȿ� ���۸� ������ �ִ�.
		 * BufferedWriter�� String��ü�� �޾� �Է��� ���� �� �־ byte array�� ������ �ʾƵ� �ȴ�.
		 * */
		FileWriter fw = null;
		BufferedWriter bw = null;
		try{
			fw = new FileWriter("F:/JAVA/data.sav");
			bw = new BufferedWriter(fw);
			bw.write("BufferedWriter Test");
			bw.newLine();
			bw.write("�ȳ��ϼ��� " + System.getProperty("line.separator"));	// line.separator�� �ٹٲ޹��ڸ� ����
			bw.write("�ݰ����ϴ�.");
			bw.flush();			// ���۸� ���
		}catch( IOException e ){
			e.printStackTrace();
		}finally{
			try {
				fw.close();
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
