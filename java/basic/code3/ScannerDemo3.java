package com.demo;

import java.util.Scanner;

/**
 * ��ϰ
 *   ����¼���������� ��ȡ�����������е����ֵ
 *   ����¼���������� �Ƚ����������Ƿ����
 *
 */
public class ScannerDemo3 {
	public static void main(String[] args) {
		// ����¼���������� ��ȡ�����������е����ֵ
		
		// ��������¼�����
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�������һ������: ");
		int a = sc.nextInt();
		
		System.out.println("������ڶ�������: ");
		int b = sc.nextInt();
		
		System.out.println("���������������: ");
		int c = sc.nextInt();
		
		// ��ȡ�����������е����ֵ
		int temp = ((a > b) ? a : b);
		int max = (temp > c ? temp : c);
		System.out.println("max : " + max);
		System.out.println("-------------------------------");
		
		// ����¼����������
		System.out.println("�������һ������: ");
		int x = sc.nextInt();
		
		System.out.println("������ڶ�������: ");
		int y = sc.nextInt();
		
		// �Ƚ������������Ƿ����
		boolean flag = (x == y);
		System.out.println("flag : " + flag);
	}
}
