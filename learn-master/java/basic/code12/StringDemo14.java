package com.test;

/*
 * String����������ܣ�
 * 
 * �滻���ܣ�
 * String replace(char old,char new)
 * String replace(String old,String new)
 *
 * ȥ���ַ������ո�	
 * String trim()
 * 
 * ���ֵ�˳��Ƚ������ַ���  
 * int compareTo(String str)
 * int compareToIgnoreCase(String str)
 */
public class StringDemo14 {
	public static void main(String[] args) {
		// �滻����
		String s1 = "helloworld";
		String s2 = s1.replace('l', 'k');
		String s3 = s1.replace("owo", "ak47");
		System.out.println("s1:" + s1);
		System.out.println("s2:" + s2);
		System.out.println("s3:" + s3);
		System.out.println("---------------");

		// ȥ���ַ������ո�
		String s4 = " hello world  ";
		String s5 = s4.trim();
		System.out.println("s4:" + s4 + "---");
		System.out.println("s5:" + s5 + "---");

		// ���ֵ�˳��Ƚ������ַ���
		String s6 = "hello";
		String s7 = "hello";
		String s8 = "abc";
		String s9 = "xyz";
		System.out.println(s6.compareTo(s7));// 0
		System.out.println(s6.compareTo(s8));// 7
		System.out.println(s6.compareTo(s9));// -16
	}
}