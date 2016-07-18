package com.test;

/*
 * 字符串：就是由多个字符组成的一串数据。也可以看成是一个字符数组。
 * 通过查看API，我们可以知道
 * 		A:字符串字面值"abc"也可以看成是一个字符串对象。
 * 		B:字符串是常量，一旦被赋值，就不能被改变。
 * 
 * 构造方法：
 * 		public String():空构造
 *		public String(byte[] bytes):把字节数组转成字符串
 *		public String(byte[] bytes,int index,int length):把字节数组的一部分转成字符串
 *		public String(char[] value):把字符数组转成字符串
 *		public String(char[] value,int index,int count):把字符数组的一部分转成字符串
 *		public String(String original):把字符串常量值转成字符串
 *
 * 字符串的方法：
 * 		public int length()：返回此字符串的长度。
 */
public class StringDemo {
	public static void main(String[] args) {
		// public String():空构造
		String s1 = new String();
		System.out.println("s1:" + s1); // s1 : 
		System.out.println("s1.length():" + s1.length()); // s1.length() : 0
		System.out.println("--------------------------");

		// public String(byte[] bytes):把字节数组转成字符串
		byte[] bys = { 97, 98, 99, 100, 101 };
		String s2 = new String(bys);
		System.out.println("s2 : " + s2); // s2 : abcde
		System.out.println("s2.length() : " + s2.length()); // s2.length() : 5
		System.out.println("--------------------------");

		// public String(byte[] bytes,int index,int length):把字节数组的一部分转成字符串
		// 我想得到字符串"bcd"
		String s3 = new String(bys, 1, 3);
		System.out.println("s3 : " + s3); // s3:bcd
		System.out.println("s3.length() : " + s3.length()); // s3.length():3
		System.out.println("--------------------------");

		// public String(char[] value):把字符数组转成字符串
		char[] chs = { 'a', 'b', 'c', 'd', 'e', '爱', '林', '亲' };
		String s4 = new String(chs);
		System.out.println("s4 : " + s4); // s4 : abcde爱林亲
		System.out.println("s4.length() : " + s4.length()); // s4.length() : 8
		System.out.println("--------------------------");

		// public String(char[] value,int index,int count):把字符数组的一部分转成字符串
		String s5 = new String(chs, 2, 4);
		System.out.println("s5 : " + s5); // s5 : cde爱
		System.out.println("s5.length() : " + s5.length()); // s5.length() : 4 
		System.out.println("--------------------------");
		
		//public String(String original):把字符串常量值转成字符串
		String s6 = new String("abcde");
		System.out.println("s6 : " + s6); // s6 : abcde

		System.out.println("s6.length() : " + s6.length()); // s6.length() : 5
		System.out.println("--------------------------");
		
		//字符串字面值"abc"也可以看成是一个字符串对象。
		String s7 = "abcde";
		System.out.println("s7 : "+s7); // s7 : abcde
		System.out.println("s7.length() : "+s7.length()); // s7.length() : 5
	}
}
