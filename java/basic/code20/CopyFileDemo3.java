package com.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 需求：把c:\\a.txt内容复制到d:\\b.txt中
 * 
 * 数据源：
 * 		c:\\a.txt	--	读取数据	--	FileInputStream
 * 目的地：
 * 		d:\\b.txt	--	写出数据	--	FileOutputStream
 */
public class CopyFileDemo3 {
	public static void main(String[] args) throws IOException {
		// 封装数据源
		FileInputStream fis = new FileInputStream("c:\\a.txt");
		FileOutputStream fos = new FileOutputStream("d:\\b.txt");

		// 复制数据
		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = fis.read(bys)) != -1) {
			fos.write(bys, 0, len);
		}

		// 释放资源
		fos.close();
		fis.close();
	}
}