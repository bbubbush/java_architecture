package com.github.bbubbush.part6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Account{
	private String name;
	private long balance;
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public Account(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public long getBalance() {
		return balance;
	}
	
	public void deposit(long amount){
		balance += amount;
	}
	
	public void withdraw(long amount){
		if (balance < amount) {
			System.out.println("�ܰ� �����մϴ�.");
		}else{
			balance -= amount;
		}
	}
	
}// end of Account class

public class Banking {
	public static void main(String[] args) throws IOException {
		/* OOP ���� ���� - ������ ������� �����
		 * �Աݰ� ���, ���� ��ȸ�� ������ ���� ���α׷��� �����.
		 * ����� �����ϴ� Account�� �̿� ���� ���۽�Ű�� Banking �� Ŭ������ ����� ���۽�Ų��.
		 * */
		
		Account ac = new Account("ȫ�浿");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strWork;
		
		do{
			System.out.println("\n\n �۾������� �����ϼ���");
			System.out.println("====================================");
			System.out.println("��    �� : 1");
			System.out.println("��    �� : 2");
			System.out.println("�ܰ�Ȯ�� : 3");
			System.out.println("��    �� : 0");
			System.out.println("====================================");
			System.out.print("�۾��� ������ �����ϼ��� >>> ");
			strWork = br.readLine();
			int switchInt = 0;
			
			if ( strWork != null ){
				switchInt = Integer.parseInt(strWork);
			}else{
				System.out.println("�۾������� �Է����� �ʾҽ��ϴ�.");
				System.exit(0);
			}
			
			System.out.println();
			switch ( switchInt ) {
			case 1:
				System.out.println("====================================");
				System.out.print("�ݾ��� �Է��ϼ��� >>> ");
				long depositIn = Long.parseLong(br.readLine());
				ac.deposit(depositIn);
				break;
			case 2:
				System.out.println("====================================");
				System.out.print("�ݾ��� �Է��ϼ��� >>> ");
				long withdrawIn = Long.parseLong(br.readLine());
				ac.withdraw(withdrawIn);
				break;
			case 3:
				System.out.println(ac.getName() + "���� �ܰ�� " + ac.getBalance() + "�� �Դϴ�.");
				break;
			case 0:
				break;
			default:
				System.out.println("�Է��� ���� �ùٸ��� �ʽ��ϴ�. �ٽ� �Է����ֽñ� �ٶ��ϴ�.");
			}
			
		}while( !"0".equals(strWork) );
	}
}
