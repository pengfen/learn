package com.test;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * �ֽ��������������裺
 * A:�����ֽ�����������
 * B:����read()������ȡ���ݣ�����������ʾ�ڿ���̨
 * C:�ͷ���Դ
 * 
 * ��ȡ���ݵķ�ʽ��
 * A:int read():һ�ζ�ȡһ���ֽ�
 * B:int read(byte[] b):һ�ζ�ȡһ���ֽ�����
 */
public class FileInputStreamDemo2 {
	public static void main(String[] args) throws IOException {
		// FileInputStream(String name)
		// FileInputStream fis = new FileInputStream("fis.txt");
		FileInputStream fis = new FileInputStream("FileOutputStreamDemo.java");

		// // ����read()������ȡ���ݣ�����������ʾ�ڿ���̨
		// // ��һ�ζ�ȡ
		// int by = fis.read();
		// System.out.println(by);
		// System.out.println((char) by);
		//
		// // �ڶ��ζ�ȡ
		// by = fis.read();
		// System.out.println(by);
		// System.out.println((char) by);
		//
		// // �����ζ�ȡ
		// by = fis.read();
		// System.out.println(by);
		// System.out.println((char) by);
		// // ���Ƿ��ִ�����ظ��Ⱥܸߣ���������Ҫ��ѭ���Ľ�
		// // ����ѭ�������鷳����������ο���ѭ���ж�������?
		// // ���Ĵζ�ȡ
		// by = fis.read();
		// System.out.println(by);
		// // ����ζ�ȡ
		// by = fis.read();
		// System.out.println(by);
		// //ͨ�����ԣ�����֪��������ȡ��������-1����˵���Ѿ���ȡ���ļ���ĩβ��

		// ��ѭ���Ľ�
		// int by = fis.read();
		// while (by != -1) {
		// System.out.print((char) by);
		// by = fis.read();
		// }

		// ���հ����
		int by = 0;
		// ��ȡ����ֵ���ж�
		while ((by = fis.read()) != -1) {
			System.out.print((char) by);
		}

		// �ͷ���Դ
		fis.close();
	}
}