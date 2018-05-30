package com.test;

/*
 * ������ƴ�ӳ�һ���ַ���
 */
public class StringBufferDemo8 {
	public static void main(String[] args) {
		// ����һ������
		int[] arr = { 44, 33, 55, 11, 22 };

		// ���幦��
		// ��ʽ1����String��ƴ�ӵķ�ʽ
		String s1 = arrayToString(arr);
		System.out.println("s1:" + s1);

		// ��ʽ2:��StringBuffer��ƴ�ӵķ�ʽ
		String s2 = arrayToString2(arr);
		System.out.println("s2:" + s2);
	}

	// ��StringBuffer��ƴ�ӵķ�ʽ
	public static String arrayToString2(int[] arr) {
		StringBuffer sb = new StringBuffer();

		sb.append("[");
		for (int x = 0; x < arr.length; x++) {
			if (x == arr.length - 1) {
				sb.append(arr[x]);
			} else {
				sb.append(arr[x]).append(", ");
			}
		}
		sb.append("]");

		return sb.toString();
	}

	// ��String��ƴ�ӵķ�ʽ
	public static String arrayToString(int[] arr) {
		String s = "";

		s += "[";
		for (int x = 0; x < arr.length; x++) {
			if (x == arr.length - 1) {
				s += arr[x];
			} else {
				s += arr[x];
				s += ", ";
			}
		}
		s += "]";

		return s;
	}
}
