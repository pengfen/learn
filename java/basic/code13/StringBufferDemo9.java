package com.test;

import java.util.Scanner;

/*
 * 把字符串反转
 */
public class StringBufferDemo9 {
	public static void main(String[] args) {
		// 键盘录入数据
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数据：");
		String s = sc.nextLine();

		// 方式1：用String做拼接
		String s1 = myReverse(s);
		System.out.println("s1:" + s1);
		// 方式2：用StringBuffer的reverse()功能
		String s2 = myReverse2(s);
		System.out.println("s2:" + s2);
	}

	// 用StringBuffer的reverse()功能
	public static String myReverse2(String s) {
		// StringBuffer sb = new StringBuffer();
		// sb.append(s);

		// StringBuffer sb = new StringBuffer(s);
		// sb.reverse();
		// return sb.toString();

		// 简易版
		return new StringBuffer(s).reverse().toString();
	}

	// 用String做拼接
	public static String myReverse(String s) {
		String result = "";

		char[] chs = s.toCharArray();
		for (int x = chs.length - 1; x >= 0; x--) {
			// char ch = chs[x];
			// result += ch;
			result += chs[x];
		}

		return result;
	}
}