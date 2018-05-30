package com.test.sort;

/*
 * 归并操作(merge)，也叫归并算法，指的是将两个已经排序的序列合并成一个序列的操作。 　　
 * 如设有数列{6，202，100，301，38，8，1} 　　
 * 初始状态： [6] [202] [100] [301] [38] [8] [1] 比较次数 　　
 * i=1 [6 202 ] [ 100 301] [ 8 38] [ 1 ]　3 　　
 * i=2 [ 6 100 202 301 ] [ 1 8 38 ]　4 　　
 * i=3　[ 1 6 8 38 100 202 301 ] 4 
 */
public class MergeSort {
	public static void sort(int[] data) {
		int[] temp = new int[data.length];
		mergeSort(data, temp, 0, data.length - 1);
	}

	private static void mergeSort(int[] data, int[] temp, int l, int r) {
		int mid = (l + r) / 2;
		if (l == r)
			return;
		mergeSort(data, temp, l, mid);
		mergeSort(data, temp, mid + 1, r);

		for (int i = l; i <= r; i++) {
			temp[i] = data[i];
		}
		int i1 = l;
		int i2 = mid + 1;
		for (int cur = l; cur <= r; cur++) {
			if (i1 == mid + 1)
				data[cur] = temp[i2++];
			else if (i2 > r)
				data[cur] = temp[i1++];
			else if (temp[i1] < temp[i2])
				data[cur] = temp[i1++];
			else

				data[cur] = temp[i2++];
		}
	}
}

