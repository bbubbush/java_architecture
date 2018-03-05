package com.github.bbubbush.part11;

import java.io.IOException;

public class ExceptionEx5 {
	public static void main(String[] args) {
		/* Runtime exception (Unchecked Exception)
		 * 컴파일시 에러를 발생하지 않는다.
		 * 런타임 외에는 컴파일시 에러가 발생한다.
		 * 별도로 예외처리를 하지 않아도 되는 예외지만 대부분 개발자의 부주의에서 비롯된 예외다.
		 * 따라서 런타임의 경우는 발생하지 않도록 의식하는 개발을 해야겠다.(혹은 checked로 예외를 전환시키거나)
		 * 
		 * */
		try {
			int input = System.in.read();			// checked exception 인 IOException의 발생이 예상되므로 try~catch or throw가 강제된다.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int temp = 10/0;			// 한눈에 봐도 unchecked exception인 Arithmetic Exception이 발생하지만 예외처리를 강제하지 않는다.
	}
}
