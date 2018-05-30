package com.test;

/*
 * StringBuffer����ӹ��ܣ�
 * public StringBuffer append(String str):���԰���������������ӵ��ַ�������������,�������ַ�������������
 * 
 * public StringBuffer insert(int offset,String str):��ָ��λ�ð��������͵����ݲ��뵽�ַ�������������,�������ַ�������������
 */
public class StringBufferDemo2 {
	public static void main(String[] args) {
		// �����ַ�������������
		StringBuffer sb = new StringBuffer();

		// public StringBuffer append(String str)
		// StringBuffer sb2 = sb.append("hello");
		// System.out.println("sb:" + sb);
		// System.out.println("sb2:" + sb2);
		// System.out.println(sb == sb2); // true

		// һ��һ�����������
		// sb.append("hello");
		// sb.append(true);
		// sb.append(12);
		// sb.append(34.56);

		// ��ʽ���
		sb.append("hello").append(true).append(12).append(34.56);
		System.out.println("sb:" + sb);

		// public StringBuffer insert(int offset,String
		// str):��ָ��λ�ð��������͵����ݲ��뵽�ַ�������������,�������ַ�������������
		sb.insert(5, "world");
		System.out.println("sb:" + sb);
	}
}
