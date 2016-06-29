package com.test;
/*
封装和private的应用：
	A:把成员变量用private修饰
	B:提高对应的getXxx()和setXxx()方法
*/
//定义学生类
class Student3 {
	//姓名
	private String name;
	//年龄
	private int age;
	
	//姓名获取值
	public String getName() {
		return name;
	}
	
	//姓名设置值
	public void setName(String n) {
		name = n;
	}
	
	//年龄获取值
	public int getAge() {
		return age;
	}
	
	//年龄赋值
	public void setAge(int a) {
		age = a;
	}
}

//测试类
class StudentDemo3 {
	public static void main(String[] args) {
		//创建学生对象
		Student3 s = new Student3();
		
		//使用成员变量
		//错误：被私有修饰了，外界不能直接访问了
		//System.out.println(s.name+"---"+s.age);
		System.out.println(s.getName()+"---"+s.getAge()); // null 0
		
		//给成员变量赋值
		//s.name = "林青霞";
		//s.age = 27;
		//通过方法给赋值
		s.setName("林青霞");
		s.setAge(27);
		System.out.println(s.getName()+"---"+s.getAge());
	}
}
