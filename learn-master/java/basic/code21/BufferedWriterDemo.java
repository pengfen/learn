package com.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 字符流为了高效读写，也提供了对应的字符缓冲流。
 * BufferedWriter:字符缓冲输出流
 * BufferedReader:字符缓冲输入流
 * 
 * BufferedWriter:字符缓冲输出流
 * 将文本写入字符输出流，缓冲各个字符，从而提供单个字符、数组和字符串的高效写入。 
 * 可以指定缓冲区的大小，或者接受默认的大小。在大多数情况下，默认值就足够大了。 
 */
public class BufferedWriterDemo {
	public static void main(String[] args) throws IOException {
		// BufferedWriter(Writer out)
		// BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
		// new FileOutputStream("bw.txt")));

		BufferedWriter bw = new BufferedWriter(new FileWriter("bw.txt"));

		bw.write("hello");
		bw.write("world");
		bw.write("java");
		bw.flush();

		bw.close();
	}
}
