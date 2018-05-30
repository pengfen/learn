package com.demo;
/**
 * && 和 &的区别 同理 || 和 | 的区别
 *    最终结果一样
 *    &&具有短路效果 左边是false 右边不执行
 *    
 * 开发中常用的逻辑运算符 && || !
 *
 */
public class LogicDemo2 {
	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		int c = 5;
		
		// && 双与
		System.out.println((a > b) && (a > c)); // false && false = false
		System.out.println((a > b) && (a < c)); // false && true = false
		System.out.println((a < b) && (a > c)); // true && false = false
		System.out.println((a < b) && (a < c)); // true && true = true
		System.out.println("-------------------------------");
		
		int x = 3;
		int y = 4;
		
		// boolean b1 = ((x++ == 3) & (y++ == 4));
		// boolean b1 = ((x++ == 3) && (y++ == 4));
		// boolean b1 = ((++x == 3) && (y++ == 4));
		boolean b1 = ((++x == 3) && (y++ == 4));
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		System.out.println(b1);
	}
}