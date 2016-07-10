package com.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 练习：用集合存储5个学生对象，并把学生对象进行遍历。用迭代器遍历。
 * 
 * 注意：
 * 		A:自己的类名不要和我们学习的要使用的API中的类名相同。
 * 		B:复制代码的时候，很容易把那个类所在的包也导入过来，容易出现不能理解的问题。
 */
public class IteratorDemo2 {
	public static void main(String[] args) {
		// 创建集合对象
		Collection c = new ArrayList();

		// 创建学生对象
		Student s1 = new Student("林青霞", 27);
		Student s2 = new Student("风清扬", 30);
		Student s3 = new Student("令狐冲", 33);
		Student s4 = new Student("武鑫", 25);
		Student s5 = new Student("刘晓曲", 22);

		// 把学生添加到集合中
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);

		// 遍历
		Iterator it = c.iterator();
		while (it.hasNext()) {
			// System.out.println(it.next());
			Student s = (Student) it.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}