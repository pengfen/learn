package com.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 需求：存储自定义对象并遍历Student(name,age)
 *
 * 分析：
 * 		A:创建学生类
 * 		B:创建集合对象
 * 		C:创建学生对象
 * 		D:把学生对象添加到集合对象中
 * 		E:遍历集合
 */
public class CollectionDemo5 {
	public static void main(String[] args) {
		// 创建集合对象
		Collection c = new ArrayList();

		// 创建学生对象
		Student s1 = new Student("貂蝉", 25);
		Student s2 = new Student("小乔", 16);
		Student s3 = new Student("黄月英", 20);
		Student s4 = new Student();
		s4.setName("大乔");
		s4.setAge(26);

		// 把学生对象添加到集合对象中
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(new Student("孙尚香", 18)); // 匿名对象

		// 遍历集合
		Iterator it = c.iterator();
		while (it.hasNext()) {
			Student s = (Student) it.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}