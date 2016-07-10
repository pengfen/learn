package com.test;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ArrayList存储字符串并遍历。要求加入泛型，并用增强for遍历。
 * A:迭代器
 * B:普通for
 * C:增强for
 */
public class ArrayListDemo3 {
	public static void main(String[] args) {
		// 创建集合对象
		ArrayList<String> array = new ArrayList<String>();

		// 创建并添加元素
		array.add("hello");
		array.add("world");
		array.add("java");

		// 遍历集合
		// 迭代器
		Iterator<String> it = array.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
		System.out.println("------------------");

		// 普通for
		for (int x = 0; x < array.size(); x++) {
			String s = array.get(x);
			System.out.println(s);
		}
		System.out.println("------------------");

		// 增强for
		for (String s : array) {
			System.out.println(s);
		}
	}
}