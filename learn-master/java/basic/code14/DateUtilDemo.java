package com.test;

import java.text.ParseException;
import java.util.Date;

/*
 * 工具类的测试
 */
public class DateUtilDemo {
	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		// yyyy-MM-dd HH:mm:ss
		String s = DateUtil.dateToString(d, "yyyy年MM月dd日 HH:mm:ss");
		System.out.println(s);

		String s2 = DateUtil.dateToString(d, "yyyy年MM月dd日");
		System.out.println(s2);

		String s3 = DateUtil.dateToString(d, "HH:mm:ss");
		System.out.println(s3);

		String str = "2014-10-14";
		Date dd = DateUtil.stringToDate(str, "yyyy-MM-dd");
		System.out.println(dd);
	}
}