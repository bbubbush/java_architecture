package com.github.bbubbush.part7;

class AnimalParent{
	public String scream(){
		return "동물 울음소리";
	}
	
	public String getName(){
		return null;
	}
}

class DogChild extends AnimalParent{
	private String name;
	public DogChild(){
		name = getClass().getSimpleName();
	}
	@Override
	public String scream() {
		// TODO Auto-generated method stub
		return "멍멍깨깽";
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
}

class CatChild extends AnimalParent{
	private String name;
	public CatChild(){
		name = getClass().getSimpleName();
	}
	@Override
	public String scream() {
		// TODO Auto-generated method stub
		return "야옹야옹";
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
}

class TigerChild extends AnimalParent{
	private String name;
	public TigerChild(){
		name = getClass().getSimpleName();
	}
	@Override
	public String scream() {
		// TODO Auto-generated method stub
		return "그르르어흥어흥";
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
}

class Hospital{
	public void inject(AnimalParent animal){
		// 다형성을 활용한 부분. 자식객체는 어차피 부모객체로 나타낼 수 있으니 부모의 특성을 중심으로 코딩을 하고 
		// 자식은 부모의 메서드를 오버라이딩하여 주입시킨다.
		System.out.println(animal.getName() + "을(를) 치료하기 위해 주사를 놓았습니다.");
		System.out.println(animal.scream());
	}
}

public class HospitalMain {
	public static void main(String[] args) {
		/* Inheritance and Polymorphysm E.G.
		 * 상속의 개념, 오버라이딩, 다형성을 동시에 활용한 예제
		 * 직접 이렇게 구현해야겠다는 생각은 잘 못하는 듯 싶다. 그러나 익숙해지면 굉장히 파워풀한 성능을 자랑할 것 같다.
		 * Spring에서 injection 개념이 여기에 기인한 것 같다.
		 * */
		Hospital h = new Hospital();
		AnimalParent dog = new DogChild();
		AnimalParent cat = new CatChild();
		AnimalParent tiger = new TigerChild();
		
		h.inject(dog);
		h.inject(cat);
		h.inject(tiger);
		
	}
}
