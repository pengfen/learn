package com.test;

/*
 * StringBuffer��ɾ������
 * public StringBuffer deleteCharAt(int index):ɾ��ָ��λ�õ��ַ��������ر���
 * public StringBuffer delete(int start,int end):ɾ����ָ��λ�ÿ�ʼָ��λ�ý��������ݣ������ر���
 */
public class StringBufferDemo3 {
	public static void main(String[] args) {
		// ��������
		StringBuffer sb = new StringBuffer();

		// ��ӹ���
		sb.append("hello").append("world").append("java");
		System.out.println("sb:" + sb);

		// public StringBuffer deleteCharAt(int index):ɾ��ָ��λ�õ��ַ��������ر���
		// ������Ҫɾ��e����ַ�����ô��?
		// sb.deleteCharAt(1);
		// ����:��Ҫɾ����һ��l����ַ�����ô��?
		// sb.deleteCharAt(1);

		// public StringBuffer delete(int start,int
		// end):ɾ����ָ��λ�ÿ�ʼָ��λ�ý��������ݣ������ر���
		// ������Ҫɾ��world����ַ�������ô��?
		// sb.delete(5, 10);

		// ����:��Ҫɾ�����е�����
		sb.delete(0, sb.length());

		System.out.println("sb:" + sb);
	}
}