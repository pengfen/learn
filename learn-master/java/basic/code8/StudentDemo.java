package com.test;
/*
写程序的执行结果。

林青霞都60了，我很伤心
我是main方法
Student 静态代码块
Student 构造代码块
Student 构造方法
Student 构造代码块
Student 构造方法
*/
class Student {
	static {
		System.out.println("Student 静态代码块");
	}
	
	{
		System.out.println("Student 构造代码块");
	}
	
	public Student() {
		System.out.println("Student 构造方法");
	}
	}
	
class StudentDemo {
	static {
		System.out.println("先执行static方法 再执行main方法");
	}
	
	public static void main(String[] args) {
		System.out.println("我是main方法");
		
		Student s1 = new Student();
		Student s2 = new Student();
	}
}
