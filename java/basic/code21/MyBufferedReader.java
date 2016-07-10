package com.test;

import java.io.IOException;
import java.io.Reader;

/*
 * 用Reader模拟BufferedReader的readLine()功能
 * 
 * readLine():一次读取一行，根据换行符判断是否结束，只返回内容，不返回换行符
 */
public class MyBufferedReader {
	private Reader r;

	public MyBufferedReader(Reader r) {
		this.r = r;
	}

	/*
	 * 思考：写一个方法，返回值是一个字符串。
	 */
	public String readLine() throws IOException {
		/*
		 * 我要返回一个字符串，我该怎么办呢? 我们必须去看看r对象能够读取什么东西呢? 两个读取方法，一次读取一个字符或者一次读取一个字符数组
		 * 那么，我们要返回一个字符串，用哪个方法比较好呢? 我们很容易想到字符数组比较好，但是问题来了，就是这个数组的长度是多长呢?
		 * 根本就没有办法定义数组的长度，你定义多长都不合适。 所以，只能选择一次读取一个字符。
		 * 但是呢，这种方式的时候，我们再读取下一个字符的时候，上一个字符就丢失了 所以，我们又应该定义一个临时存储空间把读取过的字符给存储起来。
		 * 这个用谁比较和是呢?数组，集合，字符串缓冲区三个可供选择。
		 * 经过简单的分析，最终选择使用字符串缓冲区对象。并且使用的是StringBuilder
		 */
		StringBuilder sb = new StringBuilder();

		// 做这个读取最麻烦的是判断结束，但是在结束之前应该是一直读取，直到-1
		
		
		/*
		hello
		world
		java	
		
		104101108108111
		119111114108100
		1069711897
		 */
		
		int ch = 0;
		while ((ch = r.read()) != -1) { //104,101,108,108,111
			if (ch == '\r') {
				continue;
			}

			if (ch == '\n') {
				return sb.toString(); //hello
			} else {
				sb.append((char)ch); //hello
			}
		}

		// 为了防止数据丢失，判断sb的长度不能大于0
		if (sb.length() > 0) {
			return sb.toString();
		}

		return null;
	}

	/*
	 * 先写一个关闭方法
	 */
	public void close() throws IOException {
		this.r.close();
	}
}