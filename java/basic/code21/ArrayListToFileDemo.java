package com.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 需求：把ArrayList集合中的字符串数据存储到文本文件
 * 
 * 分析：
 * 		通过题目的意思我们可以知道如下的一些内容，
 * 			ArrayList集合里存储的是字符串。
 * 			遍历ArrayList集合，把数据获取到。
 * 			然后存储到文本文件中。
 * 			文本文件说明使用字符流。
 * 
 * 数据源：
 * 		ArrayList<String> -- 遍历得到每一个字符串数据
 * 目的地：
 * 		a.txt -- FileWriter -- BufferedWriter
 */
public class ArrayListToFileDemo {
	public static void main(String[] args) throws IOException {
		// 封装数据与(创建集合对象)
		ArrayList<String> array = new ArrayList<String>();
		array.add("hello");
		array.add("world");
		array.add("java");

		// 封装目的地
		BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));

		// 遍历集合
		for (String s : array) {
			// 写数据
			bw.write(s);
			bw.newLine();
			bw.flush();
		}

		// 释放资源
		bw.close();
	}
}