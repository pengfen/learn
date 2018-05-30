package com.test;

public class AnimalDemo {
	public static void main(String[] args) {
		// 抽象类不能实例化
		// Animal a = new Animal();

		Animal a = new Cat();
		a.eat();
		// a.sleep();

		System.out.println("----------");

		a = new Dog();
		a.eat();
		// a.sleep();

		System.out.println("----------");

		// 想使用跳高功能
		Dog d = (Dog) a;
		d.eat();
		d.sleep();
		// d.jump();
	}
}
