package com.github.bbubbush.part4;

public class WhileEx {
	public static void main(String[] args) {
		/* while���� ���� ������ �����̴�.
		 * for���� �޸� �ݺ�Ƚ���� Ȯ������ ���� �� ����ϸ� ����. �ٸ� ���ѷ����� ������ �ʵ��� �����ؾ��Ѵ�.
		 * �Ϲ����� while���� ����� �ܼ��Ͽ� do while���� ����� ������ �������.
		 * */
		
		int cnt = 1, sum = 0;
		
		do{
			sum += cnt;
			cnt++;
		}while(cnt <= 0);	// ������ 0�� �ִ�, 1���ִ�, 10�� �ִ� sum�� cnt(1)�� ���ϰ� �ȴ�.
		System.out.println(sum);
		String str = "1";
		String str2 = "2";
		System.out.println(str2.hashCode());
	}
}
