package com.test;

/*
ClassCastException:����ת���쳣
һ���ڶ�̬������ת�������׳���
*/
class Animal5 {
	public void eat(){}
}

class Dog5 extends Animal5 {
	public void eat() {}
	
	public void lookDoor() {
	
	}
}

class Cat5 extends Animal5 {
	public void eat() {
	
	}
	
	public void playGame() {
		
	}
}

class DuoTaiDemo5 {
	public static void main(String[] args) {
		//�ڴ��е��ǹ�
		Animal5 a = new Dog5();
		Dog5 d = (Dog5)a;
		
		//�ڴ�����è
		a = new Cat5();
		Cat5 c = (Cat5)a;
		
		//�ڴ�����è
		Dog5 dd = (Dog5)a; //ClassCastException
	}
}

/*
 * ��̬�ĳ�Ա�����ص㼰ת�͵����
 * 
 * ��̬���������
 * 
 * class ���ӵ� {
 *     public int age = 40;
 *     
 *     public void teach() {
 *         System.out.println("����JavaSE");
 *     }
 * }
 * 
 * class ���� extends ���ӵ� {
 *     public int age = 20;
 *     
 *     public void teach() {
 *         System.out.println("��������");
 *     }
 *     
 *     public void playGame() {
 *         System.out.println("Ӣ������");
 *     }
 * }
 * 
 * Java��ѵ�ر�� �ܶ��������ӵ�ȥ���� ��һ����ӵ���������
 * ���ǻ��������� ��ʣ�����ڼ� �۸�ͦ�� ����һ�� ���ǲ��ǿ��Կ���ȥ��
 * Ȼ��ʹ��ϵ����·� ���ϵ����۾� ճ�ϵ��ĺ��� �Ϳ�ʼװ��
 * 
 * ����ת��
 * ���ӵ� K�� = new ����();
 * 
 * ���˼�����ȥ��
 * System.out.println(k��.age); // 40
 * k��.teach(); // ��������
 * k��.playGame(); // ���Ƕ��Ӳ�������
 * 
 * ������ �°�ؼ���
 * ���µ���װ�� �����Լ���װ��
 * ����ת��
 * ���� k = (����) k��;
 * System.out.println(k.age); // 20
 * k.teach(); // ��������
 * k.playGame(); // Ӣ������
 */