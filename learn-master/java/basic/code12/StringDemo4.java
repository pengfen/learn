package com.test;

/*
 * ������д���
 */
public class StringDemo4 {
	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = new String("hello");
		System.out.println(s1 == s2);// false
		System.out.println(s1.equals(s2));// true

		String s3 = new String("hello");
		String s4 = "hello";
		System.out.println(s3 == s4);// false
		System.out.println(s3.equals(s4));// true

		String s5 = "hello";
		String s6 = "hello";
		System.out.println(s5 == s6);// true
		System.out.println(s5.equals(s6));// true
	}
}
