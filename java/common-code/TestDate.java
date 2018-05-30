package com.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {
	public static void main(String[] args) throws ParseException {
		// ʹ�� format() ����������ת��Ϊָ����ʽ���ı�
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy��MM��dd�� HHʱmm��ss��");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date now = new Date(); // ���� Date ���� ��ʾ��ǰʱ��
		// ���� format() ���� ������ת��Ϊ�ַ��������
		System.out.println(sdf1.format(now));
		System.out.println(sdf2.format(now));
		System.out.println(sdf3.format(now));
		
		// ʹ�� parse() �������ı�ת��Ϊ����
		String d = "2014-06-01 21:05:36";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// ���� parse() ���� ���ַ���ת��Ϊ����
		Date date = sdf.parse(d);
		System.out.println(date);
	}
}
