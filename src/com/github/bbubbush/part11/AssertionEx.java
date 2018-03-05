package com.github.bbubbush.part11;

public class AssertionEx {
	public void gugu(int dan){
		assert dan > 1 && dan < 10 : "2~9단 중 하나를 입력하세요";
		System.out.println(dan + "단");
		System.out.println();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 9; i++) {
			sb.delete(0, sb.length());
			sb.append(dan);
			sb.append("*");
			sb.append(i+1);
			sb.append("=");
			sb.append(dan*(i+1));
			System.out.println(sb.toString());
		}
		
	}
	public static void main(String[] args) {
		/* Assertion(단언)
		 * 특정한 값에 대해 프로그래머가 예상하는 범위 내에서 동작해야 할 경우, 단언을 통해 값을 검증할 수 있다.
		 * 일종의 테스트의 느낌도 있다.
		 * 
		 * assert [boolean] : [fail message]
		 * JUit 혹은 debug 모드에 비해 큰 메리트가 있는지 의문이며, 예외와 테스트 그 중간에 위치한 느낌이다.
		 * 
		 * 실행할 때는 java -ea ClassName  형태로 실행해야한다. (ea는 Enable Assertions의 약어)
		 * */
		AssertionEx a = new AssertionEx();
		try {
			a.gugu(2);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
