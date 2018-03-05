package com.github.bbubbush.part2;

public class CommentEx {
	/**
	 	javadoc으로 컴파일하면 api와 같은 도움말 페이지를 만들 수 있다.
		<font color ="navy" size = "5">
		"go for it!"
		</font>
		출력하는 클래스!
	*/
	
	public static void main(String[] args) {
		// 한줄주석 주석은 java compiler에서 걸러지므로 bytecode에 영향을 미치지 않는다.
		// disassambler를 통해 실제로 주석이 영향을 미치는지 확인할 수 있다.(javap)
		System.out.println("go for it!!");
	}
}
