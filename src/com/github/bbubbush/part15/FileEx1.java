package com.github.bbubbush.part15;

import java.io.File;

public class FileEx1 {
	public static void main(String[] args) {
		/* 파일 정보 출력
		 * 파일이나 디렉토리의 등록정보를 표현한다.
		 * 파일의 내용을 포함하지 않는다.
		 * 실제 파일의 존재여부와 상관없이 생성된다.
		 * */
		File f = new File("F:/JAVA/workspace/java_basic/README.md");
		System.out.println("파일 여부 >>> " + f.isFile());
		System.out.println("디렉토리 여부 >>> " + f.isDirectory());
		System.out.println("상대경로 >>> " + f.getPath());
		System.out.println("절대경로 >>> " + f.getAbsolutePath());
		System.out.println("파일 이름 >>> " + f.getName());
		System.out.println("파일 길이 >>> " + f.length());
		System.out.println("파일의 최종 수정 날짜 >>> " + f.lastModified());
		
		
	}
}
