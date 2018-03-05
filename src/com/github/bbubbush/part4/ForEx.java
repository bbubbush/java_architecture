package com.github.bbubbush.part4;

public class ForEx {
	public static void main(String[] args) {
		/* for문은 자주 사용하고 간단하므로 여기에 모든 예제를 몰아서 작성.
		 * 주로 label에 대해서만 주석을 달고 나머지는 가볍게 넘어감
		 * */
		
		// 2중 for문
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d\t*\t%d\t=\t%d\n", i, j, i*j);
			}
			System.out.println();
		}
		
		/* label은 for문에게 구분자를 주어 break나 continue를 수행하고 싶은 for문을 선택할 수 있다.
		 * stackoverflow에서는 label이 금지된 예약어인 goto와 무엇이 다른가에 대한 글이 있다. goto와는 다르게 for문 내에서 한정되어 사용되기 때문에
		 * 이부분에 있어 다름을 인정하는 상황이지만, label을 사용함에 있어 긍정적이진 않다. 아마 for문마다 붙는 label이 가독성을 떨어뜨리기 때문인 것 같다.
		 * */
		// break label 사용
		System.out.println("break lable>>>");
		First:
		for (int i = 0; i < 100; i++) {
			Secend:
			for (int j = 0; j < 100; j++) {
				if (i * j == 10) {
					System.out.println(i + ", " + j);
					break First;
				}
			}
			System.out.println("i >>> " + i);
		}
		
		// continue label 사용
		System.out.println("continue lable>>>");
		First:
		for (int i = 0; i < 100; i++) {
			Secend:
				for (int j = 0; j < 100; j++) {
					if (i * j == 10) {
						System.out.println(i + ", " + j);
						continue First;
					}
				}
			System.out.println("i >>> " + i);
		}
		
		/* java 5.0부터 사용 가능한 foreach문이다.
		 * 전체 배열을 순회하면서 배열 내 모든 값에 접근한다.
		 * */
		// foreach
		System.out.println("foreach>>>");
		String[] str_list = {"A", "B", "C"};
		for (String s : str_list) {
			System.out.println(s);
		}
		
		
		
		
	}
}
