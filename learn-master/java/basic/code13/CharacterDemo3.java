package com.test;

import java.util.Scanner;

/*
 * ͳ��һ���ַ����д�д��ĸ�ַ���Сд��ĸ�ַ��������ַ����ֵĴ�����(�����������ַ�)
 * 
 * ������
 * 		A:��������ͳ�Ʊ�����
 * 			int bigCont=0;
 * 			int smalCount=0;
 * 			int numberCount=0;
 * 		B:����¼��һ���ַ�����
 * 		C:���ַ���ת��Ϊ�ַ����顣
 * 		D:�����ַ������ȡ��ÿһ���ַ�
 * 		E:�жϸ��ַ���
 * 			��д	bigCount++;
 * 			Сд	smalCount++;
 * 			����	numberCount++;
 * 		F:����������
 */
public class CharacterDemo3 {
	public static void main(String[] args) {
		// ��������ͳ�Ʊ�����
		int bigCount = 0;
		int smallCount = 0;
		int numberCount = 0;

		// ����¼��һ���ַ�����
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		String line = sc.nextLine();

		// ���ַ���ת��Ϊ�ַ����顣
		char[] chs = line.toCharArray();

		// ���ַ������ȡ��ÿһ���ַ�
		for (int x = 0; x < chs.length; x++) {
			char ch = chs[x];

			// �жϸ��ַ�
			if (Character.isUpperCase(ch)) {
				bigCount++;
			} else if (Character.isLowerCase(ch)) {
				smallCount++;
			} else if (Character.isDigit(ch)) {
				numberCount++;
			}
		}

		// ����������
		System.out.println("��д��ĸ��" + bigCount + "��");
		System.out.println("Сд��ĸ��" + smallCount + "��");
		System.out.println("�����ַ���" + numberCount + "��");
	}
}
