package com.java;

public class TestObject {
	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
		System.out.println(o1.equals(o2));
		System.out.println(o1.hashCode() + "," + o2.hashCode());
		
		Student s1 = new Student();
		s1.setName("peng");
		s1.setSex("男");
		s1.setAge(18);
		
		System.out.println(s1);
		
		try {
			Student s2 = s1.clone();
			System.out.println(s2);
			System.out.println(s1 == s2); // false 二个对象
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}
}

class Student implements Cloneable {
	private String name;
	private String sex;
	private int age;
	
	public Student clone() throws CloneNotSupportedException {
		return (Student) super.clone();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return "Student [name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}
	
	
}
