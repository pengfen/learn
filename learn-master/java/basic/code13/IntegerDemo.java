package com.test;

/*
 * ����1����Ҫ���Ұ�100������ݵĶ����ƣ��˽��ƣ�ʮ�����Ƽ������
 * ����2����Ҫ�����ж�һ�������Ƿ���int��Χ�ڵġ�
 * 		�������֪��int�ķ�Χ�Ƕ��?
 * 
 * Ϊ�˶Ի����������ͽ��и���Ĳ�����������Ĳ�����Java�����ÿһ�ֻ������������ṩ�˶�Ӧ�������͡���װ�����͡�
 * byte 			Byte
 * short			Short
 * int				Integer
 * long				Long
 * float			Float
 * double			Double
 * char				Character
 * boolean			Boolean
 * 
 * ���ڻ��������������ַ���֮���ת����
 */
public class IntegerDemo {
	public static void main(String[] args) {
		// ���鷳�ľ�����
		// public static String toBinaryString(int i)
		System.out.println(Integer.toBinaryString(100));
		// public static String toOctalString(int i)
		System.out.println(Integer.toOctalString(100));
		// public static String toHexString(int i)
		System.out.println(Integer.toHexString(100));

		// public static final int MAX_VALUE
		System.out.println(Integer.MAX_VALUE);
		// public static final int MIN_VALUE
		System.out.println(Integer.MIN_VALUE);
	}
}