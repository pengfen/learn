package com.test;
/*
 * ���� �ڿ���̨������µ���״
 *   *****
 *   *****
 *   *****
 *   *****
 *   
 * void���ͷ���ֵ�ķ�������
 *     ��������
 *     �������(����)
 *     ��ֵ����(����)
 */
public class FunctionDemo3 {
	public static void main(String[] args) {
		// for ѭ��Ƕ�����ͼ��
		for (int x = 0; x < 4; x ++) {
			for (int y = 0; y < 5; y ++) {
				System.out.println("*");
			}
			System.out.println();
		}
		System.out.println("------------------------");
		
		// ���� ��Ҫ�ڿ���̨���һ��6��7�е�����ͼ��
		for (int x = 0; x < 6; x ++) {
			for (int y = 0; y < 7; y ++) {
				System.out.println("*");
			}
			System.out.println();
		}
		System.out.println("---------------------");
		
		// �����Ҫ�����ı� ���Ǿ�Ӧ�ÿ���ʹ�÷����Ľ�
		// ��������
		pringXing(3, 4);
		System.out.println("--------------------");
		pringXing(6, 7);
		System.out.println("--------------------");
		pringXing(8, 9);
		
		// �������
		// �˴�������ʹ�� '��' ����
		// System.out.println(pringXing(3, 4));
		
		// ��ֵ����
		// �Ƿ��ı��ʽ��ʼ
		// void v = pringXing(3, 4);
	}
	
	/*
	 * дһ��ʲô���ӵķ����� дһ��m��n�еĴ���
	 * 
	 * ������ȷ
	 *    ����ֵ���� ���ʱ��û����ȷ�ķ���ֵ ��д���������� ���� �����ס��void
	 *    �����б� int m, int n
	 */
	public static void pringXing(int m, int n) {
		for (int x = 0; x < m; x ++) {
			for (int y = 0; y < n; y ++) {
				System.out.println("*");
			}
			System.out.println();
		}
	}
}
