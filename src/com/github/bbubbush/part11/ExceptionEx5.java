package com.github.bbubbush.part11;

import java.io.IOException;

public class ExceptionEx5 {
	public static void main(String[] args) {
		/* Runtime exception (Unchecked Exception)
		 * �����Ͻ� ������ �߻����� �ʴ´�.
		 * ��Ÿ�� �ܿ��� �����Ͻ� ������ �߻��Ѵ�.
		 * ������ ����ó���� ���� �ʾƵ� �Ǵ� �������� ��κ� �������� �����ǿ��� ��Ե� ���ܴ�.
		 * ���� ��Ÿ���� ���� �߻����� �ʵ��� �ǽ��ϴ� ������ �ؾ߰ڴ�.(Ȥ�� checked�� ���ܸ� ��ȯ��Ű�ų�)
		 * 
		 * */
		try {
			int input = System.in.read();			// checked exception �� IOException�� �߻��� ����ǹǷ� try~catch or throw�� �����ȴ�.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int temp = 10/0;			// �Ѵ��� ���� unchecked exception�� Arithmetic Exception�� �߻������� ����ó���� �������� �ʴ´�.
	}
}
