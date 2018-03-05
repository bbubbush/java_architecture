package com.github.bbubbush.part7;

public class HashcodeEx {
	public static void main(String[] args) {
		/* Hashcode�� �ּҰ�
		 * ������ ������ String�� ��ü, ������ �ּҿ� �ؽ��ڵ带 �������� � ����� ������ �˷��ִ� �� �̾���.
		 * �׷��� �� ���� ������ �׷��� ������ �ʴ�. String�� Ŭ�����̱⿡ �翬�� ��ü��� ���������� �ǻ��� ���� �ɿ��ߴ�.
		 * ���� ������� String�� ��ü��� ��ü�� �񱳿� ����� ���ƾ��Ѵ�.
		 * ������ String�� �и� ��ü�ʹ� �ٸ� ������� ���Դ�.
		 * �켱 disassemble�� ����Ʈ�ڵ带 ���캸�� new Ű���带 ����� ��� java.lang.String Ŭ������ ȣ���Ѵ�.
		 * �ݸ� ���ڿ� ���ͷ��� �ʱ�ȭ�� ��쿡�� ������ Ŭ����ȣ�� ���� �ٷ� �Էµȴ�.
		 * ���� �������� ũ�� ������ �� �ִ�. String�� Ư���� ��ü�� ���ڿ� ���ͷ��� Ȱ���� ��� String constant pool�� ����ȴ�.
		 * �׷��� ���� ���� ����Ű�� String������ �����ϸ� ���� �޸��ּҸ� �����ϰ� �ȴ�.
		 * new�� ����� ��� heap������ �����Ǿ� �����Ǳ� ������ ���ڿ����ͷ����� �ٸ� ������� ���� �ȴ�.
		 * 
		 * ������ �Ʒ� �ڵ带 ���� ���ڿ� ���ͷ��̵�, new�� Ȱ���� ��ü�� �����ߴ� ���� ������ �ؽ��ڵ带 ���´�.
		 * �ᱹ �ؽ��ڵ� ��ü ���� ���ǵ� ������ ���� ���� ������ �������ִ� ���� Ȯ���ߴ�. �޸� ��ġ�� ������� ���̴�.
		 * */
		// String Ÿ���� �ؽ��ڵ�
		String str = new String("String");
		String str2 = new String("String");
		String str3 = "String";
		String str4 = "String";
		
		System.out.println("str==str2 >>> " + (str==str2));
		System.out.println("str3==str4 >>> " + (str3==str4));
		System.out.println("str.hashCode()==str2.hashCode() >>> " + (str.hashCode()==str2.hashCode()));
		System.out.println(str.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		System.out.println();
		
		str3 += "3";
		str4 += "4";
		
		System.out.println(str.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		System.out.println();
		
		// ��ü�� �ؽ��ڵ�
		HashcodeEx h = new HashcodeEx();
		HashcodeEx h2 = new HashcodeEx();
		System.out.println(h==h2);
		System.out.println(h.hashCode()==h2.hashCode());
		System.out.println(h.hashCode());
		System.out.println(h2.hashCode());
		

		
		
	}
}
