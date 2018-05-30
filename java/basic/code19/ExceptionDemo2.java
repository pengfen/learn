package com.test;

/*
 * 我们自己如何处理异常呢?
 * A:try...catch...finally
 * B:throws 抛出
 * 
 * try...catch...finally的处理格式：
 * 		try {
 * 			可能出现问题的代码;
 * 		}catch(异常名 变量) {
 * 			针对问题的处理;
 * 		}finally {
 * 			释放资源;
 * 		}
 * 
 * 变形格式：
 * 		try {
 * 			可能出现问题的代码;
 * 		}catch(异常名 变量) {
 * 			针对问题的处理;
 * 		}
 * 
 * 注意：
 * 		A:try里面的代码越少越好
 * 		B:catch里面必须有内容，哪怕是给出一个简单的提示
 */
public class ExceptionDemo2 {
	public static void main(String[] args) {
		// 第一阶段
		int a = 10;
		// int b = 2;
		int b = 0;

		try {
			System.out.println(a / b);
		} catch (ArithmeticException ae) {
			System.out.println("除数不能为0");
		}

		// 第二阶段
		System.out.println("over");
	}
}

