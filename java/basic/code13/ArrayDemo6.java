package com.test;

import java.util.Arrays;

/*
 * Arrays:���������в����Ĺ����ࡣ����˵����Ͳ��ҡ�
 * 1:public static String toString(int[] a) ������ת���ַ���
 * 2:public static void sort(int[] a) �������������
 * 3:public static int binarySearch(int[] a,int key) ���ֲ���
 */
public class ArrayDemo6 {
	public static void main(String[] args) {
		// ����һ������
		int[] arr = { 24, 69, 80, 57, 13 };

		// public static String toString(int[] a) ������ת���ַ���
		System.out.println("����ǰ��" + Arrays.toString(arr));

		// public static void sort(int[] a) �������������
		Arrays.sort(arr);
		System.out.println("�����" + Arrays.toString(arr));

		// [13, 24, 57, 69, 80]
		// public static int binarySearch(int[] a,int key) ���ֲ���
		System.out.println("binarySearch:" + Arrays.binarySearch(arr, 57));
		System.out.println("binarySearch:" + Arrays.binarySearch(arr, 577));
	}
}

/*
 * public static String toString(int[] a)
 * public static void sort(int[] a) �ײ��ǿ������� ֪���Ϳ�����
 * public static int binarySearch(int[] a, int key)
 * 
 * ����ԭ�� ֻҪ�Ƕ��� ���Ǿ�Ҫ�жϸö����Ƿ�Ϊnull
 * 
 * int[] arr = {24, 69, 80, 57, 13};
 * System.out.println("����ǰ " + Arrays.toString(arr));
 * 
 * public static String toString(int[] a) {
 *     // a --- arr --- {24, 69, 80, 57, 13}
 *     
 *     if (a == null) return "null"; // ˵��������󲻴���
 *     int iMax = a.length - 1; // iMax = 4;
 *     if (iMax == -1) return "[]"; // ˵��������� ����û��Ԫ��
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