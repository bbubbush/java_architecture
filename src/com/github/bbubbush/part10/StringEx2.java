package com.github.bbubbush.part10;

public class StringEx2 {
	public static void main(String[] args) {
		/* String ��ü�� �Һ���(immutability)
		 * �ѹ� �����Ǹ� �� ������ �ٲ� �� ���� ���� �Һ����̶�� �Ѵ�.
		 * ���� String constant pool�� ��� ���� �ְ� �ǹǷ�(Garbage) �޸� ���� �߻��Ѵ�.
		 * ���� String constant pool�� GC�� �������� �ʰ�, �������� ��ü ������ �������Ϸ� �̾�����.
		 * ���� ���ڿ��� ��� ���ϴ� ��� StringBuffer Ŭ������ ����ϴ� ���� �ٶ����ϴ�.
		 * String ��ü�� doc�� ���� ��κ� return ���� new String���� ���ο� ��ü�� �����Ѵ�.
		 * 
		 * ������ JDK 1.5���� ���Ŀ��� String ��ü�� �����߾, StringBuilder�� ġȯ���� �������� �ϱ� ������ �������� ���̰� ���� ����.
		 * */
		String str = new String();	
		str += "Hello";				// str = new StringBuffer("").append("Hello").toString(); 
		str += " Java";				// str = new StringBuffer("Hello").append(" Java").toString();
		System.out.println("str = " + str);
		
		// append �Ǵ� ���ڿ� ���� String ��ü�̹Ƿ� �� 5���� String ��ü�� �����ȴ�.
		
	}
}
