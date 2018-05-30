package com.test;

/*
 * 注意：下面这种做法是有问题的。
 * 因为数组本身是无序的，所以这种情况下的查找不能使用二分查找。
 * 所以你先排序了，但是你排序的时候已经改变了我最原始的元素索引。
 */
public class ArrayDemo5 {
	public static void main(String[] args) {
		// 定义数组
		int[] arr = { 24, 69, 80, 57, 13 };

		// 先排序
		bubbleSort(arr);
		// 后查找
		int index = getIndex(arr, 80);
		System.out.println("index:" + index);
	}

	// 冒泡排序代码
	public static void bubbleSort(int[] arr) {
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

	// 二分查找
	public static int getIndex(int[] arr, int value) {
		// 定义最大索引，最小索引
		int max = arr.length - 1;
		int min = 0;

		// 计算出中间索引
		int mid = (max + min) / 2;

		// 拿中间索引的值和要查找的值进行比较
		while (arr[mid] != value) {
			if (arr[mid] > value) {
				max = mid - 1;
			} else if (arr[mid] < value) {
				min = mid + 1;
			}

			// 加入判断
			if (min > max) {
				return -1;
			}

			mid = (max + min) / 2;
		}

		return mid;
	}
}
