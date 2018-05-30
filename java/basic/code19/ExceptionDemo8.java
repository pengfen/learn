package com.test;

/*
 * throw:如果出现了异常情况，我们可以把该异常抛出，这个时候的抛出的应该是异常的对象。
 * 
 * throws和throw的区别(面试题)
	throws
		用在方法声明后面，跟的是异常类名
		可以跟多个异常类名，用逗号隔开
		表示抛出异常，由该方法的调用者来处理
		throws表示出现异常的一种可能性，并不一定会发生这些异常
	throw
		用在方法体内，跟的是异常对象名
		只能抛出一个异常对象名
		表示抛出异常，由方法体内的语句处理
		throw则是抛出了异常，执行throw则一定抛出了某种异常
 */
public class ExceptionDemo8 {
	public static void main(String[] args) {
		// method();
		
		try {
			method2();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void method() {
		int a = 10;
		int b = 0;
		if (b == 0) {
			throw new ArithmeticException();
		} else {
			System.out.println(a / b);
		}
	}

	public static void method2() throws Exception {
		int a = 10;
		int b = 0;
		if (b == 0) {
			throw new Exception();
		} else {
			System.out.println(a / b);
		}
	}
}