package com.demo;

import java.util.Scanner;

/**
 * Ϊ���ó�������ݸ����Ͽ��������� ���Ǿͼ����˼���¼�� �ó�������һ��
 * 
 * ��ô �������ʵ�ּ������ݵ�¼����
 *    ����  ��ʽ import java.util.Scanner;
 *       λ�� ��class����
 *       
 *    ��������¼����� ��ʽ Scanner sc = new Scanner(System.in);
 *    
 *    ͨ�������ȡ���� ��ʽ int x = sc.nextInt();
 *
 */
public class ScannerDemo {
	public static void main(String[] args) {
		// ��������¼�����
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�������һ������: ");
		int x = sc.nextInt();
		
		System.out.println("�������������: " + x);
	}
}
