package com.github.bbubbush.part11;

public class AssertionEx {
	public void gugu(int dan){
		assert dan > 1 && dan < 10 : "2~9�� �� �ϳ��� �Է��ϼ���";
		System.out.println(dan + "��");
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
		/* Assertion(�ܾ�)
		 * Ư���� ���� ���� ���α׷��Ӱ� �����ϴ� ���� ������ �����ؾ� �� ���, �ܾ��� ���� ���� ������ �� �ִ�.
		 * ������ �׽�Ʈ�� ������ �ִ�.
		 * 
		 * assert [boolean] : [fail message]
		 * JUit Ȥ�� debug ��忡 ���� ū �޸�Ʈ�� �ִ��� �ǹ��̸�, ���ܿ� �׽�Ʈ �� �߰��� ��ġ�� �����̴�.
		 * 
		 * ������ ���� java -ea ClassName  ���·� �����ؾ��Ѵ�. (ea�� Enable Assertions�� ���)
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
