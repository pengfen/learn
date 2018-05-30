package com.test;

/*
 * �����⣺
 * 1��String,StringBuffer,StringBuilder������?
 * A:String�����ݲ��ɱ�ģ���StringBuffer,StringBuilder�������ݿɱ�ġ�
 * B:StringBuffer��ͬ���ģ����ݰ�ȫ,Ч�ʵ�;StringBuilder�ǲ�ͬ����,���ݲ���ȫ,Ч�ʸ�
 * 
 * 2��StringBuffer�����������?
 * ���߶����Կ�����һ��������װ���������ݡ�
 * ������,StringBuffer������������һ���ַ������ݡ�
 * ��������Է��ö������ݣ���������ͬһ���������͵ġ�
 * 
 * 3:��ʽ��������
 * String��Ϊ��������
 * StringBuffer��Ϊ�������� 
 * 
 * ��ʽ������
 * 		�������ͣ���ʽ�����ĸı䲻Ӱ��ʵ�ʲ���
 * 		�������ͣ���ʽ�����ĸı�ֱ��Ӱ��ʵ�ʲ���
 * 
 * ע�⣺
 * 		String��Ϊ�������ݣ�Ч���ͻ���������Ϊ����������һ���ġ�
 */
public class StringBufferDemo11 {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "world";
		System.out.println(s1 + "---" + s2);// hello---world
		change(s1, s2);
		System.out.println(s1 + "---" + s2);// hello---world

		StringBuffer sb1 = new StringBuffer("hello");
		StringBuffer sb2 = new StringBuffer("world");
		System.out.println(sb1 + "---" + sb2);// hello---world
		change(sb1, sb2);
		System.out.println(sb1 + "---" + sb2);// hello---worldworld

	}

	public static void change(StringBuffer sb1, StringBuffer sb2) {
		sb1 = sb2;
		sb2.append(sb1);
	}

	public static void change(String s1, String s2) {
		s1 = s2;
		s2 = s1 + s2;
	}
}

