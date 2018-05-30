package com.test.shop;

import java.util.Scanner;

/**
 * 礼物管理类
 * 
 * @author Administrator
 * 
 */
public class GiftManagement {

	public GiftManagement() {
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
				menu.showSendGMenu();
			} else {
				System.out.print("输入错误, 请重新'n'返回上一级菜单：");
				flag = false;
			}
		while (!flag);
	}

	public void sendBirthCust() {
		System.out.println("购物管理系统 > 生日问候\n\n");
		System.out.print("请输入今天的日期(月/日<用两位表示>)：");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		System.out.println(s);
		String s1 = "";
		boolean flag = false;
		for (int i = 0; i < custBirth.length; i++)
			if (custBirth[i] != null && custBirth[i].equals(s)) {
				s1 = (new StringBuilder()).append(s1).append(custNo[i]).append(
						"\n").toString();
				flag = true;
			}

		if (flag) {
			System.out.println("过生日的会员是：");
			System.out.println(s1);
			System.out.println("恭喜！获赠MP3一个！");
		} else {
			System.out.println("今天没有过生日的会员！");
		}
		returnLastMenu();
	}

	public void sendLuckyCust() {
		System.out.println("购物管理系统 > 幸运抽奖\n\n");
		System.out.print("是否开始（y/n）：");
		Scanner scanner = new Scanner(System.in);
		if (scanner.next().equals("y")) {
			int i = (int) (Math.random() * 10D);
			boolean flag = false;
			String s = "";
			for (int k = 0; k < custNo.length && custNo[k] != 0; k++) {
				int j = (custNo[k] / 100) % 10;
				if (j == i) {
					s = (new StringBuilder()).append(s).append(custNo[k])
							.append("\t").toString();
					flag = true;
				}
			}

			if (flag)
				System.out.println((new StringBuilder()).append("幸运客户获赠MP3：")
						.append(s).toString());
			else
				System.out.println("无幸运客户。");
		}
		returnLastMenu();
	}

	public void sendGoldenCust() {
		System.out.println("购物管理系统 > 幸运大放送\n\n");
		int i = 0;
		int j = custScore[0];
		for (int k = 0; k < custScore.length && custScore[k] != 0; k++)
			if (custScore[k] > j) {
				j = custScore[k];
				i = k;
			}

		System.out.println((new StringBuilder()).append("具有最高积分的会员是： ").append(
				custNo[i]).append("\t").append(custBirth[i]).append("\t")
				.append(custScore[i]).toString());
		Gift gift = new Gift();
		gift.name = "苹果笔记本电脑";
		gift.price = 12000D;
		System.out.print("恭喜！获赠礼品： ");
		System.out.println(gift);
		returnLastMenu();
	}

	public String goodsName[];
	public double goodsPrice[];
	public int custNo[];
	public String custBirth[];
	public int custScore[];
}