package com.test;

/*
 * Ϊʲô����Ҫ������֮���ת����
 * A -- B��ת��
 * ���ǰ�Aת��ΪB����ʵ��Ϊ��ʹ��B�Ĺ��ܡ�
 * B -- A��ת��
 * ���ǿ���Ҫ�Ľ����A���ͣ����Ի���ת������
 * 
 * String��StringBuffer���໥ת��?
 */
public class StringBufferDemo7 {
	public static void main(String[] args) {
		// String -- StringBuffer
		String s = "hello";
		// ע�⣺���ܰ��ַ�����ֱֵ�Ӹ�ֵ��StringBuffer
		// StringBuffer sb = "hello";
		// StringBuffer sb = s;
		// ��ʽ1:ͨ�����췽��
		StringBuffer sb = new StringBuffer(s);
		// ��ʽ2��ͨ��append()����
		StringBuffer sb2 = new StringBuffer();
		sb2.append(s);
		System.out.println("sb:" + sb);
		System.out.println("sb2:" + sb2);
		System.out.println("---------------");

		// StringBuffer -- String
		StringBuffer buffer = new StringBuffer("java");
		// String(StringBuffer buffer)
		// ��ʽ1:ͨ�����췽��
		String str = new String(buffer);
		// ��ʽ2��ͨ��toString()����
		String str2 = buffer.toString();
		System.out.println("str:" + str);
		System.out.println("str2:" + str2);
	}
}
