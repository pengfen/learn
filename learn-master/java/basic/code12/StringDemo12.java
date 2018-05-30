package com.test;

/*
 * String的转换功能：
 * byte[] getBytes():把字符串转换为字节数组。
 * char[] toCharArray():把字符串转换为字符数组。
 * static String valueOf(char[] chs):把字符数组转成字符串。
 * static String valueOf(int i):把int类型的数据转成字符串。
 * 		注意：String类的valueOf方法可以把任意类型的数据转成字符串。
 * String toLowerCase():把字符串转成小写。
 * String toUpperCase():把字符串转成大写。
 * String concat(String str):把字符串拼接。
 */
public class StringDemo12 {
	public static void main(String[] args) {
		// 定义一个字符串对象
		String s = "JavaSE";

		// byte[] getBytes():把字符串转换为字节数组。
		byte[] bys = s.getBytes();
		for (int x = 0; x < bys.length; x++) {
			System.out.println(bys[x]);
		}
		System.out.println("----------------");

		// char[] toCharArray():把字符串转换为字符数组。
		char[] chs = s.toCharArray();
		for (int x = 0; x < chs.length; x++) {
			System.out.println(chs[x]);
		}
		System.out.println("----------------");

		// static String valueOf(char[] chs):把字符数组转成字符串。
		String ss = String.valueOf(chs);
		System.out.println(ss);
		System.out.println("----------------");

		// static String valueOf(int i):把int类型的数据转成字符串。
		int i = 100;
		String sss = String.valueOf(i);
		System.out.println(sss);
		System.out.println("----------------");

		// String toLowerCase():把字符串转成小写。
		System.out.println("toLowerCase:" + s.toLowerCase());
		System.out.println("s:" + s);
		// System.out.println("----------------");
		// String toUpperCase():把字符串转成大写。
		System.out.println("toUpperCase:" + s.toUpperCase());
		System.out.println("----------------");

		// String concat(String str):把字符串拼接。
		String s1 = "hello";
		String s2 = "world";
		String s3 = s1 + s2;
		String s4 = s1.concat(s2);
		System.out.println("s3:"+s3);
		System.out.println("s4:"+s4);
	}
}
