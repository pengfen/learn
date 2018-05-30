package com.test;

/*
 * 数组排序之冒泡排序：
 * 		相邻元素两两比较，大的往后放，第一次完毕，最大值出现在了最大索引处
 */
public class ArrayDemo {
	public static void main(String[] args) {
		// 定义一个数组
		int[] arr = { 24, 69, 80, 57, 13 };
		System.out.println("排序前：");
		printArray(arr);

		/*
		// 第一次比较
		// arr.length - 1是为了防止数据越界
		// arr.length - 1 - 0是为了减少比较的次数
		for (int x = 0; x < arr.length - 1 - 0; x++) {
			if (arr[x] > arr[x + 1]) {
				int temp = arr[x];
				arr[x] = arr[x + 1];
				arr[x + 1] = temp;
			}
		}
		System.out.println("第一次比较后：");
		printArray(arr);

		// 第二次比较
		// arr.length - 1是为了防止数据越界
		// arr.length - 1 - 1是为了减少比较的次数
		for (int x = 0; x < arr.length - 1 - 1; x++) {
			if (arr[x] > arr[x + 1]) {
				int temp = arr[x];
				arr[x] = arr[x + 1];
				arr[x + 1] = temp;
			}
		}
		System.out.println("第二次比较后：");
		printArray(arr);

		// 第三次比较
		// arr.length - 1是为了防止数据越界
		// arr.length - 1 - 2是为了减少比较的次数
		for (int x = 0; x < arr.length - 1 - 2; x++) {
			if (arr[x] > arr[x + 1]) {
				int temp = arr[x];
				arr[x] = arr[x + 1];
				arr[x + 1] = temp;
			}
		}
		System.out.println("第三次比较后：");
		printArray(arr);

		// 第四次比较
		// arr.length - 1是为了防止数据越界
		// arr.length - 1 - 3是为了减少比较的次数
		for (int x = 0; x < arr.length - 1 - 3; x++) {
			if (arr[x] > arr[x + 1]) {
				int temp = arr[x];
				arr[x] = arr[x + 1];
				arr[x + 1] = temp;
			}
		}
		System.out.println("第四次比较后：");
		printArray(arr);
		*/

		// 既然听懂了，那么上面的代码就是排序代码
		// 而上面的代码重复度太高了，所以用循环改进
		// for (int y = 0; y < 4; y++) {
		// for (int x = 0; x < arr.length - 1 - y; x++) {
		// if (arr[x] > arr[x + 1]) {
		// int temp = arr[x];
		// arr[x] = arr[x + 1];
		// arr[x + 1] = temp;
		// }
		// }
		// }

		/*
		// 由于我们知道比较的次数是数组长度-1次，所以改进最终版程序
		for (int x = 0; x < arr.length - 1; x++) {
			for (int y = 0; y < arr.length - 1 - x; y++) {
				if (arr[y] > arr[y + 1]) {
					int temp = arr[y];
					arr[y] = arr[y + 1];
					arr[y + 1] = temp;
				}
			}
		}
		System.out.println("排序后：");
		printArray(arr);
		*/
		
		//由于我可能有多个数组要排序，所以我要写成方法
		bubbleSort(arr);
		System.out.println("排序后：");
		printArray(arr);
	}
	
	//冒泡排序代码
	public static void bubbleSort(int[] arr){
		for (int x = 0; x < arr.length - 1; x++) {
			for (int y = 0; y < arr.length - 1 - x; y++) {
				if (arr[y] > arr[y + 1]) {
					int temp = arr[y];
					arr[y] = arr[y + 1];
					arr[y + 1] = temp;
				}
			}
		}
	}

	// 遍历功能
	public static void printArray(int[] arr) {
		System.out.print("[");
		for (int x = 0; x < arr.length; x++) {
			if (x == arr.length - 1) {
				System.out.print(arr[x]);
			} else {
				System.out.print(arr[x] + ", ");
			}
		}
		System.out.println("]");
	}
}