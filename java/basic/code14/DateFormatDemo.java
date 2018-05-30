package com.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Date	 --	 String(��ʽ��)
 * 		public final String format(Date date)
 * 
 * String -- Date(����)
 * 		public Date parse(String source)
 * 
 * DateForamt:���Խ������ں��ַ����ĸ�ʽ���ͽ��������������ǳ����࣬����ʹ�þ�������SimpleDateFormat��
 * 
 * SimpleDateFormat�Ĺ��췽����
 * 		SimpleDateFormat():Ĭ��ģʽ
 * 		SimpleDateFormat(String pattern):������ģʽ
 * 			���ģʽ�ַ��������д��?
 * 			ͨ���鿴API�����Ǿ��ҵ��˶�Ӧ��ģʽ
 * 			�� y
 * 			�� M	
 * 			�� d
 * 			ʱ H
 * 			�� m
 * 			�� s
 * 
 * 			2014��12��12�� 12:12:12
 */
public class DateFormatDemo {
	public static void main(String[] args) throws ParseException {
		// Date -- String
		// �������ڶ���
		Date d = new Date();
		// ������ʽ������
		// SimpleDateFormat sdf = new SimpleDateFormat();
		// ����ģʽ
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
		// public final String format(Date date)
		String s = sdf.format(d);
		System.out.println(s);
		
		
		//String -- Date
		String str = "2008-08-08 12:12:12";
		//�ڰ�һ���ַ�������Ϊ���ڵ�ʱ����ע���ʽ����͸������ַ�����ʽƥ��
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dd = sdf2.parse(str);
		System.out.println(dd);
	}
}