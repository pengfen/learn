package com.test;

/*
 * 把字符串中的字符进行排序。
 * 		举例："dacgebf"
 * 		结果："abcdefg"
 * 
 * 分析：
 * 		A:定义一个字符串
 * 		B:把字符串转换为字符数组
 * 		C:把字符数组进行排序
 * 		D:把排序后的字符数组转成字符串
 * 		E:输出最后的字符串
 */
public class ArrayDemo3 {
	public static void main(String[] args) {
		// 定义一个字符串
		String s = "dacgebf";

		// 把字符串转换为字符数组
		char[] chs = s.toCharArray();

		// 把字符数组进行排序
		bubbleSort(chs);

		//把排序后的字符数组转成字符串
		String result = String.valueOf(chs);
		
		//输出最后的字符串
		System.out.println("result:"+result);
	}

	// 冒泡排序
	public static void bubbleSort(char[] chs) {
		for (int x = 0; x < chs.length - 1; x++) {
			for (int y = 0; y < chs.length - 1 - x; y++) {
				if (chs[y] > chs[y + 1]) {
					char temp = chs[y];
					chs[y] = chs[y + 1];
					chs[y + 1] = temp;
				}
			}
		}
	}
}

