package com.test;
/*
 * Animal (基类)
 * Cat extends Animal
 * Dog extends Animal
 * Pig extends Animal implements Jump
 * Jump (接口)
 */
public class Cat extends Animal {

	@Override
	public void eat() {
		System.out.println("猫吃鱼");
	}

}
