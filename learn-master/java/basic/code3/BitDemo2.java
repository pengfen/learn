package com.demo;
/*
 * ^���ص� һ�����ݶ���һ������λ������� ����������
 * 
 * ���������� һ����ܱ��⸴��
 */
public class BitDemo2 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println(a ^ b ^ b); // 10
		System.out.println(a ^ b ^ a);
	}
}
