package com.github.bbubbush.part6;

class Constructor {
	int a;
	public Constructor(){
		this.a = 10;
		System.out.println("자식 기본생성자");
	}
	public Constructor(int i){
		this.a = i;
		System.out.println("자식 인자생성자" + this.a);
		// this() 오류 compile error 발생. 이는 a에 값에 대한 혼선을 야기시키며 이 위의 코드의 존재의미를 희미하게 한다. 
	}
}

public class ConstructorEx {
	public static void main(String[] args) {
		/* 생성자 위치에 대한 예제
		 * 생성자는 new 키워드를 통해 딱 한번만 사용이 된다.
		 * 생성자 내에서만 다른 생성자를 호출할 수 있다.
		 * 다만 생성자 내에서 다른 생성자를 호출하려면 무조건 첫줄에 호출을 해야한다.
		 * 이는 상속과 관련된 문제이다. 상속이 없는 이 예제의 경우 '이건 상속이 없는데 왜 안되지?'라고 생각할 수 있다.
		 * 하지만 모든 객체는 Object를 상속하게 되므로 Constructor 클래스 역시 Object를 암묵적으로 상속하고 있다.
		 * 자식의 생성자를 호출하면 부모의 기본생성자를 자동으로 호출한다. 이는 부모객체가 존재해야 이를 상속하는 자식객체가 부모의 자원을 쓸 수 있기 때문이다.
		 * 
		 * 이 부분에서 고민을 많이했다. '부모의 초기화를 해주고 나면 그럼 this()를 해줄수도 있는거 아니야?' 이 생각 때문이다.
		 * 문법으로 안된다고 말하고 넘어가기엔 석연치않았는데 우연히 stackoverflow에서 비슷한 내용의 글을 보며 답을 찾았다.
		 * 생성자는 초기화의 역할을 한다. 그래서 맨 처음, 딱 한번 호출되는 것이 원칙이다. 때문에 해당 객체가 가장 처음에 호출 될 때 시작되어야 한다.
		 * 가령 이와 같은 예제에서 하위 this()가 문법적으로 막히지 않았다면 인자생성자에서 이미 초기화 된 this.a의 값이 기본생성자를 통해 다시 10으로 초기화 되려고 한다.
		 * 이런 이슈는 프로그램의 신뢰도를 떨어뜨리며 디버깅에 있어서도 힘든 부분이다.
		 * 
		 * 정리하자면 크게 생성자가 가장 처음에 오는 이유는 크게 두 가지 이다.
		 * 1) 부모객체의 생성 및 초기화가 되어야 자식객체가 존재할 수 있으므로 부모의 객체를 초기화 함으로써 자식객체가 활용할 수 있는 자원에 대해 명확히 하고 시작하는 것이다.
		 * 2) 코드의 신뢰성을 위해서이다. 생성자는 초기화의 역할을 담당하는데 생성자 호출 이전에 코드가 존재하면 이들은 dead line이 되거나 개발에 있어 혼란을 야기시킬수 있다.
		 * 
		 * 따라서 생성자는 생성자 내 맨 위에 딱 한번 호출이 가능하다. 
		 * 한번의 생성자 호출을 가능하게 한 것은 엄격함 속에서 유일하게 제공하는 편의라고 생각한다. 
		 * 인자가 다른 생성자여도 초기화 방법이 같다면 편의상 그 생성자를 통해서 초기화 할 수 있게 책임을 전가하는 느낌이다.
		 * */
		
		Constructor c = new Constructor(1);
		
	}// end of main
}// end of class
