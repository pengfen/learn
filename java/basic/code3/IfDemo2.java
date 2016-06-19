package com.demo;
/**
 * if语句的注意事项
 *     比较表达式无论简单还是复杂 结果必须是boolean类型
 *     if语句控制的语句体如果是一条语句 大括号可以省略 如果是多条语句 就不能省略 建议永远不要省略
 *     一般来说 有左大括号就没有分号 有分号就没有左大括号
 *
 */
public class IfDemo2 {
	public static void main(String[] args) {
		int x = 10;
		
		if (x == 10) {
			System.out.println("x等于10");
		}
		
		if ((x > 5) || (x == 10)) {
			System.out.println("x大于或者等于10");
		}
		System.out.println("----------------------------");
		
		int a = 100;
		
		/*
		 * if (a == 100) {
		 *     System.out.println("a的值是100");
		 * }
		 */
		
		if (a != 100) {
			System.out.println("a的值是100");
			System.out.println("over");
		}
		System.out.println("----------------------------");
		
		int b = 100;
		if (b != 100); // 这里其实是有语句体的 只不过是空语句体
		
		// 代码块
		{
			System.out.println("b的值是100");
			System.out.println("over");
		}
	}
}
