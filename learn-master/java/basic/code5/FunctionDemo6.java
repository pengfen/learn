package com.test;

import java.util.Scanner;

/*
 * ����¼���������� �Ƚ����������Ƿ����
 * 
 * ���� �Ƚ��������Ƿ���Ƚ����һ��boolean����
 */
public class FunctionDemo6 {
	public static void main(String[] args) {
		// ��������¼�����
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�������һ������: ");
		int a = sc.nextInt();
		
		System.out.println("������ڶ�������: ");
		int b = sc.nextInt();
		
		boolean flag = compare(a, b);
		System.out.println(flag);
	}
	
	/*
	 * ���� �Ƚ��������Ƿ����
	 * 
	 * ������ȷ
	 *    ����ֵ���� boolean
	 *    �����б� int a, int b
	 */
	public static boolean compare(int a, int b) {
		// if ���ĸ�ʽ2ʵ��
		/*
		 if (a == b) {
		     return true;
		 } else {
		     return false;
		 }
		 */
		
		// ��Ԫ�Ľ�
		// boolean flag = ((a == b) ? true : false);
		// return flag;
		
		// �����Ľ�
		// return ((a == b) ? true : false);
		
		// ���հ汾
		return a == b;
	}
}
