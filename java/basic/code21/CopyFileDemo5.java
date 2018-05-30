package com.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 需求：把当前项目目录下的a.txt内容复制到当前项目目录下的b.txt中
 * 
 * 数据源：
 * 		a.txt -- 读取数据 -- 字符转换流 -- InputStreamReader -- FileReader -- BufferedReader
 * 目的地：
 * 		b.txt -- 写出数据 -- 字符转换流 -- OutputStreamWriter -- FileWriter -- BufferedWriter
 */
public class CopyFileDemo5 {
	public static void main(String[] args) throws IOException {
		// 封装数据源
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
		// 封装目的地
		BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));

		// 读写数据
		String line = null;
		while ((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}

		// 释放资源
		bw.close();
		br.close();
	}
}
