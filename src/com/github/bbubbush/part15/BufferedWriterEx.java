package com.github.bbubbush.part15;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx {
	public static void main(String[] args) {
		/* BufferedWriter 에제
		 * Buffered Stream은 성능개선을 위해 스트림안에 버퍼를 가지고 있다.
		 * BufferedWriter은 String객체를 받아 입력을 받을 수 있어서 byte array를 만들지 않아도 된다.
		 * */
		FileWriter fw = null;
		BufferedWriter bw = null;
		try{
			fw = new FileWriter("F:/JAVA/data.sav");
			bw = new BufferedWriter(fw);
			bw.write("BufferedWriter Test");
			bw.newLine();
			bw.write("안녕하세요 " + System.getProperty("line.separator"));	// line.separator는 줄바꿈문자를 뜻함
			bw.write("반갑습니다.");
			bw.flush();			// 버퍼를 비움
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
