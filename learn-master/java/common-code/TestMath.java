package com.java;

public class TestMath {
	public static void main(String[] args) {
		// 定义一个整型数组 长度为 10
		int[] nums = new int[10];
		// 通过循环给数组赋值
		for (int i = 0; i < nums.length; i ++) {
			// 产生 10 以内的随机数
			int x = (int)(Math.random() * 10);
			nums[i] = x; // 为元素赋值
		}
		// 使用 foreach 循环输出数组中的元素
		for (int num:nums) {
			System.out.println(num + " ");
		}
	}
}
