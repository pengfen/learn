package com.demo;
/*
 * 获取三个数据中的最大值
 * 
 * 由此案例主要是为了讲解if语句是可以嵌套使用的 而且是可以任意的嵌套
 */
public class IfDemo9 {
	public static void main(String[] args) {
		int a = 10;
		int b = 30;
		int c = 20;
		
		// 三元实现
//		int temp = (a > b) ? a : b;
//		int max = (temp > c) ? temp : c;
//		System.out.println("max : " + max);
//		System.out.println("--------------------");
		
		// 用if语句实现
		int max;
		if (a > b) {
			if (a > c) {
				max = a;
			} else {
				max = c;
			}
		} else {
			if (b > c) {
				max = b;
			} else {
				max = c;
			}
		}
		System.out.println("max : " + max);
	}
}
