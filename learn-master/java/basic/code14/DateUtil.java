package com.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * �������ں��ַ����໥ת���Ĺ�����
 * 
 * @author ������
 */
public class DateUtil {
	private DateUtil() {
	}

	/**
	 * ������������þ��ǰ�����ת��һ���ַ���
	 * 
	 * @param d
	 *            ��ת�������ڶ���
	 * @param format
	 *            ���ݹ�����Ҫ��ת���ĸ�ʽ
	 * @return ��ʽ������ַ���
	 */
	public static String dateToString(Date d, String format) {
		// SimpleDateFormat sdf = new SimpleDateFormat(format);
		// return sdf.format(d);
		return new SimpleDateFormat(format).format(d);
	}

	/**
	 * ������������þ��ǰ�һ���ַ���������һ�����ڶ���
	 * 
	 * @param s
	 *            ���������ַ���
	 * @param format
	 *            ���ݹ�����Ҫ��ת���ĸ�ʽ
	 * @return ����������ڶ���
	 * @throws ParseException
	 */
	public static Date stringToDate(String s, String format)
			throws ParseException {
		return new SimpleDateFormat(format).parse(s);
	}
}
