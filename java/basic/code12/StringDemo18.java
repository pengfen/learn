package com.test;

import java.util.Scanner;

/*
 * �ַ�����ת
 * ����������¼�롱abc��		
 * ����������cba��
 * 
 * ������
 * 		A:����¼��һ���ַ���
 * 		B:����һ�����ַ���
 * 		C:���ű����ַ������õ�ÿһ���ַ�
 * 			a:length()��charAt()���
 * 			b:���ַ���ת���ַ�����
 * 		D:�����ַ�����ÿһ���ַ�ƴ������
 * 		E:����´�
 */
public class StringDemo18 {
	public static void main(String[] args) {
		// ����¼��һ���ַ���
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		String line = sc.nextLine();

		/*
		// ����һ�����ַ���
		String result = "";

		// ���ַ���ת���ַ�����
		char[] chs = line.toCharArray();

		// ���ű����ַ������õ�ÿһ���ַ�
		for (int x = chs.length - 1; x >= 0; x--) {
			// �����ַ�����ÿһ���ַ�ƴ������
			result += chs[x];
		}

		// ����´�
		System.out.println("��ת��Ľ���ǣ�" + result);
		*/

		// �Ľ�Ϊ����ʵ��
		String s = myReverse(line);
		System.out.println("ʵ�ֹ��ܺ�Ľ���ǣ�" + s);
	}

	/*
	 * ������ȷ�� ����ֵ���ͣ�String �����б�String
	 */
	public static String myReverse(String s) {
		// ����һ�����ַ���
		String result = "";

		// ���ַ���ת���ַ�����
		char[] chs = s.toCharArray();

		// ���ű����ַ������õ�ÿһ���ַ�
		for (int x = chs.length - 1; x >= 0; x--) {
			// �����ַ�����ÿһ���ַ�ƴ������
			result += chs[x];
		}
		return result;
	}
}
