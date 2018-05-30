package com.test;
/**
 * 需求 准备写一个java程序 把"welcome to java world"这句话输出在控制台
 * 
 * 分析
 *    要写一个java程序 必须定义类
 *    把数据能够输出 说明我们的程序是可以独立运行的 而程序要独立运行 必须定义main方法
 *    把数据输出在控制台 必须使用输出语句
 *    
 * 实现
 *    java语言提供了一个关键字 class用来定义类 后面跟的是类名
 *    main方法的格式是固定的
 *    public static void main(String[] args) {}
 *    输出语句的格式是固定的 System.out.println("welcome to java world") 内容是可以改变的
 *
 */
public class Wel {
	/*
	 * 为了程序能够独立运行 定义main方法  main方法是程序的入口 被jvm自动调用 
	 */
	public static void main(String[] args) {
		// 为了把数据显示在控制台 我们就使用了输出语句
		System.out.println("welcome to java world");
	}
}
