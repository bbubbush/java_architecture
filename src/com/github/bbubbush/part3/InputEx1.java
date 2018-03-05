package com.github.bbubbush.part3;

import java.awt.Toolkit;
import java.io.IOException;

public class InputEx1 {
	public static void main(String[] args) throws IOException {
		/* ASCII code 입력받기
		 * 기본적으로 알아야 할 ASCII Code Value
		 * '\b' = 8		'\t' = 9		'\n' = 10		'\r' = 13		삐소리 = 15 		ESC = 27
		 * 48~57 = 0~9		65~90 = 'A'~'Z'		97~122 = 'a'~'z'
		 * */
		System.out.print("input string value : ");
		int i = System.in.read();
		System.out.println("ASCII Value = " + i);
		
		// beep 출력
		Toolkit.getDefaultToolkit().beep();
	}
}
