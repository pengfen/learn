package com.test;

/*
我们一直在使用构造方法，但是，我们确没有定义构造方法，用的是哪里来的呢?

构造方法的注意事项:
	A:如果我们没有给出构造方法，系统将自动提供一个无参构造方法。可以通过反编来看class文件
	B:如果我们给出了构造方法，系统将不再提供默认的无参构造方法。
		注意：这个时候，如果我们还想使用无参构造方法，就必须自己给出。建议永远自己给出无参构造方法
	
给成员变量赋值有两种方式：
	A:setXxx()
	B:构造方法
*/

class Student6 {
	private String name;
	private int age;
	
	public Student6() {
		//System.out.println("我给了，你还给不");
		System.out.println("这是无参构造方法");
	}
	
	//构造方法的重载格式
	public Student6(String name) {
		System.out.println("这是带一个String类型的构造方法");
		this.name = name;
	}
	
	public Student6(int age) {
		System.out.println("这是带一个int类型的构造方法");
		this.age = age;
	}
	
	public Student6(String name,int age) {
		System.out.println("这是一个带多个参数的构造方法");
		this.name = name;
		this.age = age;
	}
	
	public void show() {
		System.out.println(name+"---"+age);
	}
}

class ConstructDemo2 {
	public static void main(String[] args) {
		//创建对象
		Student6 s = new Student6();
		s.show();
		System.out.println("-------------");
		
		//创建对象2
		Student6 s2 = new Student6("林青霞");
		s2.show();
		System.out.println("-------------");
		
		//创建对象3
		Student6 s3 = new Student6(27);
		s3.show();
		System.out.println("-------------");
		
		//创建对象4
		Student6 s4 = new Student6("林青霞",27);
		s4.show();
	}
}
