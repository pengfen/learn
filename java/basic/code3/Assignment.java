package com.demo;
/**
 * ��ֵ�����
 * 
 *    �����ĸ�ֵ����� = �� = �ұߵ����ݸ�ֵ�����
 *    
 *    ��չ�ĸ�ֵ����� += -= *= /= %=  += ����ߺ��ұ����ӷ� Ȼ��ֵ�����
 *
 */
public class Assignment {
	public static void main(String[] args) {
		// ����һ������
		int x = 10;
		
		int a, b; // �����÷�
		a = b = 10;
		System.out.println(a);
		System.out.println(b);
		System.out.println("-----------------");
		
		int y = 10; // ����һ������
		
		y += 20;
		
		System.out.println(y);
	}
}
