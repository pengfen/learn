package com.test;

import java.util.Scanner;

/*
 * 模拟登录,给三次机会,并提示还有几次。
 * 
 * 分析：
 * 		A:定义用户名和密码。已存在的。
 * 		B:键盘录入用户名和密码。
 * 		C:比较用户名和密码。
 * 			如果都相同，则登录成功
 * 			如果有一个不同，则登录失败
 * 		D:给三次机会，用循环改进，最好用for循环。
 */
public class StringDemo7{
	public static void main(String[] args) {
		// 定义用户名和密码。已存在的。
		String username = "admin";
		String password = "admin";

		// 给三次机会，用循环改进，最好用for循环。
		for (int x = 0; x < 3; x++) {
			// x=0,1,2
			// 键盘录入用户名和密码。
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入用户名：");
			String name = sc.nextLine();
			System.out.println("请输入密码：");
			String pwd = sc.nextLine();

			// 比较用户名和密码。
			if (name.equals(username) && pwd.equals(password)) {
				// 如果都相同，则登录成功
				System.out.println("登录成功");
				break;
			} else {
				// 如果有一个不同，则登录失败
				// 2,1,0
				// 如果是第0次，应该换一种提示
				if ((2 - x) == 0) {
					System.out.println("帐号被锁定，请与班长联系");
				} else {
					System.out.println("登录失败，你还有" + (2 - x) + "次机会");
				}
			}
		}
	}
}
