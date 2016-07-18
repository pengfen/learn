package com.test;

import java.util.Scanner;

/*
 * 这时猜数字小游戏的代码
 */
public class GuessNumberDemo {
	private GuessNumberDemo() {
	}

	public static void start() {
		// 产生一个随机数
		int number = (int) (Math.random() * 100) + 1;
		// Math.random() [0, 1) double类型
		// Math.random() * 100 [0, 100)
		// (Math.random() * 100) + 1 [1, 100]
		// (int) 将double类型转成int类型

		while (true) {
			// 键盘录入数据
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入你要猜的数据(1-100)：");
			int guessNumber = sc.nextInt();

			// 判断
			if (guessNumber > number) {
				System.out.println("你猜的数据" + guessNumber + "大了");
			} else if (guessNumber < number) {
				System.out.println("你猜的数据" + guessNumber + "小了");
			} else {
				System.out.println("恭喜你，猜中了");
				break;
			}
		}
	}
}
