package com.test.sort;

/*
 * ѡ���������˼·��
 * �ѵ�һ��Ԫ�����κͺ��������Ԫ�ؽ��бȽϡ�
 * ��һ�ν����󣬾ͻ�����Сֵ��������ǰ�档
 * ��������
 */
public class SelectSort {
	public static void sort(int[] data) {
		for (int x = 0; x < data.length - 1; x++) {
			for (int y = x + 1; y < data.length; y++) {
				if (data[y] < data[x]) {
					Sort.swap(data, x, y);
				}
			}
		}
	}
}
