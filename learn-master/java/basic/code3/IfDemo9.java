package com.demo;
/*
 * ��ȡ���������е����ֵ
 * 
 * �ɴ˰�����Ҫ��Ϊ�˽���if����ǿ���Ƕ��ʹ�õ� �����ǿ��������Ƕ��
 */
public class IfDemo9 {
	public static void main(String[] args) {
		int a = 10;
		int b = 30;
		int c = 20;
		
		// ��Ԫʵ��
//		int temp = (a > b) ? a : b;
//		int max = (temp > c) ? temp : c;
//		System.out.println("max : " + max);
//		System.out.println("--------------------");
		
		// ��if���ʵ��
		int max;
		if (a > b) {
			if (a > c) {
				max = a;
			} else {
				max = c;
			}
		} else {
			if (b > c) {
				max = b;
			} else {
				max = c;
			}
		}
		System.out.println("max : " + max);
	}
}
