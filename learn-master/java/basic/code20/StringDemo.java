package com.test;

import java.util.Arrays;

/*
 * ����������ʶ��ʲôʱ��ð������ֽ�ת��Ϊһ��������?
 * �ڼ���������ĵĴ洢�������ֽڣ�
 * 		��һ���ֽڿ϶��Ǹ�����
 * 		�ڶ����ֽڳ������Ǹ���������������������ûӰ�졣
 */
public class StringDemo {
	public static void main(String[] args) {
		// String s = "abcde";
		// // [97, 98, 99, 100, 101]

		String s = "�Ұ����й�";
		// [-50, -46, -80, -82, -60, -29, -42, -48, -71, -6]

		byte[] bys = s.getBytes();
		System.out.println(Arrays.toString(bys));
	}
}