package com.test;
/*
需求：请输出一个4行5列的星星(*)图案。
结果：
	*****
	*****
	*****
	*****
	
循环嵌套：就是循环语句的循环体本身是一个循环语句。

通过结果我们知道这样的一个结论：
	外循环控制行数
	内循环控制列数
*/
class ForForDemo {
	public static void main(String[] args) {
		//原始做法
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("-------------");
		
		//虽然可以完成需求，但是不是很好
		//如果是多行多列就会比较麻烦
		//所以我们准备改进
		//如何改进呢?
		//我先考虑如何实现一行*的问题
		//System.out.println("*****");
		//我们要想的是如何实现一次输出一颗*的问题
		//System.out.println("*");
		//System.out.println("*");
		//现在虽然可以一次一颗*，但是却换行了，我要求不能换行，怎么办呢?
		//输出语句的另一种格式：System.out.print(); 这个是不带换行的
		//System.out.print("*");
		//System.out.print("*");
		//System.out.print("*");
		//System.out.print("*");
		//System.out.print("*");
		//如果我要在一行上打出多颗*，比较麻烦，而代码是重复的，所以我决定用循环改进
		for(int x=0; x<5; x++) {
			System.out.print("*");
		}
		//我们可以通过空的输出语句实现换行：System.out.println();
		System.out.println();
		
		//既然我可以打出一行，我就可以打出第二行
		for(int x=0; x<5; x++) {
			System.out.print("*");
		}
		//我们可以通过空的输出语句实现换行：System.out.println();
		System.out.println();
	
		//同理打出第三行，第四行
		for(int x=0; x<5; x++) {
			System.out.print("*");
		}
		//我们可以通过空的输出语句实现换行：System.out.println();
		System.out.println();
		
		//既然我可以打出一行，我就可以打出第二行
		for(int x=0; x<5; x++) {
			System.out.print("*");
		}
		//我们可以通过空的输出语句实现换行：System.out.println();
		System.out.println();
		System.out.println("-----------------");
		//同样的代码出现了4次，说明我们程序写的不好，用循环改进
		for(int y=0; y<4; y++) {
			for(int x=0; x<5; x++) {
				System.out.print("*");
			}
			//我们可以通过空的输出语句实现换行：System.out.println();
			System.out.println();
		}
	}
}
