package com.demo;
/**
 * if����ʽ2
 *     if(�Ƚϱ��ʽ) {
 *         �����1;
 *     } else {
 *         �����2;
 *     }
 *     
 * ִ������
 *    ���ȼ���Ƚϱ��ʽ��ֵ ���䷵��ֵ��true����false
 *    �����true ��ִ�������1
 *    �����false ��ִ�������2
 *    
 *    ע�� else������û�бȽϱ��ʽ�� ֻ��if������
 *
 */
public class IfDemo3 {
	public static void main(String[] args) {
		// �ж����������Ƿ����
		
		int a = 10;
		int b = 20;
		
		if (a == b) {
			System.out.println("a����b");
		} else {
			System.out.println("a������b");
		}
	}
}
