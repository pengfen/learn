package com.demo;
/**
 * ++ -- ��ϰ��
 * 
 * ��һ��
 * int a = 10;
 * int b = 10;
 * int c = 10;
 * 
 * a = b++;
 * c = --a;
 * b = ++a;
 * a = c--;
 * ��ֱ����� a,b,c ��ֵ
 * 
 * �ڶ���
 * int x = 4;
 * int y = (x++)+(++x)+(x*10)
 * ��ֱ����� x,y ��ֵ
 *
 */
public class OperatorDemo4 {
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		int c = 10;
		
		a = b++; // a = 10, b = 11, c = 10
		c = --a; // a = 9, b = 11, c = 9
		b = ++a; // a = 10, b = 10, c = 9
		a = c--; // a = 9, b = 10, c = 8
		
		System.out.println("a : " + a); // 9
		System.out.println("b : " + b); // 10
		System.out.println("c : " + c); // 8
		System.out.println("----------------------");
		
		int x = 4;
		int y = (x++)+(++x)+(x*10); // 4 + 6 + 60
		
		System.out.println("x : " + x); // 6
		System.out.println("y : " + y); // 70
	}
}
