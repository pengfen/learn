package com.test;

public class AnimalDemo {
	public static void main(String[] args) {
		// �����಻��ʵ����
		// Animal a = new Animal();

		Animal a = new Cat();
		a.eat();
		// a.sleep();

		System.out.println("----------");

		a = new Dog();
		a.eat();
		// a.sleep();

		System.out.println("----------");

		// ��ʹ�����߹���
		Dog d = (Dog) a;
		d.eat();
		d.sleep();
		// d.jump();
	}
}
