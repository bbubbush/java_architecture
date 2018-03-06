package com.github.bbubbush.part15;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamEx {
	public static void main(String[] args) {
		/* Serialization(직렬화)
		 * 가상머신 안에 존재하는 특정 객체를 바이트형태로 변환하는 것을 직렬화라고 한다.
		 * 직렬화된 객체를 통해 프로그램이 실행되는 동안 샐성된 객체를 스트림을 이용해서 지속적으로 보관한거나 전송할 수 있다.
		 * 
		 * 방법으로는 Serializable을 VO에 implements하여 직렬화된 객체를 만들어서 사용한다.
		 * 낯선 파트라서 따로 md파일을 통해 정리된 내용을 참고하면 좋다. 
		 * */
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("C:/eclipse/obj.sav"));
			Data data = new Data();
			data.setNo(33);
			data.setName("홍길동");
			data.setMail("hong@gmail.co.kr");
			oos.writeObject(data);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
