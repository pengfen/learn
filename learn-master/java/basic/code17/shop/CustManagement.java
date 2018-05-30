package com.test.shop;

import java.util.Scanner;

public class CustManagement {

	public CustManagement() {
	}

	public void setData(String as[], double ad[], int ai[], String as1[],
			int ai1[]) {
		goodsName = as;
		goodsPrice = ad;
		custNo = ai;
		custBirth = as1;
		custScore = ai1;
	}

	public void returnLastMenu() {
		System.out.print("\n\n请按'n'返回上一级菜单:");
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;
		do
			if (scanner.next().equals("n")) {
				Menu menu = new Menu();
				menu.setData(goodsName, goodsPrice, custNo, custBirth,
						custScore);
				menu.showCustMMenu();
			} else {
				System.out.print("输入错误, 请重新'n'返回上一级菜单：");
				flag = false;
			}
		while (!flag);
	}

	public void add() {
		System.out.println("购物管理系统 > 客户信息管理 > 添加客户信息\n\n");
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入会员号(<4位整数>)：");
		int i = scanner.nextInt();
		System.out.print("请输入会员生日（月/日<用两位数表示>）：");
		String s = scanner.next();
		System.out.print("请输入积分：");
		int j = scanner.nextInt();
		int k = -1;
		int l = 0;
		do {
			if (l >= custNo.length)
				break;
			if (custNo[l] == 0) {
				k = l;
				break;
			}
			l++;
		} while (true);
		custNo[k] = i;
		custBirth[k] = s;
		custScore[k] = j;
		System.out.println("新会员添加成功！");
		returnLastMenu();
	}

	public void modify() {
		System.out.println("购物管理系统 > 客户信息管理 > 修改客户信息\n\n");
		System.out.print("请输入会员号：");
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		System.out.println("  会员号            生日             积分      ");
		System.out.println("------------|------------|---------------");
		int j = -1;
		int k = 0;
		do {
			if (k >= custNo.length)
				break;
			if (custNo[k] == i) {
				System.out.println((new StringBuilder()).append(custNo[k])
						.append("\t\t").append(custBirth[k]).append("\t\t")
						.append(custScore[k]).toString());
				j = k;
				break;
			}
			k++;
		} while (true);
		if (j != -1) {
			System.out
					.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
			System.out.println("\t\t\t\t1.修 改 会 员 生 日.\n");
			System.out.println("\t\t\t\t2.修 改 会 员 积 分.\n");
			System.out
					.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
			System.out.print("请选择，输入数字：");
			switch (scanner.nextInt()) {
			case 1: // '\001'
				System.out.print("请输入修改后的生日：");
				custBirth[j] = scanner.next();
				System.out.println("生日信息已更改！");
				break;

			case 2: // '\002'
				System.out.print("请输入修改后的会员积分：");
				custScore[j] = scanner.nextInt();
				System.out.println("会员积分已更改！");
				break;
			}
		} else {
			System.out.println("抱歉，没有你查询的会员。");
		}
		returnLastMenu();
	}

	public void search() {
		System.out.println("购物管理系统 > 客户信息管理 > 查询客户信息\n");
		String s = "y";
		Scanner scanner = new Scanner(System.in);
		for (; s.equals("y"); s = scanner.next()) {
			System.out.print("请输入会员号：");
			int i = scanner.nextInt();
			System.out.println("  会员号            生日             积分      ");
			System.out.println("------------|------------|---------------");
			boolean flag = false;
			int j = 0;
			do {
				if (j >= custNo.length)
					break;
				if (custNo[j] == i) {
					System.out.println((new StringBuilder()).append(custNo[j])
							.append("\t\t").append(custBirth[j]).append("\t\t")
							.append(custScore[j]).toString());
					flag = true;
					break;
				}
				j++;
			} while (true);
			if (!flag)
				System.out.println("抱歉，没有你查询的会员信息。");
			System.out.print("\n要继续查询吗（y/n）:");
		}

		returnLastMenu();
	}

	public void show() {
		System.out.println("购物管理系统 > 客户信息管理 > 显示客户信息\n\n");
		System.out.println("  会员号            生日             积分      ");
		System.out.println("------------|------------|---------------");
		int i = custNo.length;
		for (int j = 0; j < i && custNo[j] != 0; j++)
			System.out.println((new StringBuilder()).append(custNo[j]).append(
					"\t\t").append(custBirth[j]).append("\t\t").append(
					custScore[j]).toString());

		returnLastMenu();
	}

	public String goodsName[];
	public double goodsPrice[];
	public int custNo[];
	public String custBirth[];
	public int custScore[];
}