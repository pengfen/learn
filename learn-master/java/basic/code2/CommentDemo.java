package com.test;
/**
 * 注释 用于解释说明程序的文字
 * 
 * Java中注释的分类及格式
 * 单行注释 //
 * 多行注释 /* 星/
 * 注意 多行不可以嵌套使用 而单行是可以的
 * 文档注释 被javadoc工具解析生成一个说明书 面向对象部分讲解
 *
 */

public class CommentDemo {
	// main 方法是主方法 是程序的入口 被JVM调用
	public static void main(String[] args) {
		System.out.println("好好学习 天天向上");
		
		/*
		 * 注释的作用
		 * 解释说明程序 提高程序的阅读性
		 * 可以帮助我们调试程序  后面讲解更高级的调试
		 */
		
		/* 注释调试
		 * 全部注释 然后一行一行放行进行调试
		 * 
		 * PHP 一行一行进行echo 输出 进行调试
		 */
		
		System.out.println("林青霞");
		System.out.println("王祖贤");
		System.out.println("刘亦菲");
		System.out.println("范冰冰");
	}
}
