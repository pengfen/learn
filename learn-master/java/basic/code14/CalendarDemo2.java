package com.test;

import java.util.Calendar;

/*
 * public void add(int field,int amount):���ݸ����������ֶκͶ�Ӧ��ʱ�䣬���Ե�ǰ���������в�����
 * public final void set(int year,int month,int date):���õ�ǰ������������
 */
public class CalendarDemo2 {
	public static void main(String[] args) {
		// ��ȡ��ǰ������ʱ��
		Calendar c = Calendar.getInstance();

		// ��ȡ��
		int year = c.get(Calendar.YEAR);
		// ��ȡ��
		int month = c.get(Calendar.MONTH);
		// ��ȡ��
		int date = c.get(Calendar.DATE);
		System.out.println(year + "��" + (month + 1) + "��" + date + "��");

		// // ����ǰ�Ľ���
		// c.add(Calendar.YEAR, -3);
		// // ��ȡ��
		// year = c.get(Calendar.YEAR);
		// // ��ȡ��
		// month = c.get(Calendar.MONTH);
		// // ��ȡ��
		// date = c.get(Calendar.DATE);
		// System.out.println(year + "��" + (month + 1) + "��" + date + "��");

		// 5����10��ǰ
		c.add(Calendar.YEAR, 5);
		c.add(Calendar.DATE, -10);
		// ��ȡ��
		year = c.get(Calendar.YEAR);
		// ��ȡ��
		month = c.get(Calendar.MONTH);
		// ��ȡ��
		date = c.get(Calendar.DATE);
		System.out.println(year + "��" + (month + 1) + "��" + date + "��");
		System.out.println("--------------");

		c.set(2011, 11, 11);
		// ��ȡ��
		year = c.get(Calendar.YEAR);
		// ��ȡ��
		month = c.get(Calendar.MONTH);
		// ��ȡ��
		date = c.get(Calendar.DATE);
		System.out.println(year + "��" + (month + 1) + "��" + date + "��");
	}
}

