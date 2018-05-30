package com.test;

public class InterDemo {
	public static void main(String[] args) {
		// 第一种情况的测试
		// Inter<String> i = new InterImpl();
		// i.show("hello");

		// // 第二种情况的测试
		Inter<String> i = new InterImpl<String>();
		i.show("hello");

		Inter<Integer> ii = new InterImpl<Integer>();
		ii.show(100);
	}
}