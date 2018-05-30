package com.test;

/**
 * 这是具体的猫类
 * 
 * @author 风清扬
 * @version V1.0
 */
public class Cat2 extends Animal2 {

	@Override
	public void eat() {
		System.out.println("猫吃鱼");
	}

	@Override
	public void sleep() {
		System.out.println("猫趴着睡觉");
	}

}
