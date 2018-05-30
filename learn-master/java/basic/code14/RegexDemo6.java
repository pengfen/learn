package com.test;

/*
 * 分割功能练习
 */
public class RegexDemo6 {
	public static void main(String[] args) {
		// 定义一个字符串
		String s1 = "aa,bb,cc";
		// 直接分割
		String[] str1Array = s1.split(",");
		for (int x = 0; x < str1Array.length; x++) {
			System.out.println(str1Array[x]);
		}
		System.out.println("---------------------");

		String s2 = "aa.bb.cc";
		String[] str2Array = s2.split("\\.");
		for (int x = 0; x < str2Array.length; x++) {
			System.out.println(str2Array[x]);
		}
		System.out.println("---------------------");

		String s3 = "aa    bb                cc";
		String[] str3Array = s3.split(" +");
		for (int x = 0; x < str3Array.length; x++) {
			System.out.println(str3Array[x]);
		}
		System.out.println("---------------------");
		
		//硬盘上的路径，我们应该用\\替代\
		String s4 = "E:\\JavaSE\\day14\\avi";
		String[] str4Array = s4.split("\\\\");
		for (int x = 0; x < str4Array.length; x++) {
			System.out.println(str4Array[x]);
		}
		System.out.println("---------------------");
	}
}