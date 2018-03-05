package com.github.bbubbush.part7;

class PointEx{
	private int x, y;
	
	public PointEx() {
		// TODO Auto-generated constructor stub
	}
	
	public PointEx(int x){
		this.x = x;
	}
	
	public PointEx(int x, int y){
		this(x);
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void disp(){
		System.out.println("x value is " + this.x);
		System.out.println("y value is " + this.y);
	}
}



public class CircleEx extends PointEx{
	private int r;
	public CircleEx() {
		// TODO Auto-generated constructor stub
	}
	
	public CircleEx(int x){
		super(x);
		r = 1;
	}
	
	public CircleEx(int x, int y){
		super(x, y);
		r = 2;
	}
	
	public CircleEx(int x, int y, int r){
		super(x, y);
		this.r = r;
	}
	
	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	
	public void disp(){
		super.disp();
		System.out.println("r value is " + r);
	}

	
	public static void main(String[] args) {
		/* super and this 연습
		 * 말 그대로 연습이다. super와 this의 개념이 낯설경우 힘들겠지만 이미 충분히 익숙하다면 특별한점 없이 할 수 있다.
		 * */
		CircleEx c = new CircleEx();
		CircleEx c1 = new CircleEx(5);
		CircleEx c2 = new CircleEx(3, 4);
		CircleEx c3 = new CircleEx(3, 4, 6);
		c.disp();
		System.out.println();
		c1.disp();
		System.out.println();
		c2.disp();
		System.out.println();
		c3.disp();
		
	}
}
