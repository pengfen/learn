package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 * 键盘录入多个数据，以0结束，要求在控制台输出这多个数据中的最大值
 * 
 * 分析：
 * 		A:创建键盘录入数据对象
 * 		B:键盘录入多个数据,我们不知道多少个，所以用集合存储
 * 		C:以0结束,这个简单，只要键盘录入的数据是0，我就不继续录入数据了
 * 		D:把集合转成数组
 * 		E:对数组排序
 * 		F:获取该数组中的最大索引的值
 */
public class ArrayListDemo11 {
	public static void main(String[] args) {
		// 创建键盘录入数据对象
		Scanner sc = new Scanner(System.in);

		// 键盘录入多个数据,我们不知道多少个，所以用集合存储
		ArrayList<Integer> array = new ArrayList<Integer>();

		// 以0结束,这个简单，只要键盘录入的数据是0，我就不继续录入数据了
		while (true) {
			System.out.println("请输入数据：");
			int number = sc.nextInt();
			if (number != 0) {
				array.add(number);
			} else {
				break;
			}
		}

		// 把集合转成数组
		// public <T> T[] toArray(T[] a)
		Integer[] i = new Integer[array.size()];
		// Integer[] ii = array.toArray(i);
		array.toArray(i);
		// System.out.println(i);
		// System.out.println(ii);

		// 对数组排序
		// public static void sort(Object[] a)
		Arrays.sort(i);

		// 获取该数组中的最大索引的值
		System.out.println("数组是：" + arrayToString(i) + "最大值是:"
				+ i[i.length - 1]);
	}

	public static String arrayToString(Integer[] i) {
		StringBuilder sb = new StringBuilder();

		sb.append("[");
		for (int x = 0; x < i.length; x++) {
			if (x == i.length - 1) {
				sb.append(i[x]);
			} else {
				sb.append(i[x]).append(", ");
			}
		}
		sb.append("]");

		return sb.toString();
	}
}
