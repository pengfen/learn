package com.test.shop;

import java.util.Scanner;

/**
 * 系统开启类
 * 
 * @author Administrator
 * 
 */
public class StartSMS {

	public StartSMS() {
	}

	public static void main(String args[]) {
		Data data = new Data();
		data.ini();
		Menu menu = new Menu();
		menu.setData(data.goodsName, data.goodsPrice, data.custNo,
				data.custBirth, data.custScore);
		menu.showLoginMenu();
		boolean flag = true;
		label0: do {
			if (!flag)
				break;
			Scanner scanner = new Scanner(System.in);
			int i = scanner.nextInt();
			VerifyEqual verifyequal = new VerifyEqual();
			switch (i) {
			case 1: // '\001'
				int j = 3;
				do {
					if (j < 1)
						continue label0;
					if (verifyequal.verify(data.manager.username,
							data.manager.password)) {
						menu.showMainMenu();
						continue label0;
					}
					if (j != 1) {
						System.out.println("\n用户名和密码不匹配，请重新输入：");
					} else {
						System.out.println("\n您没有权限进入系统！谢谢！");
						flag = false;
					}
					j--;
				} while (true);

			case 2: // '\002'
				if (verifyequal.verify(data.manager.username,
						data.manager.password)) {
					System.out.print("请输入新的用户名：");
					data.manager.username = scanner.next();
					System.out.print("请输入新的密码：");
					data.manager.password = scanner.next();
					System.out.println("用户名和密码已更改！");
					System.out.println("\n请选择，输入数字：");
				} else {
					System.out.println("抱歉，你没有权限修改！");
					flag = false;
				}
				break;

			case 3: // '\003'
				System.out.println("谢谢您的使用！");
				//flag = false;
				System.exit(0);
				break;

			default:
				System.out.print("\n输入有误！请重新选择，输入数字: ");
				break;
			}
		} while (flag);
	}
}