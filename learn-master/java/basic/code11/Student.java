package com.test;
/*
 * йсм╪ ...
 */
public class Student {
	private String name;
	private int age;

	public int num = 10;
	public final int num22 = 20;
	public static int num3 = 30;
	public static final int num4 = 40;

	public Student() {
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}
}