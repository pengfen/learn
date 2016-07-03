package com.test;

/*
学生案例
	具体事务：基础班学员，就业班学员
	共性：姓名，年龄，班级，学习，吃饭

分析：
	基础班学员
		成员变量：姓名，年龄，班级
		成员方法：学习，吃饭
	就业班学员
		成员变量：姓名，年龄，班级
		成员方法：学习，吃饭
		
	得到一个学员类。
		成员变量：姓名，年龄，班级
		成员方法：学习，吃饭
		
实现：
	学员类
	基础班学员
	就业班学员
*/
//定义抽象学员类
abstract class Student5 {
	//姓名
	private String name;
	//年龄
	private int age;
	//班级
	private String grand;
	
	public Student5() {}
	
	public Student5(String name,int age,String grand) {
		this.name = name;
		this.age = age;
		this.grand = grand;
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
	
	public String getGrand() {
		return grand;
	}
	
	public void setGrand(String grand) {
		this.grand = grand;
	}
	
	//学习
	public abstract void study();
	
	//吃饭
	public void eat() {
		System.out.println("学习累了,就该吃饭");
	}
}

//具体基础班学员类
class BasicStudent extends Student5 {
	public BasicStudent() {}
	
	public BasicStudent(String name,int age,String grand) {
		super(name,age,grand);
	}
	
	public void study() {
		System.out.println("基础班学员学习的是JavaSE");
	}
}

//具体就业班学员类
class WorkStudent extends Student5 {
	public WorkStudent() {}
	
	public WorkStudent(String name,int age,String grand) {
		super(name,age,grand);
	}
	
	public void study() {
		System.out.println("就业班学员学习的是JavaEE");
	}
}

class AbstractTest3 {
	public static void main(String[] args) {
		//我仅仅测试基础班学员
		//按照多态的方式测试
		Student5 s = new BasicStudent();
		s.setName("林青霞");
		s.setAge(27);
		s.setGrand("1111");
		System.out.println(s.getName()+"---"+s.getAge()+"---"+s.getGrand());
		s.study();
		s.eat();
		System.out.println("--------------");
		
		s = new BasicStudent("武鑫",48,"1111");
		System.out.println(s.getName()+"---"+s.getAge()+"---"+s.getGrand());
		s.study();
		s.eat();
		
		//就业班测试留给自己玩
	}
}