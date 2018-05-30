package com.demo;
/**
 * 面试题
 *    请自己实现两个整数变量的交换
 *    注意 以后讲课的过程中 我没有明确指定数据的类型 默认int类型
 *
 */
public class BitDemo4 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println("a : " + a + ", b : " + b);
		
		// 方式1 使用第三方变量(开发中用的)
		/*
		int c = a;
		a = b;
		b = c;
		System.out.println("a:"+a+",b:"+b);
		System.out.println("------------");
		*/
		
		//方式2：用位异或实现(面试用)
		//左边：a,b,a
		//右边：a ^ b
		/*
		a = a ^ b;
		b = a ^ b; //a ^ b ^ b = a
		a = a ^ b; //a ^ b ^ a = b
		System.out.println("a:"+a+",b:"+b);
		*/
		
		//方式3：用变量相加的做法
		/*
		a = a + b; //a=30
		b = a - b; //b=10
		a = a - b; //a=20
		System.out.println("a:"+a+",b:"+b);
		*/
		
		// 方式4 一句话搞定
		b = (a + b) - (a = b); // b = 30 - 20 = 10, a = 20
		System.out.println("a : " + a + ", b : " + b);
	}
}
