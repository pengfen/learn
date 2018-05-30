package com.test;
/**
 * 看程序写结果
 *    字符串数据和其他数据做 + 结果是字符串类型
 *    这里的 + 不是加法运算 而字符串连接符
 *
 */
public class DataTypeDemo9 {
	public static void main(String[] args) {
		System.out.println("welcome" + 'a' + 1); // welcome1
		System.out.println('a' + 1 + "welcome"); // 98welcome
		
		System.out.println("5 + 5 = " + 5 + 5); // 5 + 5 = 55
		System.out.println(5 + 5 + " = 5 + 5"); // 10 = 5 + 5
	}
}
