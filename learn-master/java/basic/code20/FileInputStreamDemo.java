package com.test;


import java.io.FileInputStream;
import java.io.IOException;

/*
 * 一次读取一个字节数组：int read(byte[] b)
 * 返回值其实是实际读取的字节个数。
 */
public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		// 创建字节输入流对象
		// FileInputStream fis = new FileInputStream("fis2.txt");
		FileInputStream fis = new FileInputStream("FileOutputStreamDemo.java");

		// 读取数据
		// 定义一个字节数组
		// 第一次读取
		// byte[] bys = new byte[5];
		// int len = fis.read(bys);
		// // System.out.println(len);
		// // System.out.println(new String(bys));
		// // System.out.println(new String(bys, 0, len));
		// System.out.print(new String(bys, 0, len));
		//
		// // 第二次读取
		// len = fis.read(bys);
		// // System.out.println(len);
		// // System.out.println(new String(bys));
		// // System.out.println(new String(bys, 0, len));
		// System.out.print(new String(bys, 0, len));
		//
		// // 第三次读取
		// len = fis.read(bys);
		// // System.out.println(len);
		// // System.out.println(new String(bys));
		// // System.out.println(new String(bys, 0, len));
		// System.out.print(new String(bys, 0, len));
		//
		// // 第四次读取
		// len = fis.read(bys);
		// // System.out.println(len);
		// // System.out.println(new String(bys, 0, len));
		// System.out.print(new String(bys, 0, len));
		// // 代码重复了，用循环改进
		// // 但是，我不知道结束条件
		// // len = fis.read(bys);
		// // System.out.println(len);
		// // len = fis.read(bys);
		// // System.out.println(len);
		// // 如果读取到的实际长度是-1，就说明没有数据了

		// byte[] bys = new byte[115]; // 0
		// int len = 0;
		// while ((len = fis.read(bys)) != -1) {
		// System.out.print(new String(bys, 0, len));
		// // System.out.print(new String(bys)); //千万要带上len的使用
		// }

		// 最终版代码
		// 数组的长度一般是1024或者1024的整数倍
		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = fis.read(bys)) != -1) {
			System.out.print(new String(bys, 0, len));
		}

		// 释放资源
		fis.close();
	}
}