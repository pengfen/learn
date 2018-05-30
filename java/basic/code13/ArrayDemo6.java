package com.test;

import java.util.Arrays;

/*
 * Arrays:针对数组进行操作的工具类。比如说排序和查找。
 * 1:public static String toString(int[] a) 把数组转成字符串
 * 2:public static void sort(int[] a) 对数组进行排序
 * 3:public static int binarySearch(int[] a,int key) 二分查找
 */
public class ArrayDemo6 {
	public static void main(String[] args) {
		// 定义一个数组
		int[] arr = { 24, 69, 80, 57, 13 };

		// public static String toString(int[] a) 把数组转成字符串
		System.out.println("排序前：" + Arrays.toString(arr));

		// public static void sort(int[] a) 对数组进行排序
		Arrays.sort(arr);
		System.out.println("排序后：" + Arrays.toString(arr));

		// [13, 24, 57, 69, 80]
		// public static int binarySearch(int[] a,int key) 二分查找
		System.out.println("binarySearch:" + Arrays.binarySearch(arr, 57));
		System.out.println("binarySearch:" + Arrays.binarySearch(arr, 577));
	}
}

/*
 * public static String toString(int[] a)
 * public static void sort(int[] a) 底层是快速排序 知道就可以了
 * public static int binarySearch(int[] a, int key)
 * 
 * 开发原则 只要是对象 我们就要判断该对象是否为null
 * 
 * int[] arr = {24, 69, 80, 57, 13};
 * System.out.println("排序前 " + Arrays.toString(arr));
 * 
 * public static String toString(int[] a) {
 *     // a --- arr --- {24, 69, 80, 57, 13}
 *     
 *     if (a == null) return "null"; // 说明数组对象不存在
 *     int iMax = a.length - 1; // iMax = 4;
 *     if (iMax == -1) return "[]"; // 说明数组存在 但是没有元素
 *     
 *     StringBuilder b = new StringBuilder();
 *     b.append('['); // "["
 *     for (int i = 0; ; i ++) {
 *         b.append(a[i]); // "[24, 69, 80, 57, 13"
 *         if (i == iMax) 
 *             // "[24, 69, 80, 57, 13]"
 *             return b.append(']').toString();
 *         b.append(", "); // "[24, 69, 80, 57, "   
 *     }
 * }
 * 
 * ----------------------------------------------
 * 
 * int[] arr = {13, 24, 57, 69, 80}
 * System.out.println("binarySearch" + Arrays.binarySearch(arr, 577));
 * 
 * public static int binarySearch(int[] a, int key) {
 *     // a --- arr --- {13, 24, 57, 69, 80}
 *     // key --- 577
 *     return binarySearch(a, 0, a.length, key);
 * }
 * 
 * private static int binarySearch0(int[] a, int fromIndex, int toIndex, int key) {
 *     // a --- arr --- {13, 24, 57, 69, 80}
 *     // fromIndex --- 0
 *     // toIndex --- 5
 *     // key --- 577
 *     
 *     int low = fromIndex; // low = 0
 *     int high = toIndex - 1; // high = 4
 *     
 *     while (low <= high) {
 *         int mid = (low + high) >>> 1; // mid = 2; mid = 3; mid = 4
 *         int midVal = a[mid]; // midVal = 57, midVal = 69, midVal = 80
 *         
 *         if (midVal < key) 
 *             low = mid + 1; // low = 3, low = 4, low = 5
 *         else if (midVal > key)
 *             high = mid -1;
 *         else 
 *             return mid; // key found
 *     }
 *     return - (low + 1); // key not found
 * }
 */