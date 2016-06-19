package com.demo;
/**
 * 赋值运算符
 * 
 *    基本的赋值运算符 = 把 = 右边的数据赋值给左边
 *    
 *    扩展的赋值运算符 += -= *= /= %=  += 把左边和右边做加法 然后赋值给左边
 *
 */
public class Assignment {
	public static void main(String[] args) {
		// 定义一个变量
		int x = 10;
		
		int a, b; // 其他用法
		a = b = 10;
		System.out.println(a);
		System.out.println(b);
		System.out.println("-----------------");
		
		int y = 10; // 定义一个变量
		
		y += 20;
		
		System.out.println(y);
	}
}
