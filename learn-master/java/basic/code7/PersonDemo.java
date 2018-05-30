package com.test;

/*
定义一个人类

姓名和年龄都是变化的，这个我能接收，因为每个人的姓名和年龄是不同的。
但是，我们现在选取的几个人都是中国人，他们的国籍是一样的。
一样的国籍，我每次创建对象，在堆内存都要开辟这样的空间，
我就觉得有点浪费了。怎么办呢? 
	针对多个对象有共同的这样的成员变量值的时候，
	Java就提高了一个关键字来修饰：static。
*/
class Person {
	//姓名
	String name;
	//年龄
	int age;
	//国籍
	//String country;
	static String country;
	
	public Person(){}
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person(String name,int age,String country) {
		this.name = name;
		this.age = age;
		this.country = country;
	}
	
	public void show() {
		System.out.println("姓名："+name+",年龄："+age+",国籍："+country);
	}
}

class PersonDemo {
	public static void main(String[] args) {
		//创建对象1
		Person p1 = new Person("邓丽君",16,"中国");
		p1.show();
		
		//创建对象2
		//Person p2 = new Person("杨幂",22,"中国");
		//p2.show();
		Person p2 = new Person("杨幂",22);
		p2.show();
		
		//创建对象3
		//Person p3 = new Person("凤姐",20,"中国");
		//p3.show();
		Person p3 = new Person("凤姐",20);
		p3.show();
		
		p3.country = "美国";
		p3.show();
		
		p1.show();
		p2.show();
	}
}
