package com.test;

import java.util.Calendar;
import java.util.Scanner;

/*
 * ��ȡ����һ��Ķ����ж�����
 * 
 * ������
 * 		A:����¼����������
 * 		B:�������������������
 * 			�����A���������
 * 			����2
 * 			����1
 * 		C:��ʱ����ǰ��һ�죬����2�µ����һ��
 * 		D:��ȡ��һ���������
 */
public class CalendarDemo3{
	public static void main(String[] args) {
		// ����¼����������
		Scanner sc = new Scanner(System.in);
		System.out.println("��������ݣ�");
		int year = sc.nextInt();

		// �������������������
		Calendar c = Calendar.getInstance();
		c.set(year, 2, 1); // ��ʵ����һ���3��1��
		// ��ʱ����ǰ��һ�죬����2�µ����һ��
		c.add(Calendar.DATE, -1);

		// ��ȡ��һ���������
		System.out.println(c.get(Calendar.DATE));
	}
}