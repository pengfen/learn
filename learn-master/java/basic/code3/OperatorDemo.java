package com.demo;
/**
 * ����� ���ǶԳ����ͱ������в����ķ���
 * 
 * ���� ��������� ��ֵ����� �Ƚ������ �߼������ λ����� ��Ŀ�����
 * 
 * ��������� + - * / % ++ --
 * 
 * ע������
 * �������ֻ�ܵõ����� �����õ�С�� ��������ݱ仯Ϊ����������
 * / ��ȡ���ǳ�����������  % ��ȡ���ǳ�������������
 *
 */
public class OperatorDemo {
	public static void main(String[] args) {
		// �������
		int x = 3; // �� 3 ��ֵ��int���͵ı���x
		int y = 4;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y); // �������ֻ�ܵõ�����
		
		// �����С�� ����ô����
		// ֻ��Ҫ�Ѳ����������������һ�����ݱ�Ϊ������
		System.out.println(x * 1.0 / y);
		
		// %��Ӧ��
		System.out.println(x % y); // �õ���������
	}
}
