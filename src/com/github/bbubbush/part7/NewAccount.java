package com.github.bbubbush.part7;

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

public class NewAccount extends Account {
	private String pass;
	
	public NewAccount() {
		// TODO Auto-generated constructor stub
	}
	public NewAccount(String name, String pass){
		super(name);
		this.pass = pass;
	}
	
	public boolean passCheck(String pass){
		if ( pass.equals(this.pass) ) {
			return true;
		}else{
			return false;
		}
	}
	
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
	public static void main(String[] args) {
		/* inheritance 종합 예제
		 * 지난 파트에서 만들었던 Account 클래스를 상속하여 진행하는 프로그램을 만든다.
		 * 비밀번호를 입력해 초기화 할 때 입력한 비밀번호와 같으면 true, 아니면 false를 리턴하는 메서드를 만든다.
		 * */
		
		NewAccount n = new NewAccount("홍길동", "1234");
		
		System.out.println(n.getPass());
		System.out.println(n.passCheck("123"));
		System.out.println(n.passCheck("1234"));
	}
}
