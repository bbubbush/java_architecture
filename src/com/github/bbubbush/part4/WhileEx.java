package com.github.bbubbush.part4;

public class WhileEx {
	public static void main(String[] args) {
		/* while문에 대한 간단한 예제이다.
		 * for문과 달리 반복횟수가 확실하지 않을 때 사용하면 좋다. 다만 무한루프에 빠지지 않도록 주의해야한다.
		 * 일반적인 while문은 사용이 단순하여 do while문을 사용한 예제만 만들었다.
		 * */
		
		int cnt = 1, sum = 0;
		
		do{
			sum += cnt;
			cnt++;
		}while(cnt <= 0);	// 조건을 0을 주던, 1을주던, 10을 주던 sum에 cnt(1)을 더하게 된다.
		System.out.println(sum);
		String str = "1";
		String str2 = "2";
		System.out.println(str2.hashCode());
	}
}
