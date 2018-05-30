package com.test.shop;

import java.util.Scanner;

/**
 * 页面类
 * 
 * @author Administrator
 * 
 */
public class Menu {

	public Menu() {
	}

	public void setData(String as[], double ad[], int ai[], String as1[],
			int ai1[]) {
		goodsName = as;
		goodsPrice = ad;
		custNo = ai;
		custBirth = as1;
		custScore = ai1;
	}

	public void showLoginMenu() {
		System.out.println("\n\n\t\t\t    欢迎使用itcast购物管理系统1.0版\n\n");
		System.out
				.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
		System.out.println("\t\t\t\t 1. 登 录 系 统\n\n");
		System.out.println("\t\t\t\t 2. 更 改 管 理 员 密 码\n\n");
		System.out.println("\t\t\t\t 3. 退 出\n\n");
		System.out
				.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
		System.out.print("请选择,输入数字:");
	}

	public void showMainMenu() {
		System.out.println("\n\n\t\t\t\t欢迎使用购物管理系统\n");
		System.out
				.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
		System.out.println("\t\t\t\t 1. 客 户 信 息 管 理\n");
		System.out.println("\t\t\t\t 2. 购 物 结 算\n");
		System.out.println("\t\t\t\t 3. 真 情 回 馈\n");
		System.out.println("\t\t\t\t 4. 注 销\n");
		System.out
				.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
		System.out.print("请选择,输入数字:");
		Scanner scanner = new Scanner(System.in);
		boolean flag = false;
		do {
			String s = scanner.next();
			if (s.equals("1")) {
				showCustMMenu();
				break;
			}
			if (s.equals("2")) {
				Pay pay = new Pay();
				pay
						.setData(goodsName, goodsPrice, custNo, custBirth,
								custScore);
				pay.calcPrice();
				break;
			}
			if (s.equals("3")) {
				showSendGMenu();
				break;
			}
			if (s.equals("4")) {
				showLoginMenu();
				break;
			}
			System.out.print("输入错误，请重新输入数字：");
			flag = false;
		} while (!flag);
	}

	public void showCustMMenu() {
		System.out.println("购物管理系统 > 客户信息管理\n");
		System.out
				.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
		System.out.println("\t\t\t\t 1. 显 示 所 有 客 户 信 息\n");
		System.out.println("\t\t\t\t 2. 添 加 客 户 信 息\n");
		System.out.println("\t\t\t\t 3. 修 改 客 户 信 息\n");
		System.out.println("\t\t\t\t 4. 查 询 客 户 信 息\n");
		System.out
				.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
		System.out.print("请选择,输入数字或按'n'返回上一级菜单:");
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;
		do {
			CustManagement custmanagement = new CustManagement();
			custmanagement.setData(goodsName, goodsPrice, custNo, custBirth,
					custScore);
			String s = scanner.next();
			if (s.equals("1")) {
				custmanagement.show();
				break;
			}
			if (s.equals("2")) {
				custmanagement.add();
				break;
			}
			if (s.equals("3")) {
				custmanagement.modify();
				break;
			}
			if (s.equals("4")) {
				custmanagement.search();
				break;
			}
			if (s.equals("n")) {
				showMainMenu();
				break;
			}
			System.out.println("输入错误, 请重新输入数字：");
			flag = false;
		} while (!flag);
	}

	public void showSendGMenu() {
		System.out.println("购物管理系统 > 真情回馈\n");
		System.out
				.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
		System.out.println("\t\t\t\t 1. 幸 运 大 放 送\n");
		System.out.println("\t\t\t\t 2. 幸 运 抽 奖\n");
		System.out.println("\t\t\t\t 3. 生 日 问 候\n");
		System.out
				.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
		System.out.print("请选择,输入数字或按'n'返回上一级菜单:");
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;
		GiftManagement giftmanagement = new GiftManagement();
		giftmanagement.setData(goodsName, goodsPrice, custNo, custBirth,
				custScore);
		do {
			String s = scanner.next();
			if (s.equals("1")) {
				giftmanagement.sendGoldenCust();
				break;
			}
			if (s.equals("2")) {
				giftmanagement.sendLuckyCust();
				break;
			}
			if (s.equals("3")) {
				giftmanagement.sendBirthCust();
				break;
			}
			if (s.equals("n")) {
				showMainMenu();
				break;
			}
			System.out.println("输入错误, 请重新输入数字：");
			flag = false;
		} while (!flag);
	}

	public String goodsName[];
	public double goodsPrice[];
	public int custNo[];
	public String custBirth[];
	public int custScore[];
}