package com.demo;
/**
 * ++ -- �������ʹ��
 *    ����ʹ�� ���ڲ��������ǰ��ͺ���Ч��һ�� (�����÷������ǱȽϳ�����)
 *    
 *    ��������ʹ��
 *       ���ڲ�������ǰ�� �����������Լ� Ȼ���ٲ�������
 *       ���ڲ������ĺ��� �Ȳ������� �����������Լ�
 *       
 * ���� ���ǶԱ�����������1�����Լ�1
 *
 */
public class OperatorDemo2 {
	public static void main(String[] args) {
		// ������������
		int x = 3;
		int y = 4;
		
		// �ַ�����ƴ��
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		
		System.out.println("x : " + x + ", y : " + y);
		
		// ����ʹ�� x++ y--
		++x; --y;
		System.out.println(x);
		
		System.out.println("x : " + x + ", y : " + y);
		
		// ��������� �����ǲ�������������
		// System.out.println(10++);
		
		System.out.println("----------------");
		// ��������ʹ��
		int a = 3;
		int b = 4;
		
		// int c = a++; int d = b--;
		
		int c = ++a;
		int d = --b;
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		System.out.println("d : " + d);
	}
}
