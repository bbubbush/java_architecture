package com.github.bbubbush.part15;

import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class ScannerEx3 {
	public static void main(String[] args) {
		/* Scanner URL�κ��� �о����
		 * �����ϰ� ��������� URL�κ��� �����͸� �о���� ����̴�.
		 * ��Ʈ��ũ �� URL ���� ��ü�� ������ ������ ���������� �ͼ������� �پ��� �۾��� �õ��� �� �ִ�.
		 * URL��ü�� URLConnection ��ü�� Ȱ�뿡 ���� �߰����ΰ� �ʿ��ϴ�.
		 * */
		URLConnection urlCon = null;
		Scanner sc = null;
		try {
			urlCon = new URL("https://www.google.co.kr/").openConnection();
			sc = new Scanner(urlCon.getInputStream());
			sc.useDelimiter("\\Z");
			String text = sc.next();
			System.out.println(text);
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			sc.close();
		}
	}
}
