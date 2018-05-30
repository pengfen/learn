package com.test;
/**
 * 使用变量的时候要注意的问题
 *    作用域
 *       变量定义在哪些个大括号内 它就在这个大括号内有效
 *       并且 在同一个大括号内不能同时定义同名的变量
 *       
 *    初始化值
 *       没有初始化值的变量不能直接使用
 *       你只要在使用前给值就行 不一定非要在定义的时候立即给值
 *       推荐在定义的时候给值
 *       
 *    定义变量的格式
 *       数据类型 变量名 = 初始化值
 *       数据类型 变量名;
 *       变量名 = 初始化值
 *       
 * 在一行上建议只定义一个变量
 *    可以定义多个 但是不建议
 *
 */

public class DataTypeDemo2 {
	public static void main(String[] args) {
		// 定义变量
		int x = 100;
		
		// 错误 不能有同名的
		// int x = 200;
		
		// 定义变量必须给值
		// int y;
		// System.out.println(y);
		
		int z;
		z = 100;
		System.out.println(z);
		
		// 在一行上定义多个变量
		// int a = 10; int b = 20; int c = 30;
		// 上面的写法可以 但是不建议
		int a = 10;
		int b = 20;
		int c = 30;
		
		// int d, e;
		// d = 40;
		// e = 50;
		
		// int f, int g; // 错误
		// int h; int i; // 正确
	}
}
