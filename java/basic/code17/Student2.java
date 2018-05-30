package com.test;

/*
 * 如果一个类的元素要想能够进行自然排序，就必须实现自然排序接口
 */
public class Student2 implements Comparable<Student2> {
	private String name;
	private int age;

	public Student2() {
		super();
	}

	public Student2(String name, int age) {
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
	public int compareTo(Student2 s) {
		// 主要条件 姓名的长度
		int num = this.name.length() - s.name.length();
		// 姓名的长度相同，不代表姓名的内容相同
		int num2 = num == 0 ? this.name.compareTo(s.name) : num;
		// 姓名的长度和内容相同，不代表年龄相同，所以还得继续判断年龄
		int num3 = num2 == 0 ? this.age - s.age : num2;
		return num3;
	}
}