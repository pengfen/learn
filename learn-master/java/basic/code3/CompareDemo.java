package com.demo;
/**
 * �Ƚ������ == != > >= < <=
 * 
 * �ص� ������Ĳ����Ǽ򵥻��Ǹ��� �����boolean����
 * 
 * ע������ "=="����д��"="
 *
 */
public class CompareDemo {
	public static void main(String[] args) {
		int x = 3;
		int y = 4;
		int z = 3;
		
		System.out.println(x == y);
		System.out.println(x == z);
		System.out.println((x + y) == (x + z));
		System.out.println("------------------------");
		
		System.out.println(x != y);
		System.out.println(x > y);
		System.out.println(x >= y);
		System.out.println(x < y);
		System.out.println(x <= y);
		System.out.println("---------------------------");
		
		int a = 10;
		int b = 20;
		
		// boolean flag = (a == b);
		// boolean flag = (a = b); // ������������ �����ݵ�����
		// System.out.println(flag);
		
		int c = (a = b); // ��b��ֵ��a Ȼ���a������
		System.out.println(c);
	}
}
