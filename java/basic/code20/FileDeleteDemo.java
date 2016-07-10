package com.test;

import java.io.File;

/*
 * 需求：递归删除带内容的目录
 * 
 * 目录我已经给定：demo
 * 
 * 分析：
 * 		A:封装目录
 * 		B:获取该目录下的所有文件或者文件夹的File数组
 * 		C:遍历该File数组，得到每一个File对象
 * 		D:判断该File对象是否是文件夹
 * 			是：回到B
 * 			否：就删除
 */
public class FileDeleteDemo {
	public static void main(String[] args) {
		// 封装目录
		File srcFolder = new File("demo");
		// 递归实现
		deleteFolder(srcFolder);
	}

	private static void deleteFolder(File srcFolder) {
		// 获取该目录下的所有文件或者文件夹的File数组
		File[] fileArray = srcFolder.listFiles();

		if (fileArray != null) {
			// 遍历该File数组，得到每一个File对象
			for (File file : fileArray) {
				// 判断该File对象是否是文件夹
				if (file.isDirectory()) {
					deleteFolder(file);
				} else {
					System.out.println(file.getName() + "---" + file.delete());
				}
			}

			System.out
					.println(srcFolder.getName() + "---" + srcFolder.delete());
		}
	}
}

