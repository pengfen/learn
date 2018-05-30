package com.test;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

/*
 * TreeMap<Student,String>
 * 键:Student
 * 值：String
 */
public class TreeMapDemo2 {
	public static void main(String[] args) {
		// 创建集合对象
		TreeMap<Student, String> tm = new TreeMap<Student, String>(
				new Comparator<Student>() {
					@Override
					public int compare(Student s1, Student s2) {
						// 主要条件
						int num = s1.getAge() - s2.getAge();
						// 次要条件
						int num2 = num == 0 ? s1.getName().compareTo(
								s2.getName()) : num;
						return num2;
					}
				});

		// 创建学生对象
		Student s1 = new Student("潘安", 30);
		Student s2 = new Student("柳下惠", 35);
		Student s3 = new Student("唐伯虎", 33);
		Student s4 = new Student("燕青", 32);
		Student s5 = new Student("唐伯虎", 33);

		// 存储元素
		tm.put(s1, "宋朝");
		tm.put(s2, "元朝");
		tm.put(s3, "明朝");
		tm.put(s4, "清朝");
		tm.put(s5, "汉朝");

		// 遍历
		Set<Student> set = tm.keySet();
		for (Student key : set) {
			String value = tm.get(key);
			System.out.println(key.getName() + "---" + key.getAge() + "---"
					+ value);
		}
	}
}
