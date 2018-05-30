package com.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * �ַ���Ϊ�˸�Ч��д��Ҳ�ṩ�˶�Ӧ���ַ���������
 * BufferedWriter:�ַ����������
 * BufferedReader:�ַ�����������
 * 
 * BufferedWriter:�ַ����������
 * ���ı�д���ַ����������������ַ����Ӷ��ṩ�����ַ���������ַ����ĸ�Чд�롣 
 * ����ָ���������Ĵ�С�����߽���Ĭ�ϵĴ�С���ڴ��������£�Ĭ��ֵ���㹻���ˡ� 
 */
public class BufferedWriterDemo {
	public static void main(String[] args) throws IOException {
		// BufferedWriter(Writer out)
		// BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
		// new FileOutputStream("bw.txt")));

		BufferedWriter bw = new BufferedWriter(new FileWriter("bw.txt"));

		bw.write("hello");
		bw.write("world");
		bw.write("java");
		bw.flush();

		bw.close();
	}
}
