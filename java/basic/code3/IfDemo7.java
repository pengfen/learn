package com.demo;

import java.util.Scanner;

/*
 * ����if���ֱ��ʺ���ʲô������
 *    ��ʽ1 �ʺ��������ж�
 *    ��ʽ2 �ʺ��������ж�
 *    ��ʽ3 �ʺ�������ж�
 *    
 * ���� ����¼��x��ֵ �����y��ֵ�����
 *    x >= 3        y = 2x + 1;
 *    -1 <= x < 3   y = 2x;
 *    x <= -1       y = 2x - 1;
 *    
 * ����
 *    ��������Ҫ����¼�� ���Ա���ʹ��Scanner
 *    �����������ж� ��������ѡ��if����ʽ3
 */
public class IfDemo7 {
	public static void main(String[] args) {
		// ��������¼�����
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������x��ֵ: ");
		int x = sc.nextInt();
		
		// ����һ��y
		int y;
		
		// ��if����ʽ3�����ж�
		if (x >= 3) {
			y = 2 * x + 1;
		} else if (x >= -1 && x < 3) {
			y = 2 * x;
		} else {
			y = 2 * x - 1;
		}
		
		System.out.println("y : " + y);
	}
}
