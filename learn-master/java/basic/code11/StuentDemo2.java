package com.test;

/*
 * ������
 */
public class StuentDemo2 {
	public static void main(String[] args) {
		// ��������
		Student2 s1 = new Student2();
		s1.setName("������");
		s1.setAge(30);
		System.out.println(s1.getName() + "---" + s1.getAge());
		s1.show();

		// ��������
		Student2 s2 = new Student2("����ϼ", 27);
		System.out.println(s2.getName() + "---" + s2.getAge());
		s2.show();
	}
}