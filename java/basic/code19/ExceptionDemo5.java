package com.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 编译时异常和运行时异常的区别
 * 编译期异常：Java程序必须显示处理，否则程序就会发生错误，无法通过编译
 * 运行期异常：无需显示处理，也可以和编译时异常一样处理
 */
public class ExceptionDemo5 {
	public static void main(String[] args) {
		// int a = 10;
		// int b = 0;
		// if (b != 0) {
		// System.out.println(a / b);
		// }

		String s = "2014-11-20";
		// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		// Date d = sdf.parse(s);
		try {
			Date d = sdf.parse(s);
			System.out.println(d);
		} catch (ParseException e) {
			// e.printStackTrace();
			System.out.println("解析日期出问题了");
		}
	}
}
