package com.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;

/*
 * 需求：复制指定目录下的指定文件，并修改后缀名。
 * 指定的文件是：.java文件。
 * 指定的后缀名是：.jad
 * 指定的目录是：jad
 * 
 * 数据源：e:\\java\\A.java
 * 目的地：e:\\jad\\A.jad
 * 
 * 分析：
 * 		A:封装目录
 * 		B:获取该目录下的java文件的File数组
 * 		C:遍历该File数组，得到每一个File对象
 * 		D:把该File进行复制
 * 		E:在目的地目录下改名
 */
public class CopyFolderDemo2 {
	public static void main(String[] args) throws IOException {
		// 封装目录
		File srcFolder = new File("e:\\java");
		// 封装目的地
		File destFolder = new File("e:\\jad");
		// 如果目的地目录不存在，就创建
		if (!destFolder.exists()) {
			destFolder.mkdir();
		}

		// 获取该目录下的java文件的File数组
		File[] fileArray = srcFolder.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return new File(dir, name).isFile() && name.endsWith(".java");
			}
		});

		// 遍历该File数组，得到每一个File对象
		for (File file : fileArray) {
			// System.out.println(file);
			// 数据源：e:\java\DataTypeDemo.java
			// 目的地：e:\\jad\DataTypeDemo.java
			String name = file.getName();
			File newFile = new File(destFolder, name);
			copyFile(file, newFile);
		}

		// 在目的地目录下改名
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

