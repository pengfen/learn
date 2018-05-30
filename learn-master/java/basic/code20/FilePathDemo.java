package com.test;

import java.io.File;

/*
 * �������Ұ�E:\JavaSEĿ¼�����е�java��β���ļ��ľ���·��������ڿ���̨��
 * 
 * ������
 * 		A:��װĿ¼
 * 		B:��ȡ��Ŀ¼�����е��ļ������ļ��е�File����
 * 		C:������File���飬�õ�ÿһ��File����
 * 		D:�жϸ�File�����Ƿ����ļ���
 * 			�ǣ��ص�B
 * 			�񣺼����ж��Ƿ���.java��β
 * 				�ǣ���������ļ��ľ���·��
 * 				�񣺲�������
 */
public class FilePathDemo {
	public static void main(String[] args) {
		// ��װĿ¼
		File srcFolder = new File("E:\\JavaSE");

		// �ݹ鹦��ʵ��
		getAllJavaFilePaths(srcFolder);
	}

	private static void getAllJavaFilePaths(File srcFolder) {
		// ��ȡ��Ŀ¼�����е��ļ������ļ��е�File����
		File[] fileArray = srcFolder.listFiles();

		// ������File���飬�õ�ÿһ��File����
		for (File file : fileArray) {
			// �жϸ�File�����Ƿ����ļ���
			if (file.isDirectory()) {
				getAllJavaFilePaths(file);
			} else {
				// �����ж��Ƿ���.java��β
				if (file.getName().endsWith(".java")) {
					// ��������ļ��ľ���·��
					System.out.println(file.getAbsolutePath());
				}
			}
		}
	}
}