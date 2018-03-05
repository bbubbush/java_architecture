package com.github.bbubbush.part6;

public class ReferenceParameter {
	public void increase(int[] n){
		for (int i = 0; i < n.length; i++) {
			n[i]++;
		}
	}
	
	public void difference(int num, String[] strArr){
		/* Call by value�� ���� �����ϹǷν� ���ο� ���� ������ ��� ó���Ѵ�. 
		 * ���� �Ű����� num�� �Էµ� ���� ��¥ ��, �ٽ� ���� �ǹ��ִ� ������ ���Ѵ�.
		 * 
		 * ������ Call by reference�� ���� �����ϴ� ���� �ƴ϶� �޸� �ּ��� ������ ������. 
		 * ���� �Ű����� strArr�� �����ؼ� �����ϴ� ���� �޸� �ּҰ� ����Ű�� ������ �����ϰ� �ȴ�. 
		 * �׷��Ƿ� ��� strArr�� ȣ���ϵ� �ּҰ��� ������ �ʾұ� ������ ������ ������ �������� �ȴ�.
		 * */
		
		num = num + 10;
		strArr[0] = "Python";
	}
	
	public static void main(String[] args) {
		/* Call by reference
		 * �޼��� ȣ��� �����Ϸ��� ���ڸ� ref �ڷ����� ����ϴ� ��츦 ���Ѵ�.
		 * �⺻�ڷ����� �迭�� ������ �ÿ��� ref�ڷ������� �з��Ѵ�.
		 * Call by value�� Call by reference�� ���� ū ���̴� parameter�� �����ϴ� ����̴�.
		 * ���翡�� ������ ���̸� �����ϱ����� ReferenceParameter Ŭ���� �ȿ� difference�޼��带 ���� �����ϰڴ�.
		 * */
		int[] ref1 = {100, 800, 10};
		ReferenceParameter r = new ReferenceParameter();
		r.increase(ref1);
		for (int i = 0; i < ref1.length; i++) {
			System.out.println(ref1[i]);
		}
		System.out.println();
		
		
		// Call by value�� Call by reference�� ����
		int num = 10;
		String[] strArr = {"Java"};
		
		// �޼��� ���� �� ��
		System.out.println("before num >>> " + num);
		System.out.println("before strArr[0] >>> " + strArr[0]);
		r.difference(num, strArr);
		
		// �޼��� ���� �� ��
		System.out.println("after num >>> " + num);
		System.out.println("after strArr[0] >>> " + strArr[0]);
	}
}
