package com.github.bbubbush.part15;

import java.io.File;

public class FileEx2 {
	public static void main(String[] args) {
		/* 디렉토리 목록
		 * FIle 객체의 위치에 존재하는 파일들의 이름을 받아 출력한다.
		 * 모든 파일 및 디렉토리의 정보를 얻기 위해서 list() 메서드를 사용한다.
		 * */
		File dir = new File("F:/");
		if (dir.exists()) {
			if (dir.isDirectory()) {
				String[] fileNameList = dir.list();
				for (String fileName : fileNameList) {
					System.out.println("파일 이름 : " + fileName);
					
				}
				
			}
			
		}
	}
}
