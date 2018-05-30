package com.test;

/*
 * 需求：遍历获取字符串中的每一个字符
 * 
 * 分析：
 * 		A:如何能够拿到每一个字符呢?
 * 			char charAt(int index)
 * 		B:我怎么知道字符到底有多少个呢?
 * 			int length()
 */
public class StringDemo10 {
	public static void main(String[] args) {
		// 定义字符串
		String s = "helloworld";

		// 原始版本
		// System.out.println(s.charAt(0));
		// System.out.println(s.charAt(1));
		// System.out.println(s.charAt(2));
		// System.out.println(s.charAt(3));
		// System.out.println(s.charAt(4));
		// System.out.println(s.charAt(5));
		// System.out.println(s.charAt(6));
		// System.out.println(s.charAt(7));
		// System.out.println(s.charAt(8));
		// System.out.println(s.charAt(9));

		// 只需要我们从0取到9
		// for (int x = 0; x < 10; x++) {
		// System.out.println(s.charAt(x));
		// }

		// 如果长度特别长，我不可能去数，所以我们要用长度功能
		for (int x = 0; x < s.length(); x++) {
			// char ch = s.charAt(x);
			// System.out.println(ch);
			// 仅仅是输出，我就直接输出了
			System.out.println(s.charAt(x));
		}
	}
}

