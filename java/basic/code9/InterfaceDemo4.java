package com.test;
/*
猫狗案例,加入跳高的额外功能

分析：从具体到抽象
	猫：
		姓名,年龄
		吃饭，睡觉
	狗：
		姓名,年龄
		吃饭，睡觉
		
	由于有共性功能，所以，我们抽取出一个父类：
	动物：
		姓名,年龄
		吃饭();
		睡觉(){}
		
	猫：继承自动物
	狗：继承自动物
	
	跳高的额外功能是一个新的扩展功能，所以我们要定义一个接口
	接口：
		跳高
		
	部分猫：实现跳高
	部分狗：实现跳高
实现；
	从抽象到具体
	
使用：
	使用具体类
*/
//定义跳高接口
interface Jumpping {
	//跳高功能
	public abstract void jump();
	}
	
	//定义抽象类
	abstract class Animal24 {
	//姓名
	private String name;
	//年龄
	private int age;
	
	public Animal24() {}
	
	public Animal24(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	//吃饭();
	public abstract void eat();
	
	//睡觉(){}
	public void sleep() {
		System.out.println("睡觉觉了");
	}
}

//具体猫类
class Cat24 extends Animal24 {
	public Cat24(){}
	
	public Cat24(String name,int age) {
		super(name,age);
	}
	
	public void eat() {
		System.out.println("猫吃鱼");
	}
}

//具体狗类
class Dog24 extends Animal24 {
	public Dog24(){}
	
	public Dog24(String name,int age) {
		super(name,age);
	}
	
	public void eat() {
		System.out.println("狗吃肉");
	}
}

//有跳高功能的猫
class JumpCat extends Cat24 implements Jumpping {
	public JumpCat() {}
	
	public JumpCat(String name,int age) {
		super(name,age);
	}
	
	public void jump() {
		System.out.println("跳高猫");
	}
}

//有跳高功能的狗
class JumpDog extends Dog24 implements Jumpping {
	public JumpDog() {}
	
	public JumpDog(String name,int age) {
		super(name,age);
	}
	
	public void jump() {
		System.out.println("跳高狗");
	}
}

class InterfaceTest {
	public static void main(String[] args) {
		//定义跳高猫并测试
		JumpCat jc = new JumpCat();
		jc.setName("哆啦A梦");
		jc.setAge(3);
		System.out.println(jc.getName()+"---"+jc.getAge());
		jc.eat();
		jc.sleep();
		jc.jump();
		System.out.println("-----------------");
		
		JumpCat jc2 = new JumpCat("加菲猫",2);
		System.out.println(jc2.getName()+"---"+jc2.getAge());
		jc2.eat();
		jc2.sleep();
		jc2.jump();
		
		//定义跳高狗并进行测试的事情自己完成。
	}
}
