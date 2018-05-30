package com.test;

import java.util.Calendar;

/*
 * public void add(int field,int amount):根据给定的日历字段和对应的时间，来对当前的日历进行操作。
 * public final void set(int year,int month,int date):设置当前日历的年月日
 */
public class CalendarDemo2 {
	public static void main(String[] args) {
		// 获取当前的日历时间
		Calendar c = Calendar.getInstance();

		// 获取年
		int year = c.get(Calendar.YEAR);
		// 获取月
		int month = c.get(Calendar.MONTH);
		// 获取日
		int date = c.get(Calendar.DATE);
		System.out.println(year + "年" + (month + 1) + "月" + date + "日");

		// // 三年前的今天
		// c.add(Calendar.YEAR, -3);
		// // 获取年
		// year = c.get(Calendar.YEAR);
		// // 获取月
		// month = c.get(Calendar.MONTH);
		// // 获取日
		// date = c.get(Calendar.DATE);
		// System.out.println(year + "年" + (month + 1) + "月" + date + "日");

		// 5年后的10天前
		c.add(Calendar.YEAR, 5);
		c.add(Calendar.DATE, -10);
		// 获取年
		year = c.get(Calendar.YEAR);
		// 获取月
		month = c.get(Calendar.MONTH);
		// 获取日
		date = c.get(Calendar.DATE);
		System.out.println(year + "年" + (month + 1) + "月" + date + "日");
		System.out.println("--------------");

		c.set(2011, 11, 11);
		// 获取年
		year = c.get(Calendar.YEAR);
		// 获取月
		month = c.get(Calendar.MONTH);
		// 获取日
		date = c.get(Calendar.DATE);
		System.out.println(year + "年" + (month + 1) + "月" + date + "日");
	}
}

