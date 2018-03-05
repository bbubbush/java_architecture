package com.github.bbubbush.part15;

import java.io.File;
import java.io.IOException;

public class FileEx3 {
	public static void main(String[] args) throws IOException {
		/* ����, ���丮 ����, ���� �� ����
		 * ���� ����� �� �ִ� �޼������ Ȱ���ϴ� �����̴�.
		 * �ַ� Input, Output�� ���� �۾��� �ƴϱ⿡ Ȱ���� ����� �� ������ File ��ü�� ���ؼ� �˰�� �־�� �Ѵ�.
		 * */
		
		// createNewFile
		File f1 = new File("F:/newFile.txt");
		if ( f1.exists() ) {
			System.out.println("File name >>> " + f1.getName());
		}else{
			if ( f1.createNewFile() ) {
				System.out.println("Create new file");
			}
		}
		
		// mkdir
		File f2 = new File("F:/newDirec");
		if ( !f2.exists() ) {
			f2.mkdir();
		}else{
			System.out.println("Dir path >>> " + f2.getPath());
		}
		
		// delete
		File f3 = new File("F:/text.txt");
		if ( f3.exists() ) {
			f3.delete();
		}
		
		// renameTo
		File src = new File("f:/newFile.txt");
		File dest = new File("f:/newDirec/dest.txt");
		File dest2 = new File("f:/newDirec/dest2.txt");
			
		if( src.exists() ){
			src.renameTo(dest);
			src.renameTo(dest2);
		}
		
		// list
		if( f2.isDirectory() ){
			String dir[] = f2.list();
			System.out.println("\n\nDir Content >>> \n");
			for (String dirs : dir) {
				System.out.println("dirs >>> " + dirs);
				
			}
		}
		
	}
}
