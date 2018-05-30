package com.test;

import java.util.LinkedHashSet;

/*
 * LinkedHashSet:底层数据结构由哈希表和链表组成。
 * 哈希表保证元素的唯一性。
 * 链表保证元素有素。(存储和取出是一致)
 */
public class LinkedHashSetDemo {
	public static void main(String[] args) {
		// 创建集合对象
		LinkedHashSet<String> hs = new LinkedHashSet<String>();

		// 创建并添加元素
		hs.add("hello");
		hs.add("world");
		hs.add("java");
		hs.add("world");
		hs.add("java");

		// 遍历
		for (String s : hs) {
			System.out.println(s);
		}
	}
}