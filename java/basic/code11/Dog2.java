package com.test;

/**
 * 这是具体的狗类
 * 
 * @author 风清扬
 * @version V1.0
 */
public class Dog2 extends Animal2 implements Jump2 {

	@Override
	public void jump() {
		System.out.println("会跳高的狗");
	}

	@Override
	public void eat() {
		System.out.println("狗吃肉");
	}

	@Override
	public void sleep() {
		System.out.println("狗站着睡觉");
	}

}