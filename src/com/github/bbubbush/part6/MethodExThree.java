package com.github.bbubbush.part6;

public class MethodExThree {
	private int var;
	public void setVar(int var){
		//var = var 		문제가 발생하는 코드. instance variable과 local variable의 이름이 겹쳐기 때문
		this.var = var;
	}
	
	public int getVar(){
		return this.var;
	}
	
	public static void main(String[] args) {
		/* 생각해볼만한 메서드 문제
		 * 제목처럼 적혀있었는데 사실 this에 대한 사용법을 고민하자는 취지에서 낸 문제였다.
		 * */
		MethodExThree m = new MethodExThree();
		m.setVar(1000);
		System.out.println(m.getVar());
	}
}
