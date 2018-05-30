package com.test;

/*
 * MyStack的测试
 */
public class MyStackDemo {
	public static void main(String[] args) {
		// 创建集合对象
		MyStack ms = new MyStack();

		// 添加元素
		ms.add("hello");
		ms.add("world");
		ms.add("java");

		// System.out.println(ms.get());
		// System.out.println(ms.get());
		// System.out.println(ms.get());
		// NoSuchElementException
		// System.out.println(ms.get());
		
		while(!ms.isEmpty()){
			System.out.println(ms.get());
		}
	}
}