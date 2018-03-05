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
			System.out.println("�ܰ� �����մϴ�.");
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
		/* inheritance ���� ����
		 * ���� ��Ʈ���� ������� Account Ŭ������ ����Ͽ� �����ϴ� ���α׷��� �����.
		 * ��й�ȣ�� �Է��� �ʱ�ȭ �� �� �Է��� ��й�ȣ�� ������ true, �ƴϸ� false�� �����ϴ� �޼��带 �����.
		 * */
		
		NewAccount n = new NewAccount("ȫ�浿", "1234");
		
		System.out.println(n.getPass());
		System.out.println(n.passCheck("123"));
		System.out.println(n.passCheck("1234"));
	}
}
