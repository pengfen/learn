package com.test;

/*
 * ���һ�����Ԫ��Ҫ���ܹ�������Ȼ���򣬾ͱ���ʵ����Ȼ����ӿ�
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
		// ��Ҫ���� �����ĳ���
		int num = this.name.length() - s.name.length();
		// �����ĳ�����ͬ��������������������ͬ
		int num2 = num == 0 ? this.name.compareTo(s.name) : num;
		// �����ĳ��Ⱥ�������ͬ��������������ͬ�����Ի��ü����ж�����
		int num3 = num2 == 0 ? this.age - s.age : num2;
		return num3;
	}
}