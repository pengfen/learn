package com.test;

import java.math.BigInteger;

/*
 * BigInteger:�����ó���Integer��Χ�ڵ����ݽ�������
 * 
 * ���췽����
 * BigInteger(String val) 
 */
public class BigIntegerDemo {
	public static void main(String[] args) {
		// �⼸�����ԣ���Ϊ�˼򵥳���int��Χ�ڣ�Integer�Ͳ����ٱ�ʾ�����Ծ͸�̸���ϼ����ˡ�
		// Integer i = new Integer(100);
		// System.out.println(i);
		// // System.out.println(Integer.MAX_VALUE);
		// Integer ii = new Integer("2147483647");
		// System.out.println(ii);
		// // NumberFormatException
		// Integer iii = new Integer("2147483648");
		// System.out.println(iii);

		// ͨ������������������
		BigInteger bi = new BigInteger("2147483648");
		System.out.println("bi:" + bi);
	}
}
