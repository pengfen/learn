package com.test;

/*
 * java不可能对所有的情况都考虑到，所以，在实际的开发中，我们可能需要自己定义异常。
 * 而我们自己随意的写一个类，是不能作为异常类来看的，要想你的类是一个异常类，就必须继承自Exception或者RuntimeException
 * 
 * 两种方式：
 * A:继承Exception
 * B:继承RuntimeException
 */
public class MyException extends Exception {
	public MyException() {
	}

	public MyException(String message) {
		super(message);
	}
}

// public class MyException extends RuntimeException {
//
// }