package com.test;

import java.util.Scanner;

/*
 * ������ʽ��
 * 		public boolean hasNextXxx():�ж��Ƿ���ĳ�����͵�Ԫ��
 * 		public Xxx nextXxx():��ȡ��Ԫ��
 * 
 * ��������int���͵ķ�������
 * 		public boolean hasNextInt()
 * 		public int nextInt()
 * 
 * ע�⣺
 * 		InputMismatchException������ĺ�����Ҫ�Ĳ�ƥ��
 */
public class ScannerDemo2 {
	public static void main(String[] args) {
		// ��������
		Scanner sc = new Scanner(System.in);

		// ��ȡ����(int����)
		if (sc.hasNextInt()) { // ����쳣 (InputMismatchException)
			int x = sc.nextInt();
			System.out.println("x : " + x);
		} else {
			System.out.println("���������������");
		}
	}
}