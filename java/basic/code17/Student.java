package com.test;

/**
 * @author Administrator
 * 
 */
/*
 * 如果一个类的元素要想能够进行自然排序，就必须实现自然排序接口
 */
public class Student implements Comparable<Student> {
	private String name;
	private int age;

	public Student() {
		super();
	}

	public Student(String name, int age) {
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	// @Override
	// public int hashCode() {
	// // return 0;
	// // 因为成员变量值影响了哈希值，所以我们把成员变量值相加即可
	// // return this.name.hashCode() + this.age;
	// // 看下面
	// // s1:name.hashCode()=40,age=30
	// // s2:name.hashCode()=20,age=50
	// // 尽可能的区分,我们可以把它们乘以一些整数
	// return this.name.hashCode() + this.age * 15;
	// }
	//
	// @Override
	// public boolean equals(Object obj) {
	// // System.out.println(this + "---" + obj);
	// if (this == obj) {
	// return true;
	// }
	//
	// if (!(obj instanceof Student)) {
	// return false;
	// }
	//
	// Student s = (Student) obj;
	// return this.name.equals(s.name) && this.age == s.age;
	// }
	//
	// @Override
	// public String toString() {
	// return "Student [name=" + name + ", age=" + age + "]";
	// }
	
	@Override
	public int compareTo(Student s) {
		// return 0;
		// return 1;
		// return -1;

		// 这里返回什么，其实应该根据我的排序规则来做
		// 按照年龄排序,主要条件
		int num = this.age - s.age;
		// 次要条件
		// 年龄相同的时候，还得去看姓名是否也相同
		// 如果年龄和姓名都相同，才是同一个元素
		int num2 = num == 0 ? this.name.compareTo(s.name) : num;
		return num2;
	}

}