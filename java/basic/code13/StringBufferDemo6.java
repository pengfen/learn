package com.test;

/*
 * StringBuffer的截取功能:注意返回值类型不再是StringBuffer本身了
 * public String substring(int start)
 * public String substring(int start,int end)
 */
public class StringBufferDemo6 {
	public static void main(String[] args) {
		// 创建字符串缓冲区对象
		StringBuffer sb = new StringBuffer();

		// 添加元素
		sb.append("hello").append("world").append("java");
		System.out.println("sb:" + sb);

		// 截取功能
		// public String substring(int start)
		String s = sb.substring(5);
		System.out.println("s:" + s);
		System.out.println("sb:" + sb);

		// public String substring(int start,int end)
		String ss = sb.substring(5, 10);
		System.out.println("ss:" + ss);
		System.out.println("sb:" + sb);
	}
}
