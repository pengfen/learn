package com.test;

import java.util.HashMap;
import java.util.Set;

/*
 * HashMap<Student,String>
 * 键：Student
 * 		要求：如果两个对象的成员变量值都相同，则为同一个对象。
 * 值：String
 */
public class HashMapDemo4 {
	public static void main(String[] args) {
		// 创建集合对象
		HashMap<Student, String> hm = new HashMap<Student, String>();

		// 创建学生对象
		Student s1 = new Student("貂蝉", 27);
		Student s2 = new Student("王昭君", 30);
		Student s3 = new Student("西施", 33);
		Student s4 = new Student("杨玉环", 35);
		Student s5 = new Student("貂蝉", 27);

		// 添加元素
		hm.put(s1, "8888");
		hm.put(s2, "6666");
		hm.put(s3, "5555");
		hm.put(s4, "7777");
		hm.put(s5, "9999");

		// 遍历
		Set<Student> set = hm.keySet();
		for (Student key : set) {
			String value = hm.get(key);
			System.out.println(key.getName() + "---" + key.getAge() + "---"
					+ value);
		}
	}
}
