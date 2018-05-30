package com.test;

/*
 * 通过debug查看程序执行流程
 * 请大家也做一遍。
 */
public class ArgsDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("a:" + a + ",b:" + b);
		change(a, b);
		System.out.println("a:" + a + ",b:" + b);

		int[] arr = { 1, 2, 3, 4, 5 };
		change(arr);
		System.out.println(arr[1]);
	}

	public static void change(int a, int b) {
		System.out.println("a:" + a + ",b:" + b);
		a = b;
		b = a + b;
		System.out.println("a:" + a + ",b:" + b);
	}

	public static void change(int[] arr) {
		for (int x = 0; x < arr.length; x++) {
			if (arr[x] % 2 == 0) {
				arr[x] *= 2;
			}
		}
	}
}
