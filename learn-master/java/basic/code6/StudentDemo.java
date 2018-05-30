package com.test;

/*
在一个java文件中写两个类：一个基本的类，一个测试类。
注意：文件名称和测试类名称一致。

如何使用呢?
	创建对象使用。
	
如何创建对象呢?
	格式：类名 对象名 = new 类名();
	
如何使用成员变量呢?
	对象名.变量名
如何使用成员方法呢?
	对象名.方法名(...)
*/
//这是学生类
class Student2 {
	//姓名
	String name; //null
	//年龄
	int age; //0
	//地址
	String address; //null
	
	//学习
	public void study() {
		System.out.println("学生爱学习");
	}
	
	//吃饭
	public void eat() {
		System.out.println("学习饿了，要吃饭");
	}
	
	//睡觉
	public void sleep() {
		System.out.println("学习累了，要睡觉");
	}
}

//这是学生测试类
class StudentDemo {
	public static void main(String[] args) {
		//类名 对象名 = new 类名();
		Student2 s = new Student2();
		
		//输出成员变量值
		//System.out.println(s.name);
		//System.out.println(s.age);
		//System.out.println(s.address);
		//改进写法
		System.out.println(s.name+"---"+s.age+"---"+s.address);
		
		
		//给成员变量赋值
		s.name = "林青霞";
		s.age = 27;
		s.address = "北京";
		//赋值后的输出
		System.out.println(s.name+"---"+s.age+"---"+s.address);
		
		//调用方法
		s.study();
		s.eat();
		s.sleep();
	}
}
