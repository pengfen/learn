package com.test;

import java.io.FileReader;
import java.io.IOException;

/*
 * 测试MyBufferedReader的时候，你就把它当作BufferedReader一样的使用
 */
public class MyBufferedReaderDemo {
	public static void main(String[] args) throws IOException {
		MyBufferedReader mbr = new MyBufferedReader(new FileReader("my.txt"));

		String line = null;
		while ((line = mbr.readLine()) != null) {
			System.out.println(line);
		}

		mbr.close();

		// System.out.println('\r' + 0); // 13
		// System.out.println('\n' + 0);// 10
	}
}