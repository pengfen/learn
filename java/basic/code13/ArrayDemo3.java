package com.test;

/*
 * ���ַ����е��ַ���������
 * 		������"dacgebf"
 * 		�����"abcdefg"
 * 
 * ������
 * 		A:����һ���ַ���
 * 		B:���ַ���ת��Ϊ�ַ�����
 * 		C:���ַ������������
 * 		D:���������ַ�����ת���ַ���
 * 		E:��������ַ���
 */
public class ArrayDemo3 {
	public static void main(String[] args) {
		// ����һ���ַ���
		String s = "dacgebf";

		// ���ַ���ת��Ϊ�ַ�����
		char[] chs = s.toCharArray();

		// ���ַ������������
		bubbleSort(chs);

		//���������ַ�����ת���ַ���
		String result = String.valueOf(chs);
		
		//��������ַ���
		System.out.println("result:"+result);
	}

	// ð������
	public static void bubbleSort(char[] chs) {
		for (int x = 0; x < chs.length - 1; x++) {
			for (int y = 0; y < chs.length - 1 - x; y++) {
				if (chs[y] > chs[y + 1]) {
					char temp = chs[y];
					chs[y] = chs[y + 1];
					chs[y + 1] = temp;
				}
			}
		}
	}
}

