package com.test;

/*
 * ���󣺰������е����ݰ���ָ������ʽƴ�ӳ�һ���ַ���
 * ������
 * 		int[] arr = {1,2,3};	
 * ��������
 *		"[1, 2, 3]"
 * ������
 * 		A:����һ���ַ�������ֻ��������Ϊ��
 * 		B:�Ȱ��ַ���ƴ��һ��"["
 * 		C:����int���飬�õ�ÿһ��Ԫ��
 * 		D:���жϸ�Ԫ���Ƿ�Ϊ���һ��
 * 			�ǣ���ֱ��ƴ��Ԫ�غ�"]"
 * 			���ǣ���ƴ��Ԫ�غͶ����Լ��ո�
 * 		E:���ƴ�Ӻ���ַ���
 * 
 * �Ѵ����ù���ʵ�֡�
 */
public class StringDemo17 {
	public static void main(String[] args) {
		// ǰ���������Ѿ�����
		int[] arr = { 1, 2, 3 };

		// дһ�����ܣ�ʵ�ֽ��
		String result = arrayToString(arr);
		System.out.println("���ս���ǣ�" + result);
	}

	/*
	 * ������ȷ�� ����ֵ���ͣ�String �����б�int[] arr
	 */
	public static String arrayToString(int[] arr) {
		// ����һ���ַ���
		String s = "";

		// �Ȱ��ַ���ƴ��һ��"["
		s += "[";

		// ����int���飬�õ�ÿһ��Ԫ��
		for (int x = 0; x < arr.length; x++) {
			// ���жϸ�Ԫ���Ƿ�Ϊ���һ��
			if (x == arr.length - 1) {
				// ��ֱ��ƴ��Ԫ�غ�"]"
				s += arr[x];
				s += "]";
			} else {
				// ��ƴ��Ԫ�غͶ����Լ��ո�
				s += arr[x];
				s += ", ";
			}
		}

		return s;
	}
}