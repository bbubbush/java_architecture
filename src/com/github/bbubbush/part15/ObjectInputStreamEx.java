package com.github.bbubbush.part15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamEx {
	public static void main(String[] args) {
		/* (역직렬화)
		 * 
		 * */
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("C:/eclipse/obj.sav"));
			Data data = (Data)ois.readObject();
			System.out.println(data.getNo());
			System.out.println(data.getName());
			System.out.println(data.getMail());
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
