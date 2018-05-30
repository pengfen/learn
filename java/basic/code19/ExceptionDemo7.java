package com.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 有些时候，我们是可以对异常进行处理的，但是又有些时候，我们根本就没有权限去处理某个异常。
 * 或者说，我处理不了，我就不处理了。
 * 为了解决出错问题，Java针对这种情况，就提供了另一种处理方案：抛出。
 * 
 * 格式：
 * 		throws 异常类名
 * 		注意：这个格式必须跟在方法的括号后面。
 * 
 * 注意：
 * 		尽量不要在main方法上抛出异常。
 * 		但是我讲课为了方便我就这样做了。
 * 
 * 小结：
 * 		编译期异常抛出，将来调用者必须处理。
 * 		运行期异常抛出，将来调用可以不用处理。
 */
public class ExceptionDemo7 {
	public static void main(String[] args) {
		System.out.println("今天天气很好");
		try {
			method();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println("但是就是不该有雾霾");

		method2();
	}

	// 运行期异常的抛出
	public static void method2() throws ArithmeticException {
		int a = 10;
		int b = 0;
		System.out.println(a / b);
	}

	// 编译期异常的抛出
	// 在方法声明上抛出，是为了告诉调用者，你注意了，我有问题。
	public static void method() throws ParseException {
		String s = "2014-11-20";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d = sdf.parse(s);
		System.out.println(d);
	}
}

