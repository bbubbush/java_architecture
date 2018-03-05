package com.github.bbubbush.part10;

public class SystemEx {
	public static void main(String[] args) {
		/* System class
		 * ǥ�� ������� ������ �ý��� ���ݿ� ��ģ ��� ���.
		 * 
		 * �ֿ� �޼���
		 * System.in.read()
		 * System.exit(int status)
		 * System.getProperty(String key): ���� �ý����� ȯ��Ӽ��� �����´�. key�� ���� ���� ���ϴ� ������ �����´�.
		 * */
		long startLoopTime = System.currentTimeMillis();
		long startLoopTime1 = System.nanoTime();
		
		for (int i = 0; i < 1000000; i++) {
			for (int j = 0; j < 1000000; j++) {
				int k = i*j;
			}
		}
		
		long tTime = System.currentTimeMillis() - startLoopTime;
		long tTime1 = System.nanoTime() - startLoopTime1;
		System.out.println("System.currentTimeMillis() �ҿ�ð� >>> " + tTime);
		System.out.println("System.nanoTime() �ҿ�ð� >>> " + (tTime1/1000000));
		
		byte[] buffer = new byte[255];
		System.out.println("\nType a line of text: ");
		try {
//			System.in.read(buffer, 0, 255);		// �Է¹��� ������ ���ۿ� ����
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
		
		System.out.println( new String(buffer)); 	// byte[] -> String
		
		System.out.println(System.getProperty("os.name"));		// os�� �̸��� ������
		System.out.println(System.getProperty("user.name"));	// user name�� ������
		
		// https://docs.oracle.com/javase/tutorial/essential/environment/sysprop.html ���� key list�� Ȯ���� �� ����
	}
}
