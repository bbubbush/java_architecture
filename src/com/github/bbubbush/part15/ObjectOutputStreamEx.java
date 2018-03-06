package com.github.bbubbush.part15;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamEx {
	public static void main(String[] args) {
		/* Serialization(����ȭ)
		 * ����ӽ� �ȿ� �����ϴ� Ư�� ��ü�� ����Ʈ���·� ��ȯ�ϴ� ���� ����ȭ��� �Ѵ�.
		 * ����ȭ�� ��ü�� ���� ���α׷��� ����Ǵ� ���� ������ ��ü�� ��Ʈ���� �̿��ؼ� ���������� �����Ѱų� ������ �� �ִ�.
		 * 
		 * ������δ� Serializable�� VO�� implements�Ͽ� ����ȭ�� ��ü�� ���� ����Ѵ�.
		 * ���� ��Ʈ�� ���� md������ ���� ������ ������ �����ϸ� ����. 
		 * */
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("C:/eclipse/obj.sav"));
			Data data = new Data();
			data.setNo(33);
			data.setName("ȫ�浿");
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
