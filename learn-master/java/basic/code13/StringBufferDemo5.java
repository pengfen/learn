package com.test;

/*
 * StringBuffer�ķ�ת���ܣ�
 * public StringBuffer reverse()
 */
public class StringBufferDemo5 {
	public static void main(String[] args) {
		// �����ַ�������������
		StringBuffer sb = new StringBuffer();

		// �������
		sb.append("ϼ���ְ���");
		System.out.println("sb:" + sb);

		// public StringBuffer reverse()
		sb.reverse();
		System.out.println("sb:" + sb);
	}
}