package com.test;

/*
 * �����Լ���δ����쳣��?
 * A:try...catch...finally
 * B:throws �׳�
 * 
 * try...catch...finally�Ĵ����ʽ��
 * 		try {
 * 			���ܳ�������Ĵ���;
 * 		}catch(�쳣�� ����) {
 * 			�������Ĵ���;
 * 		}finally {
 * 			�ͷ���Դ;
 * 		}
 * 
 * ���θ�ʽ��
 * 		try {
 * 			���ܳ�������Ĵ���;
 * 		}catch(�쳣�� ����) {
 * 			�������Ĵ���;
 * 		}
 * 
 * ע�⣺
 * 		A:try����Ĵ���Խ��Խ��
 * 		B:catch������������ݣ������Ǹ���һ���򵥵���ʾ
 */
public class ExceptionDemo2 {
	public static void main(String[] args) {
		// ��һ�׶�
		int a = 10;
		// int b = 2;
		int b = 0;

		try {
			System.out.println(a / b);
		} catch (ArithmeticException ae) {
			System.out.println("��������Ϊ0");
		}

		// �ڶ��׶�
		System.out.println("over");
	}
}

