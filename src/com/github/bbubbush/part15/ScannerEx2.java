package com.github.bbubbush.part15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerEx2 {
	public static void main(String[] args) {
		/* Scanner File셍성자 예제
		 * iterator을 hasNext()와 next() 메서드를 통해 동일하게 구현한다. 
		 * */
		Scanner sc = null;
		try {
			sc = new Scanner(new File("C:/Users/이상훈/Downloads/text.txt"));
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
