package com.github.bbubbush.part7;

class AnimalParent{
	public String scream(){
		return "���� �����Ҹ�";
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
		return "�۸۱���";
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
		return "�߿˾߿�";
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
		return "�׸����������";
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
}

class Hospital{
	public void inject(AnimalParent animal){
		// �������� Ȱ���� �κ�. �ڽİ�ü�� ������ �θ�ü�� ��Ÿ�� �� ������ �θ��� Ư���� �߽����� �ڵ��� �ϰ� 
		// �ڽ��� �θ��� �޼��带 �������̵��Ͽ� ���Խ�Ų��.
		System.out.println(animal.getName() + "��(��) ġ���ϱ� ���� �ֻ縦 ���ҽ��ϴ�.");
		System.out.println(animal.scream());
	}
}

public class HospitalMain {
	public static void main(String[] args) {
		/* Inheritance and Polymorphysm E.G.
		 * ����� ����, �������̵�, �������� ���ÿ� Ȱ���� ����
		 * ���� �̷��� �����ؾ߰ڴٴ� ������ �� ���ϴ� �� �ʹ�. �׷��� �ͼ������� ������ �Ŀ�Ǯ�� ������ �ڶ��� �� ����.
		 * Spring���� injection ������ ���⿡ ������ �� ����.
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
