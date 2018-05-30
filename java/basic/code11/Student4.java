package com.test;

public class Student4 {
	private String name;
	private int age;

	public Student4() {
		super();
	}

	public Student4(String name, int age) {
		super();
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

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	// @Override
	// public String toString() {
	// // return super.toString();
	// // return "hello";
	// return "ĞÕÃû:" + name + ",ÄêÁä:" + age;
	// }
	
	
}
