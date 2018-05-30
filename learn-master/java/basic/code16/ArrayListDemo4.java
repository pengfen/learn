package com.test;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 需求：ArrayList存储自定义对象并遍历。要求加入泛型，并用增强for遍历。
 * A:迭代器
 * B:普通for
 * C:增强for
 * 
 * LinkedList,Vector,Colleciton,List等存储我还讲吗?不讲解了，但是要求你们练习。
 * 
 * 增强for是用来替迭代器。
 */
public class ArrayListDemo4 {
	public static void main(String[] args) {
		// 创建集合对象
		ArrayList<Student> array = new ArrayList<Student>();

		// 创建学生对象
		Student s1 = new Student("林青霞", 27);
		Student s2 = new Student("貂蝉", 22);
		Student s3 = new Student("杨玉环", 24);
		Student s4 = new Student("西施", 21);
		Student s5 = new Student("王昭君", 23);

		// 把学生对象添加到集合中
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		array.add(s5);

		// 迭代器
		Iterator<Student> it = array.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}
		System.out.println("---------------");

		// 普通for
		for (int x = 0; x < array.size(); x++) {
			Student s = array.get(x);
			System.out.println(s.getName() + "---" + s.getAge());
		}
		System.out.println("---------------");

		// 增强for
		for (Student s : array) {
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}