package com.java;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCalendar {
	public static void main(String[] args) {
		// ����  Calendar ����
		Calendar c = Calendar.getInstance();
		// �� Calendar ����ת��Ϊ Date ����
		Date date = c.getTime();
		// ���� SimpleDateFormat ���� ָ��Ŀ���ʽ
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// ������ת��Ϊָ����ʽ���ַ���
		String now = sdf.format(date);
		System.out.println("��ǰʱ��: " + now);
	}
}
