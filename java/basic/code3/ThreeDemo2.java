package com.demo;
/**
 * ��ϰ
 *    ��ȡ���������е����ֵ
 *    ��ȡ���������е����ֵ
 *    �Ƚ����������Ƿ���ͬ
 *
 */
public class ThreeDemo2 {
	public static void main(String[] args) {
		// ��ȡ���������е����ֵ
		int x = 100;
		int y = 200;
		
		int max = (x > y ? x : y);
		System.out.println("max : " + max);
		System.out.println("----------------------------");
		
		// ��ȡ���������е����ֵ
		int a = 10;
		int b = 30;
		int c = 20;
		
		// ������
		// �ȱȽ� a,b �����ֵ
		// �� a,b �����ֵ�ٺ�c���бȽ�
		int temp = ((a > b) ? a : b);
		// System.out.println(temp);
		
		// һ���㶨
		// int max2 = (a > b)?((a < c) ? a : c):((b > c) ? b : c);
		// �����������Ƽ�
		// int max2 = a > b ? a > c ? a : c : b > c ? b : c;
		// System.out.println("max2 : " + max2);
		System.out.println("------------------------------");
		
		// �Ƚ����������Ƿ���ͬ
		int m = 100;
		int n = 200;
		
		// boolean flag = (m == n) ? true : false;
		boolean flag = (m == n);
		System.out.println(flag);
	}
}
