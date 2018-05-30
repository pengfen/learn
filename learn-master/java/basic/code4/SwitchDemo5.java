package com.test;

/*
根据你键盘录入的字符串，判断是否有满足要求的，如果有就输出。
否则，提示有误。

String s = sc.nextLine();
*/
import java.util.Scanner;

class SwitchTest3 {
	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		
		//录入数据
		System.out.println("请输入你要判断的字符串：");
		String s = sc.nextLine();
		
		switch(s) {
			case "hello":
				System.out.println("你输入的是hello");
				break;
			case "world":
				System.out.println("你输入的是world");
				break;
			case "java":
				System.out.println("你输入的是java");
				break;
			default:
				System.out.println("没有找到你输入的数据");
				//break;
		}
	}
}
