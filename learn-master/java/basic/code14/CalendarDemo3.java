package com.test;

import java.util.Calendar;
import java.util.Scanner;

/*
 * 获取任意一年的二月有多少天
 * 
 * 分析：
 * 		A:键盘录入任意的年份
 * 		B:设置日历对象的年月日
 * 			年就是A输入的数据
 * 			月是2
 * 			日是1
 * 		C:把时间往前推一天，就是2月的最后一天
 * 		D:获取这一天输出即可
 */
public class CalendarDemo3{
	public static void main(String[] args) {
		// 键盘录入任意的年份
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = sc.nextInt();

		// 设置日历对象的年月日
		Calendar c = Calendar.getInstance();
		c.set(year, 2, 1); // 其实是这一年的3月1日
		// 把时间往前推一天，就是2月的最后一天
		c.add(Calendar.DATE, -1);

		// 获取这一天输出即可
		System.out.println(c.get(Calendar.DATE));
	}
}