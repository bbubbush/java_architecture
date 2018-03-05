package com.github.bbubbush.part10;

public class RuntimeEx {
	public static void main(String[] args) {
		/* Runtime class
		 * ����ð��� ����ȯ�濡 ���� ������ ��ų�, ����� �����ϴ� Ŭ����.
		 * 
		 * �ֿ�޼���
		 * freeMemory(): ���� JVM���� ��� ������ �޸��� ��. byte �����̴�.
		 * totalMemory(): ��ü �޸��� ���� byte������ ���.
		 * */
		Runtime rt = Runtime.getRuntime();
		long fr = rt.freeMemory();
		System.out.println("Free memory = " + (fr/1024) + "KB");
		
		long fr2 = rt.totalMemory();
		System.out.println("Total memory = " + (fr2/2014) + "KB");
		
		try {
			// rt.exec("C:\\windows\\system32\\calc.exe");				// ���� ���α׷� ����
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
	}
}
