package com.test;

import java.io.File;

/*
 * ��ȡ���ܣ�
 * public String[] list():��ȡָ��Ŀ¼�µ������ļ������ļ��е���������
 * public File[] listFiles():��ȡָ��Ŀ¼�µ������ļ������ļ��е�File����
 */
public class FileDemo7 {
	public static void main(String[] args) {
		// ָ��һ��Ŀ¼
		File file = new File("e:\\");

		// public String[] list():��ȡָ��Ŀ¼�µ������ļ������ļ��е���������
		String[] strArray = file.list();
		for (String s : strArray) {
			System.out.println(s);
		}
		System.out.println("------------");

		// public File[] listFiles():��ȡָ��Ŀ¼�µ������ļ������ļ��е�File����
		File[] fileArray = file.listFiles();
		for (File f : fileArray) {
			System.out.println(f.getName());
		}
	}
}
