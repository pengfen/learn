package com.test;

/*
 * String����жϹ��ܣ�
 * boolean equals(Object obj):�Ƚ��ַ����������Ƿ���ͬ,���ִ�Сд
 * boolean equalsIgnoreCase(String str):�Ƚ��ַ����������Ƿ���ͬ,���Դ�Сд
 * boolean contains(String str):�жϴ��ַ������Ƿ����С�ַ���
 * boolean startsWith(String str):�ж��ַ����Ƿ���ĳ��ָ�����ַ�����ͷ
 * boolean endsWith(String str):�ж��ַ����Ƿ���ĳ��ָ�����ַ�����β
 * boolean isEmpty():�ж��ַ����Ƿ�Ϊ�ա�
 * 
 * ע�⣺
 * 		�ַ�������Ϊ�պ��ַ�������Ϊ�ա�
 * 		String s = "";
 * 		String s = null;
 */
public class StringDemo6 {
	public static void main(String[] args) {
		// �����ַ�������
		String s1 = "helloworld";
		String s2 = "helloworld";
		String s3 = "HelloWorld";

		// boolean equals(Object obj):�Ƚ��ַ����������Ƿ���ͬ,���ִ�Сд
		System.out.println("equals:" + s1.equals(s2));
		System.out.println("equals:" + s1.equals(s3));
		System.out.println("-----------------------");

		// boolean equalsIgnoreCase(String str):�Ƚ��ַ����������Ƿ���ͬ,���Դ�Сд
		System.out.println("equals:" + s1.equalsIgnoreCase(s2));
		System.out.println("equals:" + s1.equalsIgnoreCase(s3));
		System.out.println("-----------------------");

		// boolean contains(String str):�жϴ��ַ������Ƿ����С�ַ���
		System.out.println("contains:" + s1.contains("hello"));
		System.out.println("contains:" + s1.contains("hw"));
		System.out.println("-----------------------");

		// boolean startsWith(String str):�ж��ַ����Ƿ���ĳ��ָ�����ַ�����ͷ
		System.out.println("startsWith:" + s1.startsWith("h"));
		System.out.println("startsWith:" + s1.startsWith("hello"));
		System.out.println("startsWith:" + s1.startsWith("world"));
		System.out.println("-----------------------");

		// ��ϰ��boolean endsWith(String str):�ж��ַ����Ƿ���ĳ��ָ�����ַ�����β����Լ���

		// boolean isEmpty():�ж��ַ����Ƿ�Ϊ�ա�
		System.out.println("isEmpty:" + s1.isEmpty());

		String s4 = "";
		String s5 = null;
		System.out.println("isEmpty:" + s4.isEmpty());
		// NullPointerException
		// s5���󶼲����ڣ����Բ��ܵ��÷�������ָ���쳣
		System.out.println("isEmpty:" + s5.isEmpty());
	}
}

