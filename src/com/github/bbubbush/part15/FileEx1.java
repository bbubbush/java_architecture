package com.github.bbubbush.part15;

import java.io.File;

public class FileEx1 {
	public static void main(String[] args) {
		/* ���� ���� ���
		 * �����̳� ���丮�� ��������� ǥ���Ѵ�.
		 * ������ ������ �������� �ʴ´�.
		 * ���� ������ ���翩�ο� ������� �����ȴ�.
		 * */
		File f = new File("F:/JAVA/workspace/java_basic/README.md");
		System.out.println("���� ���� >>> " + f.isFile());
		System.out.println("���丮 ���� >>> " + f.isDirectory());
		System.out.println("����� >>> " + f.getPath());
		System.out.println("������ >>> " + f.getAbsolutePath());
		System.out.println("���� �̸� >>> " + f.getName());
		System.out.println("���� ���� >>> " + f.length());
		System.out.println("������ ���� ���� ��¥ >>> " + f.lastModified());
		
		
	}
}
