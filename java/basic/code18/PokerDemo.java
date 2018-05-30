package com.test;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 模拟斗地主洗牌和发牌
 * 
 * 分析：
 * 		A:创建一个牌盒
 * 		B:装牌
 * 		C:洗牌
 * 		D:发牌
 * 		E:看牌
 */
public class PokerDemo {
	public static void main(String[] args) {
		// 创建一个牌盒
		ArrayList<String> array = new ArrayList<String>();

		// 装牌
		// 黑桃A,黑桃2,黑桃3,...黑桃K
		// 红桃A,...
		// 梅花A,...
		// 方块A,...
		// 定义一个花色数组
		String[] colors = { "♠", "♥", "♣", "♦" };
		// 定义一个点数数组
		String[] numbers = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"J", "Q", "K" };
		// 装牌
		for (String color : colors) {
			for (String number : numbers) {
				array.add(color.concat(number));
			}
		}
		array.add("小王");
		array.add("大王");

		// 洗牌
		Collections.shuffle(array);

		// System.out.println("array:" + array);

		// 发牌
		ArrayList<String> fengQingYang = new ArrayList<String>();
		ArrayList<String> linQingXia = new ArrayList<String>();
		ArrayList<String> liuYi = new ArrayList<String>();
		ArrayList<String> diPai = new ArrayList<String>();

		for (int x = 0; x < array.size(); x++) {
			if (x >= array.size() - 3) {
				diPai.add(array.get(x));
			} else if (x % 3 == 0) {
				fengQingYang.add(array.get(x));
			} else if (x % 3 == 1) {
				linQingXia.add(array.get(x));
			} else if (x % 3 == 2) {
				liuYi.add(array.get(x));
			}
		}

		// 看牌
		lookPoker("风清扬", fengQingYang);
		lookPoker("林青霞", linQingXia);
		lookPoker("刘意", liuYi);

		lookPoker("底牌", diPai);
	}

	public static void lookPoker(String name, ArrayList<String> array) {
		System.out.print(name + "的牌是：");
		for (String s : array) {
			System.out.print(s + " ");
		}
		System.out.println();
	}
}
