package com.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * List集合的特点：
 * 		有序(存储和取出的元素一致)，可重复的。
 */
public class ListDemo2 {
	public static void main(String[] args) {
		// 创建集合对象
		List list = new ArrayList();

		// 存储元素
		list.add("hello");
		list.add("world");
		list.add("java");
		list.add("javaee");
		list.add("android");
		list.add("javaee");
		list.add("android");

		// 遍历集合
		Iterator it = list.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}
	}
}
