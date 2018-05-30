package com.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;

/*
 * ���󣺸���ָ��Ŀ¼�µ�ָ���ļ������޸ĺ�׺����
 * ָ�����ļ��ǣ�.java�ļ���
 * ָ���ĺ�׺���ǣ�.jad
 * ָ����Ŀ¼�ǣ�jad
 * 
 * ����Դ��e:\\java\\A.java
 * Ŀ�ĵأ�e:\\jad\\A.jad
 * 
 * ������
 * 		A:��װĿ¼
 * 		B:��ȡ��Ŀ¼�µ�java�ļ���File����
 * 		C:������File���飬�õ�ÿһ��File����
 * 		D:�Ѹ�File���и���
 * 		E:��Ŀ�ĵ�Ŀ¼�¸���
 */
public class CopyFolderDemo2 {
	public static void main(String[] args) throws IOException {
		// ��װĿ¼
		File srcFolder = new File("e:\\java");
		// ��װĿ�ĵ�
		File destFolder = new File("e:\\jad");
		// ���Ŀ�ĵ�Ŀ¼�����ڣ��ʹ���
		if (!destFolder.exists()) {
			destFolder.mkdir();
		}

		// ��ȡ��Ŀ¼�µ�java�ļ���File����
		File[] fileArray = srcFolder.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return new File(dir, name).isFile() && name.endsWith(".java");
			}
		});

		// ������File���飬�õ�ÿһ��File����
		for (File file : fileArray) {
			// System.out.println(file);
			// ����Դ��e:\java\DataTypeDemo.java
			// Ŀ�ĵأ�e:\\jad\DataTypeDemo.java
			String name = file.getName();
			File newFile = new File(destFolder, name);
			copyFile(file, newFile);
		}

		// ��Ŀ�ĵ�Ŀ¼�¸���
		File[] destFileArray = destFolder.listFiles();
		for (File destFile : destFileArray) {
			// System.out.println(destFile);
			// e:\jad\DataTypeDemo.java
			// e:\\jad\\DataTypeDemo.jad
			String name =destFile.getName(); //DataTypeDemo.java
			String newName = name.replace(".java", ".jad");//DataTypeDemo.jad
			
			File newFile = new File(destFolder,newName);
			destFile.renameTo(newFile);
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

