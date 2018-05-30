package com.test;

/*
多态的好处：
	A:提高了代码的维护性(继承保证)
	B:提高了代码的扩展性(由多态保证)
	
猫狗案例代码
*/
class Animal {
	public void eat(){
		System.out.println("eat");
	}
	
	public void sleep(){
		System.out.println("sleep");
	}
}

class Dog extends Animal {
	public void eat(){
		System.out.println("狗吃肉");
	}
	
	public void sleep(){
		System.out.println("狗站着睡觉");
	}
}

class Cat extends Animal {
	public void eat() {
		System.out.println("猫吃鱼");
	}
	
	public void sleep() {
		System.out.println("猫趴着睡觉");
	}
	}
	
	class Pig extends Animal {
	public void eat() {
		System.out.println("猪吃白菜");
	}
	
	public void sleep() {
		System.out.println("猪侧着睡");
	}
}

//针对动物操作的工具类
class AnimalTool {
	private AnimalTool(){}
	
	/*
	//调用猫的功能
	public static void useCat(Cat c) {
		c.eat();
		c.sleep();
	}
	
	//调用狗的功能
	public static void useDog(Dog d) {
		d.eat();
		d.sleep();
	}
	
	//调用猪的功能
	public static void usePig(Pig p) {
		p.eat();
		p.sleep();
	}
	*/
	public static void useAnimal(Animal a) {
		a.eat();
		a.sleep();
	}

}

class PloymorphicDemo2 {
	public static void main(String[] args) {
		//我喜欢猫，就养了一只
		Cat c = new Cat();
		c.eat();
		c.sleep();
		
		//我很喜欢猫，所以，又养了一只
		Cat c2 = new Cat();
		c2.eat();
		c2.sleep();
		
		//我特别喜欢猫，又养了一只
		Cat c3 = new Cat();
		c3.eat();
		c3.sleep();
		//...
		System.out.println("--------------");
		//问题来了,我养了很多只猫，每次创建对象是可以接受的
		//但是呢?调用方法，你不觉得很相似吗?仅仅是对象名不一样。
		//我们准备用方法改进
		//调用方式改进版本
		//useCat(c);
		//useCat(c2);
		//useCat(c3);
		
		//AnimalTool.useCat(c);
		//AnimalTool.useCat(c2);
		//AnimalTool.useCat(c3);
		
		AnimalTool.useAnimal(c);
		AnimalTool.useAnimal(c2);
		AnimalTool.useAnimal(c3);
		System.out.println("--------------");
		
		//我喜欢狗
		Dog d = new Dog();
		Dog d2 = new Dog();
		Dog d3 = new Dog();
		//AnimalTool.useDog(d);
		//AnimalTool.useDog(d2);
		//AnimalTool.useDog(d3);
		AnimalTool.useAnimal(d);
		AnimalTool.useAnimal(d2);
		AnimalTool.useAnimal(d3);
		System.out.println("--------------");
		
		//我喜欢宠物猪
		//定义一个猪类，它要继承自动物，提供两个方法，并且还得在工具类中添加该类方法调用
		Pig p = new Pig();
		Pig p2 = new Pig();
		Pig p3 = new Pig();
		//AnimalTool.usePig(p);
		//AnimalTool.usePig(p2);
		//AnimalTool.usePig(p3);
		AnimalTool.useAnimal(p);
		AnimalTool.useAnimal(p2);
		AnimalTool.useAnimal(p3);
		System.out.println("--------------");
		
		//我喜欢宠物狼，老虎，豹子...
		//定义对应的类，继承自动物，提供对应的方法重写，并在工具类添加方法调用
		//前面几个必须写，我是没有意见的
		//但是，工具类每次都改，麻烦不
		//我就想，你能不能不改了
		//太简单：把所有的动物都写上。问题是名字是什么呢?到底哪些需要被加入呢?
		//改用另一种解决方案。
		
	}
	
	/*
	//调用猫的功能
	public static void useCat(Cat c) {
		c.eat();
		c.sleep();
	}
	
	//调用狗的功能
	public static void useDog(Dog d) {
		d.eat();
		d.sleep();
	}
	*/
}
