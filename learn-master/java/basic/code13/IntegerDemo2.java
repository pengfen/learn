package com.test;

/*
 * Integer�Ĺ��췽����
 * public Integer(int value)
 * public Integer(String s)
 * 		ע�⣺����ַ����������������ַ����
 */
public class IntegerDemo2 {
	public static void main(String[] args) {
		// ��ʽ1
		int i = 100;
		Integer ii = new Integer(i);
		System.out.println("ii:" + ii);

		// ��ʽ2
		String s = "100";
		// NumberFormatException
		// String s = "abc";
		Integer iii = new Integer(s);
		System.out.println("iii:" + iii);
	}
}

