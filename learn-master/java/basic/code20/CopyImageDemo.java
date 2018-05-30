package com.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 需求：把e:\\林青霞.jpg内容复制到当前项目目录下的mn.jpg中
 * 
 * 数据源：
 * 		e:\\林青霞.jpg	--读取数据--FileInputStream
 * 目的地：
 * 		mn.jpg--写出数据--FileOutputStream
 */
public class CopyImageDemo {
	public static void main(String[] args) throws IOException {
		// 封装数据源
		FileInputStream fis = new FileInputStream("e:\\林青霞.jpg");
		// 封装目的地
		FileOutputStream fos = new FileOutputStream("mn.jpg");

		// 复制数据
		int by = 0;
		while ((by = fis.read()) != -1) {
			fos.write(by);
		}

		// 释放资源
		fos.close();
		fis.close();
	}
}