package cn.itcast_08;

import java.util.HashSet;
import java.util.Random;

/*
 * 编写一个程序，获取10个1至20的随机数，要求随机数不能重复。
 * 
 * 分析：
 * 		A:创建随机数对象
 * 		B:创建一个HashSet集合
 * 		C:判断集合的长度是不是小于10
 * 			是：就创建一个随机数添加
 * 			否：不搭理它
 * 		D:遍历HashSet集合
 */
public class HashSetDemo {
	public static void main(String[] args) {
		// 创建随机数对象
		Random r = new Random();

		// 创建一个Set集合
		HashSet<Integer> ts = new HashSet<Integer>();

		// 判断集合的长度是不是小于10
		while (ts.size() < 10) {
			int num = r.nextInt(20) + 1;
			ts.add(num);
		}

		// 遍历Set集合
		for (Integer i : ts) {
			System.out.println(i);
		}
	}
}
