package com.test;

public class Student2 {
	// ����
	private String name;
	// ����
	private int age;

	public Student2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Student2() {
		super();
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

	public void show() {
		System.out.println("������" + name + ",����:" + age);
	}
}

