package com.test;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 如何实现数据的换行?
 * 		为什么现在没有换行呢?因为你值写了字节数据，并没有写入换行符号。
 * 		如何实现呢?写入换行符号即可呗。
 * 		刚才我们看到了有写文本文件打开是可以的，通过windows自带的那个不行，为什么呢?
 * 		因为不同的系统针对不同的换行符号识别是不一样的?
 * 		windows:\r\n
 * 		linux:\n
 * 		Mac:\r
 * 		而一些常见的个高级记事本，是可以识别任意换行符号的。
 * 
 * 如何实现数据的追加写入?
 * 		用构造方法带第二个参数是true的情况即可
 */
public class FileOutputStreamDemo3 {
	public static void main(String[] args) throws IOException {
		// 创建字节输出流对象
		// FileOutputStream fos = new FileOutputStream("fos3.txt");
		// 创建一个向具有指定 name 的文件中写入数据的输出文件流。如果第二个参数为 true，则将字节写入文件末尾处，而不是写入文件开始处。
		FileOutputStream fos = new FileOutputStream("fos3.txt", true);

		// 写数据
		for (int x = 0; x < 10; x++) {
			fos.write(("hello" + x).getBytes());
			fos.write("\r\n".getBytes());
		}

		// 释放资源
		fos.close();
	}
}
