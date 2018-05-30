package com.test;

import java.util.Arrays;

/*
 * 我有如下一个字符串:"91 27 46 38 50"
 * 请写代码实现最终输出结果是："27 38 46 50 91"
 * 
 * 分析：
 * 		A:定义一个字符串
 * 		B:把字符串进行分割，得到一个字符串数组
 * 		C:把字符串数组变换成int数组
 * 		D:对int数组排序
 * 		E:把排序后的int数组在组装成一个字符串
 * 		F:输出字符串
 */
public class RegexDemo7 {
	public static void main(String[] args) {
		// 定义一个字符串
		String s = "91 27 46 38 50";

		// 把字符串进行分割，得到一个字符串数组
		String[] strArray = s.split(" ");

		// 把字符串数组变换成int数组
		int[] arr = new int[strArray.length];

		for (int x = 0; x < arr.length; x++) {
			arr[x] = Integer.parseInt(strArray[x]);
		}

		// 对int数组排序
		Arrays.sort(arr);

		// 把排序后的int数组在组装成一个字符串
		StringBuilder sb = new StringBuilder();
		for (int x = 0; x < arr.length; x++) {
			sb.append(arr[x]).append(" ");
		}
		//转化为字符串
		String result = sb.toString().trim();
		
		//输出字符串
		System.out.println("result:"+result);
	}
}
