package com.test;
/*
 * 变量 就是在程序的执行过程中 其值是可以在一定范围内发生改变的量
 * 
 * 变量的组成规则
 *    必须对其进行限定 如何限定呢 用数据类型
 *    
 *    我们在运算的时候 不可能是拿着这个空间去运算  我们真正运算时使用的是该空间中的值 我们就给该空间起了一个名字 变量名
 *    
 *    即使你有数据类型了 你有变量名了 但是如果没有值 这个空间是一个垃圾空间 没有任何意义 初始化值
 *    
 * 定义变量的格式是 数据类型 变量名 = 初始化值
 */
/**
 * 数据类型 Java是一种强类型的语言 针对每一种数据都定义了明确的数据类型
 * 
 * 数据类型分类
 *    基本数据类型
 *    引用数据类型(类 接口 数值)
 *    
 * 基本数据类型 4类8种
 *    整数          占用字节数
 *    byte  1
 *    short 2
 *    int   4
 *    long  8
 *    
 *    浮点数
 *    float  4
 *    double 8
 *    
 *    字符
 *    char 2
 *    
 *    布尔 
 *    boolean 1
 *    
 * 注意
 *    整数默认是int类型
 *    浮点数默认是double类型
 *    
 *    长整型后缀用L或者l标记 建议使用L
 *    单精度浮点数用F或者f标记 建议使用F
 *
 */
public class DataTypeDemo {
	public static void main(String[] args) {
		// 定义变量的格式
		// 数据类型 变量名 = 初始化值
		
		// 定义一个字节变量
		byte b = 10;
		System.out.println(10);
		System.out.println(b);
		
		// 定义一个短整型变量
		short s = 100;
		System.out.println(s);
		
		// 定义一个整型变量
		int i = 1000;
		System.out.println(i);
		
		// 超过了int的范围
		// int j = 10000000000000000;
		Long j = 10000000000000L;
		// long j = 100L;
		System.out.println(j);
		
		// 定义浮点数据变量
		float f = 12.345F;
		System.out.println(f);
		
		double d = 12.345;
		System.out.println(d);
		
		// 定义字符变量
		char ch = 'a';
		System.out.println(ch);
		
		// 定义布尔变量
		boolean flag = true;
		System.out.println(flag);
	}
}
