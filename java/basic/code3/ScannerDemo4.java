package com.demo;

import java.util.Scanner;

/*
 * 键盘录入练习  键盘录入两个数据 并对这两个数据求和 输出其结果
 */
public class ScannerDemo4 {
	public static void main(String[] args) {
		// 键盘录入两个数据 并对这两个数据求和 输出其结果
		// 创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入第一个数据: ");
		int x = sc.nextInt();
		
		System.out.println("请输入第二个数据: ");
		int y = sc.nextInt();
		
		// 把键盘录入的数据进行相加即可
		int sum = (x + y);
		System.out.println("sum : " + sum);
	}
}
