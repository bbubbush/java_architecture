package com.github.bbubbush.part15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerEx2 {
	public static void main(String[] args) {
		/* Scanner File�ļ��� ����
		 * iterator�� hasNext()�� next() �޼��带 ���� �����ϰ� �����Ѵ�. 
		 * */
		Scanner sc = null;
		try {
			sc = new Scanner(new File("C:/Users/�̻���/Downloads/text.txt"));
			while( sc.hasNext() ) {
				System.out.println(sc.next());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}
}
