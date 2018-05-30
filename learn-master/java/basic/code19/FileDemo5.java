package com.test;

import java.io.File;

/*
 * �жϹ���:
 * public boolean isDirectory():�ж��Ƿ���Ŀ¼
 * public boolean isFile():�ж��Ƿ����ļ�
 * public boolean exists():�ж��Ƿ����
 * public boolean canRead():�ж��Ƿ�ɶ�
 * public boolean canWrite():�ж��Ƿ��д
 * public boolean isHidden():�ж��Ƿ�����
 */
public class FileDemo5 {
	public static void main(String[] args) {
		// �����ļ�����
		File file = new File("a.txt");

		System.out.println("isDirectory:" + file.isDirectory());// false
		System.out.println("isFile:" + file.isFile());// true
		System.out.println("exists:" + file.exists());// true
		System.out.println("canRead:" + file.canRead());// true
		System.out.println("canWrite:" + file.canWrite());// true
		System.out.println("isHidden:" + file.isHidden());// false
	}
}