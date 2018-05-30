package com.test;

import java.io.File;

/*
 * ����Ҫ��ʵ��IO�Ĳ������ͱ���֪��Ӳ�����ļ��ı�����ʽ��
 * ��Java���ṩ��һ����File������ʹ�á�
 * 
 * File:�ļ���Ŀ¼(�ļ���)·�����ĳ����ʾ��ʽ
 * ���췽����
 * 		File(String pathname)������һ��·���õ�File����
 * 		File(String parent, String child):����һ��Ŀ¼��һ�����ļ�/Ŀ¼�õ�File����
 * 		File(File parent, String child):����һ����File�����һ�����ļ�/Ŀ¼�õ�File����
 */
public class FileDemo {
	public static void main(String[] args) {
		// File(String pathname)������һ��·���õ�File����
		// ��e:\\demo\\a.txt��װ��һ��File����
		File file = new File("E:\\demo\\a.txt");

		// File(String parent, String child):����һ��Ŀ¼��һ�����ļ�/Ŀ¼�õ�File����
		File file2 = new File("E:\\demo", "a.txt");

		// File(File parent, String child):����һ����File�����һ�����ļ�/Ŀ¼�õ�File����
		File file3 = new File("e:\\demo");
		File file4 = new File(file3, "a.txt");

		// �������ַ�ʽ��ʵЧ��һ��
	}
}