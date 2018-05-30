package com.test;

import java.util.ArrayList;
import java.util.List;

/*
 * JDK5的新特性：自动拆装箱,泛型,增强for,静态导入,可变参数,枚举
 * 
 * 增强for:是for循环的一种。
 * 
 * 格式：
 * 		for(元素数据类型 变量 : 数组或者Collection集合) {
 *			使用变量即可，该变量就是元素
 *   	}
 *   
 * 好处：简化了数组和集合的遍历。
 * 
 * 弊端： 增强for的目标不能为null。
 * 如何解决呢?对增强for的目标先进行不为null的判断，然后在使用。
 */
public class ForDemo {
	public static void main(String[] args) {
		// 定义一个int数组
		int[] arr = { 1, 2, 3, 4, 5 };
		for (int x = 0; x < arr.length; x++) {
			System.out.println(arr[x]);
		}
		System.out.println("---------------");
		// 增强for
		for (int x : arr) {
			System.out.println(x);
		}
		System.out.println("---------------");
		// 定义一个字符串数组
		String[] strArray = { "林青霞", "风清扬", "东方不败", "刘意" };
		// 增强for
		for (String s : strArray) {
			System.out.println(s);
		}
		System.out.println("---------------");
		// 定义一个集合
		ArrayList<String> array = new ArrayList<String>();
		array.add("hello");
		array.add("world");
		array.add("java");
		// 增强for
		for (String s : array) {
			System.out.println(s);
		}
		System.out.println("---------------");

		List<String> list = null;
		// NullPointerException
		// 这个s是我们从list里面获取出来的，在获取前，它肯定还好做一个判断
		// 说白了，这就是迭代器的功能
		if (list != null) {
			for (String s : list) {
				System.out.println(s);
			}
		}

		// 增强for其实是用来替代迭代器的
		//ConcurrentModificationException
		// for (String s : array) {
		// if ("world".equals(s)) {
		// array.add("javaee");
		// }
		// }
		// System.out.println("array:" + array);
	}
}
