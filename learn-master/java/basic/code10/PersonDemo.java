package com.test;
/*
形式参数：
	基本类型(太简单，不是我今天要讲解的)
	引用类型
		类名:(匿名对象的时候其实我们已经讲过了)需要的是该类的对象
		抽象类:需要的是该抽象的类子类对象
		接口
*/
abstract class Person1 {
	public abstract void study();
}

class PersonDemo {
	public void method(Person1 p) {//p; p = new Student();  Person p = new Student(); //多态
		p.study();
	}
}

//定义一个具体的学生类
class Student extends Person1 {
	public void study() {
		System.out.println("Good Good Study,Day Day Up");
	}
}

class PersonTest {
	public static void main(String[] args) {
		//目前是没有办法的使用的
		//因为抽象类没有对应的具体类
		//那么，我们就应该先定义一个具体类
		//需求：我要使用PersonDemo类中的method()方法
		PersonDemo pd = new PersonDemo();
		Person1 p = new Student();
		pd.method(p);
	}
}
