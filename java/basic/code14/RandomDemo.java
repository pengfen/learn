package com.test;

import java.util.Random;

/*
 * Random:产生随机数的类
 * 
 * 构造方法：
 * 		public Random():没有给种子，用的是默认种子，是当前时间的毫秒值
 *		public Random(long seed):给出指定的种子
 *
 *		给定种子后，每次得到的随机数是相同的。
 *
 * 成员方法：
 * 		public int nextInt()：返回的是int范围内的随机数
 *		public int nextInt(int n):返回的是[0,n)范围的内随机数
 */
public class RandomDemo {
	public static void main(String[] args) {
		// 创建对象
		// Random r = new Random();
		Random r = new Random(1111);

		for (int x = 0; x < 10; x++) {
			// int num = r.nextInt();
			int num = r.nextInt(100) + 1;
			System.out.println(num);
		}
	}
}

