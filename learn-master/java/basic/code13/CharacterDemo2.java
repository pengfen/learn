package com.test;

/*
 * public static boolean isUpperCase(char ch):�жϸ������ַ��Ƿ��Ǵ�д�ַ�
 * public static boolean isLowerCase(char ch):�жϸ������ַ��Ƿ���Сд�ַ�
 * public static boolean isDigit(char ch):�жϸ������ַ��Ƿ��������ַ�
 * public static char toUpperCase(char ch):�Ѹ������ַ�ת��Ϊ��д�ַ�
 * public static char toLowerCase(char ch):�Ѹ������ַ�ת��ΪСд�ַ�
 */
public class CharacterDemo2 {
	public static void main(String[] args) {
		// public static boolean isUpperCase(char ch):�жϸ������ַ��Ƿ��Ǵ�д�ַ�
		System.out.println("isUpperCase:" + Character.isUpperCase('A'));
		System.out.println("isUpperCase:" + Character.isUpperCase('a'));
		System.out.println("isUpperCase:" + Character.isUpperCase('0'));
		System.out.println("-----------------------------------------");
		// public static boolean isLowerCase(char ch):�жϸ������ַ��Ƿ���Сд�ַ�
		System.out.println("isLowerCase:" + Character.isLowerCase('A'));
		System.out.println("isLowerCase:" + Character.isLowerCase('a'));
		System.out.println("isLowerCase:" + Character.isLowerCase('0'));
		System.out.println("-----------------------------------------");
		// public static boolean isDigit(char ch):�жϸ������ַ��Ƿ��������ַ�
		System.out.println("isDigit:" + Character.isDigit('A'));
		System.out.println("isDigit:" + Character.isDigit('a'));
		System.out.println("isDigit:" + Character.isDigit('0'));
		System.out.println("-----------------------------------------");
		// public static char toUpperCase(char ch):�Ѹ������ַ�ת��Ϊ��д�ַ�
		System.out.println("toUpperCase:" + Character.toUpperCase('A'));
		System.out.println("toUpperCase:" + Character.toUpperCase('a'));
		System.out.println("-----------------------------------------");
		// public static char toLowerCase(char ch):�Ѹ������ַ�ת��ΪСд�ַ�
		System.out.println("toLowerCase:" + Character.toLowerCase('A'));
		System.out.println("toLowerCase:" + Character.toLowerCase('a'));
	}
}
