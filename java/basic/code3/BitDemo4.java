package com.demo;
/**
 * ������
 *    ���Լ�ʵ���������������Ľ���
 *    ע�� �Ժ󽲿εĹ����� ��û����ȷָ�����ݵ����� Ĭ��int����
 *
 */
public class BitDemo4 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println("a : " + a + ", b : " + b);
		
		// ��ʽ1 ʹ�õ���������(�������õ�)
		/*
		int c = a;
		a = b;
		b = c;
		System.out.println("a:"+a+",b:"+b);
		System.out.println("------------");
		*/
		
		//��ʽ2����λ���ʵ��(������)
		//��ߣ�a,b,a
		//�ұߣ�a ^ b
		/*
		a = a ^ b;
		b = a ^ b; //a ^ b ^ b = a
		a = a ^ b; //a ^ b ^ a = b
		System.out.println("a:"+a+",b:"+b);
		*/
		
		//��ʽ3���ñ�����ӵ�����
		/*
		a = a + b; //a=30
		b = a - b; //b=10
		a = a - b; //a=20
		System.out.println("a:"+a+",b:"+b);
		*/
		
		// ��ʽ4 һ�仰�㶨
		b = (a + b) - (a = b); // b = 30 - 20 = 10, a = 20
		System.out.println("a : " + a + ", b : " + b);
	}
}
