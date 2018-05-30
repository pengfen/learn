package com.test;

/*
接口的特点：
	A:接口用关键字interface表示	
		interface 接口名 {}
	B:类实现接口用implements表示
		class 类名 implements 接口名 {}
	C:接口不能实例化
		那么，接口如何实例化呢?
		按照多态的方式来实例化。
	D:接口的子类
		a:可以是抽象类。但是意义不大。
		b:可以是具体类。要重写接口中的所有抽象方法。(推荐方案)

由此可见：
	A:具体类多态(几乎没有)
	B:抽象类多态(常用)
	C:接口多态(最常用)
*/
//定义动物培训接口
interface AnimalTrain {
	public abstract void jump();
}

//抽象类实现接口
abstract class Dog21 implements AnimalTrain {
}

//具体类实现接口
class Cat21 implements AnimalTrain {
	public void jump() {
		System.out.println("猫可以跳高了");
	}
}

class InterfaceDemo {
	public static void main(String[] args) {
		//AnimalTrain是抽象的; 无法实例化
		//AnimalTrain at = new AnimalTrain();
		//at.jump();
		
		AnimalTrain at = new Cat21();
		at.jump();
	}
}