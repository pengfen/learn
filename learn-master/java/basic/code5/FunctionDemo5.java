package com.test;

import java.util.Scanner;

/*
 * ����¼���������� �����������еĽϴ�ֵ
 */
public class FunctionDemo5 {
	public static void main(String[] args) {
		// ��������¼�����
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�������һ������: ");
		int a = sc.nextInt();
		
		System.out.println("������ڶ�������: ");
		int b = sc.nextInt();
		
		int result = getMax(a, b);
		System.out.println("�ϴ�ֵ��: " + result);
	}
	
	/*
	 * ���� �������еĽϴ�ֵ
	 * ������ȷ
	 *    ����ֵ����: int
	 *    �����б�: int a, int b
	 */
	public static int getMax(int a, int b) {
		// if ���
//		if (a > b) {
//			return a;
//		} else {
//			return b;
//		}
		
		// ����Ԫ�Ľ�
		// int c = ((a > b) ? a : b);
		// return c;
		
		// ����c���Ǻ����ʽ��
		return ((a > b) ? a : b);
	}
}
