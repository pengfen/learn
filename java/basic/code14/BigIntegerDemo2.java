package com.test;

import java.math.BigInteger;

/*
 * public BigInteger add(BigInteger val):��
 * public BigInteger subtract(BigInteger val):��
 * public BigInteger multiply(BigInteger val):��
 * public BigInteger divide(BigInteger val):��
 * public BigInteger[] divideAndRemainder(BigInteger val):�����̺�����������
 */
public class BigIntegerDemo2 {
	public static void main(String[] args) {
		BigInteger bi1 = new BigInteger("100");
		BigInteger bi2 = new BigInteger("50");

		// public BigInteger add(BigInteger val):��
		System.out.println("add:" + bi1.add(bi2));
		// public BigInteger subtract(BigInteger val):��
		System.out.println("subtract:" + bi1.subtract(bi2));
		// public BigInteger multiply(BigInteger val):��
		System.out.println("multiply:" + bi1.multiply(bi2));
		// public BigInteger divide(BigInteger val):��
		System.out.println("divide:" + bi1.divide(bi2));

		// public BigInteger[] divideAndRemainder(BigInteger val):�����̺�����������
		BigInteger[] bis = bi1.divideAndRemainder(bi2);
		System.out.println("�̣�" + bis[0]);
		System.out.println("������" + bis[1]);
	}
}
