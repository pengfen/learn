package com.test;

/*
老师案例
	具体事物：基础班老师，就业班老师
	共性：姓名，年龄，讲课。

分析：	
	基础班老师
		姓名，年龄
		讲课。
	就业班老师
		姓名，年龄
		讲课。
实现：
	老师类
		基础班老师
		就业班老师
*/
//定义抽象的老师类
abstract class Teacher {
	//姓名
	private String name;
	//年龄
	private int age;
	
	public Teacher() {}
	
	public Teacher(String name,int age) {
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
	
	//抽象方法
	public abstract void teach();
}

//基础班老师类
class BasicTeacher extends Teacher {
	public BasicTeacher(){}
	
	public BasicTeacher(String name,int age) {
		super(name,age);
	}
	
	public void teach() {
		System.out.println("基础班老师讲解JavaSE");
	}
}

//就业班老师类
class WorkTeacher extends Teacher {
	public WorkTeacher(){}
	
	public WorkTeacher(String name,int age) {
		super(name,age);
	}
	
	public void teach() {
		System.out.println("就业班老师讲解JavaEE");
	}
}

class AbstractTest2 {
	public static void main(String[] args) {
		//具体的类测试，自己玩
		
		//测试(多态)
		//基础班老师
		Teacher t = new BasicTeacher();
		t.setName("刘意");
		t.setAge(30);
		System.out.println(t.getName()+"---"+t.getAge());
		t.teach();
		System.out.println("--------------");
		
		t = new BasicTeacher("刘意",30);
		System.out.println(t.getName()+"---"+t.getAge());
		t.teach();
		System.out.println("--------------");
		
		//就业班老师
		t = new WorkTeacher();
		t.setName("林青霞");
		t.setAge(27);
		System.out.println(t.getName()+"---"+t.getAge());
		t.teach();
		System.out.println("--------------");
		
		t = new WorkTeacher("林青霞",27);
		System.out.println(t.getName()+"---"+t.getAge());
		t.teach();
	}
}
