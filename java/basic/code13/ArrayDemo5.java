package com.test;

/*
 * ע�⣺��������������������ġ�
 * ��Ϊ���鱾��������ģ�������������µĲ��Ҳ���ʹ�ö��ֲ��ҡ�
 * �������������ˣ������������ʱ���Ѿ��ı�������ԭʼ��Ԫ��������
 */
public class ArrayDemo5 {
	public static void main(String[] args) {
		// ��������
		int[] arr = { 24, 69, 80, 57, 13 };

		// ������
		bubbleSort(arr);
		// �����
		int index = getIndex(arr, 80);
		System.out.println("index:" + index);
	}

	// ð���������
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

	// ���ֲ���
	public static int getIndex(int[] arr, int value) {
		// ���������������С����
		int max = arr.length - 1;
		int min = 0;

		// ������м�����
		int mid = (max + min) / 2;

		// ���м�������ֵ��Ҫ���ҵ�ֵ���бȽ�
		while (arr[mid] != value) {
			if (arr[mid] > value) {
				max = mid - 1;
			} else if (arr[mid] < value) {
				min = mid + 1;
			}

			// �����ж�
			if (min > max) {
				return -1;
			}

			mid = (max + min) / 2;
		}

		return mid;
	}
}
