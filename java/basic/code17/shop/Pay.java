package com.test.shop;

import java.util.Scanner;

/**
 * 购物付款
 * 
 * @author Administrator
 * 
 */
public class Pay {

	public Pay() {
	}

	public void setData(String as[], double ad[], int ai[], String as1[],
			int ai1[]) {
		goodsName = as;
		goodsPrice = ad;
		custNo = ai;
		custBirth = as1;
		custScore = ai1;
	}

	public double getDiscount(int i, int ai[], int ai1[]) {
		int j = -1;
		int k = 0;
		do {
			if (k >= ai.length)
				break;
			if (i == ai[k]) {
				j = k;
				break;
			}
			k++;
		} while (true);
		double d;
		if (ai1[j] < 1000)
			d = 0.94999999999999996D;
		else if (1000 <= ai1[j] && ai1[j] < 2000)
			d = 0.90000000000000002D;
		else if (2000 <= ai1[j] && ai1[j] < 3000)
			d = 0.84999999999999998D;
		else if (3000 <= ai1[j] && ai1[j] < 4000)
			d = 0.80000000000000004D;
		else if (4000 <= ai1[j] && ai1[j] < 6000)
			d = 0.75D;
		else if (6000 <= ai1[j] && ai1[j] < 8000)
			d = 0.69999999999999996D;
		else
			d = 0.59999999999999998D;
		return d;
	}

	public void calcPrice() {
		String s2 = "";
		double d1 = 0.0D;
		double d2 = 0.0D;
		System.out.println("购物管理系统 > 购物结算\n\n");
		System.out.println("*************************************");
		System.out.println("请选择购买的商品编号：");
		int l = 0;
		double d4 = 0;
		for (; l < goodsName.length && goodsName[l] != null; l++) {
			d4++;
			System.out.println((new StringBuilder()).append(d4).append(": ")
					.append(goodsName[l]).append("\t").toString());
		}

		System.out.println("*************************************\n");
		Scanner scanner = new Scanner(System.in);
		System.out.print("\t请输入会员号：");
		int i = scanner.nextInt();
		d4 = getDiscount(i, custNo, custScore);
		String s1;
		do {
			System.out.print("\t请输入商品编号：");
			int j = scanner.nextInt();
			System.out.print("\t请输入数目：");
			int k = scanner.nextInt();
			double d = goodsPrice[j - 1];
			String s = goodsName[j - 1];
			d1 += d * (double) k;
			s2 = (new StringBuilder()).append(s2).append("\n").append(s)
					.append("\t").append("￥").append(d).append("\t\t")
					.append(k).append("\t\t").append("￥")
					.append(d * (double) k).append("\t").toString();
			System.out.print("\t是否继续（y/n）");
			s1 = scanner.next();
		} while (s1.equals("y"));
		d2 = d1 * d4;
		System.out.println("\n");
		System.out.println("＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊消费清单＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊");
		System.out.println("物品\t\t单价\t\t个数\t\t金额\t");
		System.out.print(s2);
		System.out.println((new StringBuilder()).append("\n折扣：\t").append(d4)
				.toString());
		System.out.println((new StringBuilder()).append("金额总计:\t￥").append(d2)
				.toString());
		System.out.print("实际交费:\t￥");
		double d3 = scanner.nextDouble();
		System.out.println((new StringBuilder()).append("找钱:\t￥").append(
				d3 - d2).toString());
		int i1 = ((int) d2 / 100) * 3;
		int j1 = 0;
		do {
			if (j1 >= custNo.length)
				break;
			if (custNo[j1] == i) {
				custScore[j1] = custScore[j1] + i1;
				System.out.println((new StringBuilder()).append("本次购物所获的积分是： ")
						.append(i1).toString());
				break;
			}
			j1++;
		} while (true);
		System.out.print("\n请'n'返回上一级菜单:");
		if (scanner.next().equals("n")) {
			Menu menu = new Menu();
			menu.setData(goodsName, goodsPrice, custNo, custBirth, custScore);
			menu.showMainMenu();
		}
	}

	public String goodsName[];
	public double goodsPrice[];
	public int custNo[];
	public String custBirth[];
	public int custScore[];
}
