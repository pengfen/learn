package com.test.sort;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 3, 1, 4 };
		System.out.println("排序前：" + Arrays.toString(arr));
		// InsertSort.sort(arr);
		// BubbleSort.sort(arr);
		// SelectionSort.sort(arr);
		// ShellSort.sort(arr);
		// QuickSort.sort(arr);
		// MergeSort.sort(arr);
		// HeapSort.sort(arr);
		System.out.println("排序后：" + Arrays.toString(arr));
	}

	/*
	 * 交换数组中的两个元素
	 */
	public static void swap(int[] data, int i, int j) {
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}
}

