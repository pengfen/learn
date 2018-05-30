package com.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * 需求：List集合存储字符串并遍历。
 */
public class ListDemo {
	public static void main(String[] args) {
		// 创建集合对象
		List list = new ArrayList();

		// 创建字符串并添加字符串
		list.add("hello");
		list.add("world");
		list.add("java");

		// 遍历集合
		Iterator it = list.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}
	}
}
