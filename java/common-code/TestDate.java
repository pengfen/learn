package com.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {
	public static void main(String[] args) throws ParseException {
		// 使用 format() 方法将日期转换为指定格式的文本
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date now = new Date(); // 创建 Date 对象 表示当前时间
		// 调用 format() 方法 将日期转换为字符串并输出
		System.out.println(sdf1.format(now));
		System.out.println(sdf2.format(now));
		System.out.println(sdf3.format(now));
		
		// 使用 parse() 方法将文本转换为日期
		String d = "2014-06-01 21:05:36";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// 调用 parse() 方法 将字符串转换为日期
		Date date = sdf.parse(d);
		System.out.println(date);
	}
}
