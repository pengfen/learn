package com.test;

/*
返回值类型
	基本类型:(基本类型太简单，我不准备讲解)
	引用类型：
		类:返回的是该类的对象
		抽象类:返回的是该抽象类的子类对象
		接口:
*/
abstract class Person2 {
	public abstract void study();
}

class PersonDemo2 {
	public Person2 getPerson() {
		//Person p = new Student();
		//return p;
		
		return new Student2();
	}
}

class Student2 extends Person2 {
	public void study() {
		System.out.println("Good Good Study,Day Day Up");
	}
}

class PersonTest2 {
	public static void main(String[] args) {
		//需求：我要测试Person类中的study()方法
		PersonDemo2 pd = new PersonDemo2();
		Person2 p = pd.getPerson(); //new Student();  Person p = new Student(); 多态
		p.study();
	}
}
