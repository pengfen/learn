package com.demo;

import java.util.Scanner;

/*
 * ����¼����ϰ  ����¼���������� ����������������� �������
 */
public class ScannerDemo4 {
	public static void main(String[] args) {
		// ����¼���������� ����������������� �������
		// ��������¼�����
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�������һ������: ");
		int x = sc.nextInt();
		
		System.out.println("������ڶ�������: ");
		int y = sc.nextInt();
		
		// �Ѽ���¼������ݽ�����Ӽ���
		int sum = (x + y);
		System.out.println("sum : " + sum);
	}
}
