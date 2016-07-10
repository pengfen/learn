package com.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 加入异常处理的字节输出流操作
 */
public class FileOutputStreamDemo4 {
	public static void main(String[] args) {
		// 分开做异常处理
		// FileOutputStream fos = null;
		// try {
		// fos = new FileOutputStream("fos4.txt");
		// } catch (FileNotFoundException e) {
		// e.printStackTrace();
		// }
		//
		// try {
		// fos.write("java".getBytes());
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		//
		// try {
		// fos.close();
		// } catch (IOException e) {
		// e.printStackTrace();
		// }

		// 一起做异常处理
		// try {
		// FileOutputStream fos = new FileOutputStream("fos4.txt");
		// fos.write("java".getBytes());
		// fos.close();
		// } catch (FileNotFoundException e) {
		// e.printStackTrace();
		// } catch (IOException e) {
		// e.printStackTrace();
		// }

		// 改进版
		// 为了在finally里面能够看到该对象就必须定义到外面，为了访问不出问题，还必须给初始化值
		FileOutputStream fos = null;
		try {
			// fos = new FileOutputStream("z:\\fos4.txt");
			fos = new FileOutputStream("fos4.txt");
			fos.write("java".getBytes());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 如果fos不是null，才需要close()
			if (fos != null) {
				// 为了保证close()一定会执行，就放到这里了
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
