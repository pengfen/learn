package com.demo;
/**
 * && �� &������ ͬ�� || �� | ������
 *    ���ս��һ��
 *    &&���ж�·Ч�� �����false �ұ߲�ִ��
 *    
 * �����г��õ��߼������ && || !
 *
 */
public class LogicDemo2 {
	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		int c = 5;
		
		// && ˫��
		System.out.println((a > b) && (a > c)); // false && false = false
		System.out.println((a > b) && (a < c)); // false && true = false
		System.out.println((a < b) && (a > c)); // true && false = false
		System.out.println((a < b) && (a < c)); // true && true = true
		System.out.println("-------------------------------");
		
		int x = 3;
		int y = 4;
		
		// boolean b1 = ((x++ == 3) & (y++ == 4));
		// boolean b1 = ((x++ == 3) && (y++ == 4));
		// boolean b1 = ((++x == 3) && (y++ == 4));
		boolean b1 = ((++x == 3) && (y++ == 4));
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		System.out.println(b1);
	}
}