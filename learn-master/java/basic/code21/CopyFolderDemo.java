package com.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ���󣺸��Ƶ����ļ���
 * 
 * ����Դ��e:\\demo
 * Ŀ�ĵأ�e:\\test
 * 
 * ������
 * 		A:��װĿ¼
 * 		B:��ȡ��Ŀ¼�µ������ı���File����
 * 		C:������File���飬�õ�ÿһ��File����
 * 		D:�Ѹ�File���и���
 */
public class CopyFolderDemo {
	public static void main(String[] args) throws IOException {
		// ��װĿ¼
		File srcFolder = new File("e:\\demo");
		// ��װĿ�ĵ�
		File destFolder = new File("e:\\test");
		// ���Ŀ�ĵ��ļ��в����ڣ��ʹ���
		if (!destFolder.exists()) {
			destFolder.mkdir();
		}

		// ��ȡ��Ŀ¼�µ������ı���File����
		File[] fileArray = srcFolder.listFiles();

		// ������File���飬�õ�ÿһ��File����
		for (File file : fileArray) {
			// System.out.println(file);
			// ����Դ��e:\\demo\\e.mp3
			// Ŀ�ĵأ�e:\\test\\e.mp3
			String name = file.getName(); // e.mp3
			File newFile = new File(destFolder, name); // e:\\test\\e.mp3

			copyFile(file, newFile);
		}
	}

	private static void copyFile(File file, File newFile) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
				file));
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream(newFile));

		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = bis.read(bys)) != -1) {
			bos.write(bys, 0, len);
		}

		bos.close();
		bis.close();
	}
}
