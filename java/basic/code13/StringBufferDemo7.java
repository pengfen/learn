package com.test;

/*
 * 为什么我们要讲解类之间的转换：
 * A -- B的转换
 * 我们把A转换为B，其实是为了使用B的功能。
 * B -- A的转换
 * 我们可能要的结果是A类型，所以还得转回来。
 * 
 * String和StringBuffer的相互转换?
 */
public class StringBufferDemo7 {
	public static void main(String[] args) {
		// String -- StringBuffer
		String s = "hello";
		// 注意：不能把字符串的值直接赋值给StringBuffer
		// StringBuffer sb = "hello";
		// StringBuffer sb = s;
		// 方式1:通过构造方法
		StringBuffer sb = new StringBuffer(s);
		// 方式2：通过append()方法
		StringBuffer sb2 = new StringBuffer();
		sb2.append(s);
		System.out.println("sb:" + sb);
		System.out.println("sb2:" + sb2);
		System.out.println("---------------");

		// StringBuffer -- String
		StringBuffer buffer = new StringBuffer("java");
		// String(StringBuffer buffer)
		// 方式1:通过构造方法
		String str = new String(buffer);
		// 方式2：通过toString()方法
		String str2 = buffer.toString();
		System.out.println("str:" + str);
		System.out.println("str2:" + str2);
	}
}
