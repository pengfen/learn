package com.demo;
/**
 * ������
 * short s = 1; s = s + 1;
 * 
 * short s = 1; s += 1; ��������������û������ ����� ����������
 * 
 * Ϊʲô�ڶ���ľ�������� ��չ�ĸ�ֵ�������ʵ������һ��ǿ������ת��
 * 
 * s += 1;
 * ���ǵȼ��� s = s + 1;
 * ���ǵȼ��� s = (s����������)(s + 1)
 *
 */
public class Assignment2 {
	public static void main(String[] args) {
		// short s = 1;
		// s = s + 1;
		// System.out.println(s);
		
		short s = 1;
		s += 1; // ������ s = s + 1;
		System.out.println(s);
	}
}
