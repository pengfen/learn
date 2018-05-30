package com.demo;

import java.util.Scanner;

/**
 * 练习
 *   键盘录入三个数据 获取这三个数据中的最大值
 *   键盘录入两个数据 比较这两数据是否相等
 *
 */
public class ScannerDemo3 {
	public static void main(String[] args) {
		// 键盘录入三个数据 获取这三个数据中的最大值
		
		// 创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入第一个数据: ");
		int a = sc.nextInt();
		
		System.out.println("请输入第二个数据: ");
		int b = sc.nextInt();
		
		System.out.println("请输入第三个数据: ");
		int c = sc.nextInt();
		
		// 获取这三个数据中的最大值
		int temp = ((a > b) ? a : b);
		int max = (temp > c ? temp : c);
		System.out.println("max : " + max);
		System.out.println("-------------------------------");
		
		// 键盘录入两个数据
		System.out.println("请输入第一个数据: ");
		int x = sc.nextInt();
		
		System.out.println("请输入第二个数据: ");
		int y = sc.nextInt();
		
		// 比较这两个数据是否相等
		boolean flag = (x == y);
		System.out.println("flag : " + flag);
	}
}
