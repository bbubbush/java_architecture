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
			System.out.println("잔고가 부족합니다.");
		}else{
			balance -= amount;
		}
	}
	
}// end of Account class

public class Banking {
	public static void main(String[] args) throws IOException {
		/* OOP 종합 예제 - 간단한 은행계좌 만들기
		 * 입금과 출금, 계좌 조회가 가능한 은행 프로그램을 만든다.
		 * 계과를 관리하는 Account와 이에 대해 동작시키는 Banking 두 클래스를 만들어 동작시킨다.
		 * */
		
		Account ac = new Account("홍길동");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strWork;
		
		do{
			System.out.println("\n\n 작업내용을 선택하세요");
			System.out.println("====================================");
			System.out.println("입    금 : 1");
			System.out.println("출    금 : 2");
			System.out.println("잔고확인 : 3");
			System.out.println("종    료 : 0");
			System.out.println("====================================");
			System.out.print("작업할 내용을 선택하세요 >>> ");
			strWork = br.readLine();
			int switchInt = 0;
			
			if ( strWork != null ){
				switchInt = Integer.parseInt(strWork);
			}else{
				System.out.println("작업내용을 입력하지 않았습니다.");
				System.exit(0);
			}
			
			System.out.println();
			switch ( switchInt ) {
			case 1:
				System.out.println("====================================");
				System.out.print("금액을 입력하세요 >>> ");
				long depositIn = Long.parseLong(br.readLine());
				ac.deposit(depositIn);
				break;
			case 2:
				System.out.println("====================================");
				System.out.print("금액을 입력하세요 >>> ");
				long withdrawIn = Long.parseLong(br.readLine());
				ac.withdraw(withdrawIn);
				break;
			case 3:
				System.out.println(ac.getName() + "님의 잔고는 " + ac.getBalance() + "원 입니다.");
				break;
			case 0:
				break;
			default:
				System.out.println("입력한 값이 올바르지 않습니다. 다시 입력해주시기 바랍니다.");
			}
			
		}while( !"0".equals(strWork) );
	}
}
