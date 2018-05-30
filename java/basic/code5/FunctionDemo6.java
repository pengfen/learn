package com.test;

import java.util.Scanner;

/*
 * 键盘录入两个数据 比较两个数据是否相等
 * 
 * 分析 比较两个数是否相等结果是一个boolean类型
 */
public class FunctionDemo6 {
	public static void main(String[] args) {
		// 创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入第一个数据: ");
		int a = sc.nextInt();
		
		System.out.println("请输入第二个数据: ");
		int b = sc.nextInt();
		
		boolean flag = compare(a, b);
		System.out.println(flag);
	}
	
	/*
	 * 需求 比较两个数是否相等
	 * 
	 * 两个明确
	 *    返回值类型 boolean
	 *    参数列表 int a, int b
	 */
	public static boolean compare(int a, int b) {
		// if 语句的格式2实现
		/*
		 if (a == b) {
		     return true;
		 } else {
		     return false;
		 }
		 */
		
		// 三元改进
		// boolean flag = ((a == b) ? true : false);
		// return flag;
		
		// 继续改进
		// return ((a == b) ? true : false);
		
		// 最终版本
		return a == b;
	}
}
