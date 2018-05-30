package com.test;

import java.io.File;

/*
 * 需求：把E:\评书\三国演义下面的视频名称修改为
 * 		00?_介绍.avi
 * 
 * 思路：
 * 		A:封装目录
 * 		B:获取该目录下所有的文件的File数组
 * 		C:遍历该File数组，得到每一个File对象
 * 		D:拼接一个新的名称，然后重命名即可。
 */
public class FileDemo10 {
	public static void main(String[] args) {
		// 封装目录
		File srcFolder = new File("E:\\评书\\三国演义");

		// 获取该目录下所有的文件的File数组
		File[] fileArray = srcFolder.listFiles();

		// 遍历该File数组，得到每一个File对象
		for (File file : fileArray) {
			// System.out.println(file);
			// E:\评书\三国演义\三国演义_001_[评书网-今天很高兴,明天就IO了]_桃园三结义.avi
			// 改后：E:\评书\三国演义\001_桃园三结义.avi
			String name = file.getName(); // 三国演义_001_[评书网-今天很高兴,明天就IO了]_桃园三结义.avi

			int index = name.indexOf("_");
			String numberString = name.substring(index + 1, index + 4);
			// System.out.println(numberString);

			// int startIndex = name.lastIndexOf('_');
			// int endIndex = name.lastIndexOf('.');
			// String nameString = name.substring(startIndex + 1, endIndex);
			// System.out.println(nameString);
			int endIndex = name.lastIndexOf('_');
			String nameString = name.substring(endIndex);

			String newName = numberString.concat(nameString); // 001_桃园三结义.avi
			// System.out.println(newName);

			File newFile = new File(srcFolder, newName); // E:\\评书\\三国演义\\001_桃园三结义.avi

			// 重命名即可
			file.renameTo(newFile);
		}
	}
}
