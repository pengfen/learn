package com.test;

import java.io.File;

/*
 * ����������:public boolean renameTo(File dest)
 * 		���·������ͬ�����Ǹ�����
 * 		���·������ͬ�����Ǹ��������С�
 * 
 * ·�����̷���ʼ������·��	c:\\a.txt
 * ·�������̷���ʼ�����·��	a.txt
 */
public class FileDemo4 {
	public static void main(String[] args) {
		// ����һ���ļ�����
		// File file = new File("����ϼ.jpg");
		// // ������Ҫ�޸�����ļ�������Ϊ"��������.jpg"
		// File newFile = new File("��������.jpg");
		// System.out.println("renameTo:" + file.renameTo(newFile));

		File file2 = new File("��������.jpg");
		File newFile2 = new File("e:\\����ϼ.jpg");
		System.out.println("renameTo:" + file2.renameTo(newFile2));
	}
}