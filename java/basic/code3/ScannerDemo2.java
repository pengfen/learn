package com.demo;

import java.util.Scanner;

/*
 * ����¼����ϰ ����¼���������� ��ȡ�����������е����ֵ
 */
public class ScannerDemo2 {
	public static void main(String[] args) {
		// ��������¼�����
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�������һ������: ");
		int a = sc.nextInt();
		
		System.out.println("������ڶ�������: ");
		int b = sc.nextInt();
		
		// ��ȡ�����������е����ֵ
		int max = (a > b ? a : b);
		System.out.println("max : " + max);
	}
}
