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
		System.out.println("������ ��ġ �̵� ��ǥ�� x : " + x + ", y : " + y + "�Դϴ�.");
	}
	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("������ �����¿� �ֽ��ϴ�.");
	}
	
	void stimPack(){
		System.out.println("������ �������� ����մϴ�.");
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
		System.out.println("������ũ�� ��ġ �̵� ��ǥ�� x : " + x + ", y : " + y + "�Դϴ�.");
	}
	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("������ũ�� �����¿� �ֽ��ϴ�.");
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
		System.out.println("������� ��ġ �̵� ��ǥ�� x : " + x + ", y : " + y + "�Դϴ�.");
	}
	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("������� �����¿� �ֽ��ϴ�.");
	}
	
	void load(){
		System.out.println("ž�½�ŵ�ϴ�.");
	}
	
	void dropdown(){
		System.out.println("�����ϴ�.");
	}
}

public class UseGame {
	public static void main(String[] args) {
		/* �߻�ȭ ���տ���
		 * ���������� ū ���̴� ������ ������ ����Ŭ������ ���� ���� �ʿ��� �κ��� �������̵��Ͽ� �����ϴ� ������� �������� ������ �ʿ��� �����̴�.
		 * ��Ÿũ����Ʈ�� ĳ���͸� ������ ��հ� ������ �� �־���.
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
