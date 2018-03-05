package com.github.bbubbush.part6;

public class ReferenceParameter {
	public void increase(int[] n){
		for (int i = 0; i < n.length; i++) {
			n[i]++;
		}
	}
	
	public void difference(int num, String[] strArr){
		/* Call by value는 값을 전달하므로써 새로운 저장 공간에 담아 처리한다. 
		 * 따라서 매개변수 num에 입력된 값은 진짜 값, 다시 말해 의미있는 정보를 말한다.
		 * 
		 * 하지만 Call by reference는 값을 전달하는 것이 아니라 메모리 주소의 정보를 보낸다. 
		 * 따라서 매개변수 strArr에 접근해서 수정하는 순간 메모리 주소가 가리키는 정보를 수정하게 된다. 
		 * 그러므로 어디서 strArr을 호출하든 주소값이 변하지 않았기 때문에 수정된 정보를 가져오게 된다.
		 * */
		
		num = num + 10;
		strArr[0] = "Python";
	}
	
	public static void main(String[] args) {
		/* Call by reference
		 * 메서드 호출시 전달하려는 인자를 ref 자료형을 사용하는 경우를 말한다.
		 * 기본자료형을 배열로 전달할 시에도 ref자료형으로 분류한다.
		 * Call by value와 Call by reference의 가장 큰 차이는 parameter에 접근하는 방식이다.
		 * 교재에는 없지만 차이를 설명하기위해 ReferenceParameter 클래스 안에 difference메서드를 통해 설명하겠다.
		 * */
		int[] ref1 = {100, 800, 10};
		ReferenceParameter r = new ReferenceParameter();
		r.increase(ref1);
		for (int i = 0; i < ref1.length; i++) {
			System.out.println(ref1[i]);
		}
		System.out.println();
		
		
		// Call by value와 Call by reference의 차이
		int num = 10;
		String[] strArr = {"Java"};
		
		// 메서드 실행 전 값
		System.out.println("before num >>> " + num);
		System.out.println("before strArr[0] >>> " + strArr[0]);
		r.difference(num, strArr);
		
		// 메서드 실행 후 값
		System.out.println("after num >>> " + num);
		System.out.println("after strArr[0] >>> " + strArr[0]);
	}
}
