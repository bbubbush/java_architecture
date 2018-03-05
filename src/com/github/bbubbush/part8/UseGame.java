package com.github.bbubbush.part8;

abstract class Unit{
	int x, y;
	abstract void move(int x, int y);
	abstract void stop();
	abstract void message();
}

class Marine extends Unit{
	@Override
	void message() {
		// TODO Auto-generated method stub
		System.out.println("Message: Standing back.");
	}
	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("마린의 위치 이동 좌표는 x : " + x + ", y : " + y + "입니다.");
	}
	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("마린이 대기상태에 있습니다.");
	}
	
	void stimPack(){
		System.out.println("마린이 스팀팩을 사용합니다.");
	}
}

class SiegeTank extends Unit{
	@Override
	void message() {
		// TODO Auto-generated method stub
		System.out.println("Message: GO, Siege!");
	}
	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("시즈탱크의 위치 이동 좌표는 x : " + x + ", y : " + y + "입니다.");
	}
	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("시즈탱크가 대기상태에 있습니다.");
	}
	
	void changeMode(){
		System.out.println("Yes, Sir!");
	}
}

class DropShip extends Unit{
	@Override
	void message() {
		// TODO Auto-generated method stub
		System.out.println("Message: Can I take orders.");
	}
	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("드랍쉽의 위치 이동 좌표는 x : " + x + ", y : " + y + "입니다.");
	}
	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("드랍쉽이 대기상태에 있습니다.");
	}
	
	void load(){
		System.out.println("탑승시킵니다.");
	}
	
	void dropdown(){
		System.out.println("내립니다.");
	}
}

public class UseGame {
	public static void main(String[] args) {
		/* 추상화 종합예제
		 * 동물병원과 큰 차이는 없지만 공통을 유닛클래스로 빼고 각자 필요한 부분을 오버라이딩하여 구현하는 방법에서 개발자의 역량이 필요한 문제이다.
		 * 스타크래프트의 캐릭터를 가져와 재밌게 접근할 수 있었다.
		 * */
		
		Unit[] u = new Unit[3];
		
		u[0] = new Marine();
		u[1] = new SiegeTank();
		u[2] = new DropShip();
		
		for (int i = 0; i < u.length; i++) {
			u[i].move(100, 200);
			u[i].message();
		}
	}
}
