package com.test;
/*
 * ������ע������
 *    ���������ò�ִ��
 *    �����뷽����ƽ����ϵ ����Ƕ�׶���
 *    ���������ʱ�����֮���ö��Ÿ���
 *    �������õ�ʱ�����ڴ�����������
 *    �����������ȷ�ķ���ֵ һ��Ҫ��return����һ��ֵ
 */
public class FunctionDemo2 {
	public static void main(String[] args) { // ��һ�� �����main������ʼִ��
		int x = 10; // �ڶ��� ����������int���͵ı��� 
		int y = 20;
		
		int result = sum(x, y); // ������ ���÷���
		System.out.println(result); // ���result ��ʵ�������30
		/*
		 * �����
		 * public static int sum(int a, int b) {return a + b;}
		 */
		
		// sum(10, 20);
		
		// int x = 10;
		// int y = 20;
		// ����
		// sum(int x, int y);
	}
	
	public static int sum(int a, int b) { // ���Ĳ� �ֱ��x y��ֵ����a b
		return a + b; // ���岽 ��a + b�Ľ���������
		// ������ ͨ��return ��30����
	}
}
