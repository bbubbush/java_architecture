package com.github.bbubbush.part15;

import java.io.File;

public class FileEx2 {
	public static void main(String[] args) {
		/* ���丮 ���
		 * FIle ��ü�� ��ġ�� �����ϴ� ���ϵ��� �̸��� �޾� ����Ѵ�.
		 * ��� ���� �� ���丮�� ������ ��� ���ؼ� list() �޼��带 ����Ѵ�.
		 * */
		File dir = new File("F:/");
		if (dir.exists()) {
			if (dir.isDirectory()) {
				String[] fileNameList = dir.list();
				for (String fileName : fileNameList) {
					System.out.println("���� �̸� : " + fileName);
					
				}
				
			}
			
		}
	}
}
