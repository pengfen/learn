package com.test;

/*
 * java�����ܶ����е���������ǵ������ԣ���ʵ�ʵĿ����У����ǿ�����Ҫ�Լ������쳣��
 * �������Լ������дһ���࣬�ǲ�����Ϊ�쳣�������ģ�Ҫ���������һ���쳣�࣬�ͱ���̳���Exception����RuntimeException
 * 
 * ���ַ�ʽ��
 * A:�̳�Exception
 * B:�̳�RuntimeException
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