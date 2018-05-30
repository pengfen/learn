package cn.itcast_01;

public class AnimalDemo {
	public static void main(String[] args) {
		// ���������
		Dog d = new Dog();
		d.eat();
		Cat c = new Cat();
		c.eat();
		System.out.println("------------");

		// �������˺�ͨ����������
		// Dog dd = AnimalFactory.createDog();
		// Cat cc = AnimalFactory.createCat();
		// dd.eat();
		// cc.eat();
		// System.out.println("------------");

		// �����Ľ���
		Animal a = AnimalFactory.createAnimal("dog");
		a.eat();
		a = AnimalFactory.createAnimal("cat");
		a.eat();

		// NullPointerException
		a = AnimalFactory.createAnimal("pig");
		if (a != null) {
			a.eat();
		} else {
			System.out.println("�Բ�����ʱ���ṩ���ֶ���");
		}
	}
}