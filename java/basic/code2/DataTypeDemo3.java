package com.test;
/**
 * +��һ�����з� ���ӷ������
 * 
 * һ����˵ �����������ʱ�� Ҫ�����������������ͱ���һ��
 * 
 * ע�� boolean ���Ͳ���ת��Ϊ��������������
 * 
 * Ĭ��ת��(��С�����ת��)
 * byte,short,char-int-long-float-double
 * byte,short,char�໥֮�䲻ת�� ���ǲ�����������ת��Ϊint����
 *
 */

public class DataTypeDemo3 {
	public static void main(String[] args) {
		// ֱ������ķ�ʽ���ӷ�
		System.out.println(3 + 4);
		
		// ����int�������ӷ�
		int x = 3;
		int y = 4;
		int z = x + y;
		System.out.println(z);
		
		// ����һ��byte���� һ��int���� ���ӷ�
		byte a = 3;
		int b = 4;
		System.out.println(a + b);
		
		// ������ʧ���� 
		/*
		 * byte a = 3;
		 * 00000011
		 * int b = 4;
		 * 00000000 00000000 00000000 00000100
		 * c = a +  b; Ĭ�ϻὫ a ����Ϊint����
		 * 
		 * ���ȼ�������ݶ�Ӧ�Ķ�����
		 * ʮ���Ƶ�3��Ӧ�Ķ����Ƶ� 11
		 * �����Ƶ�4��Ӧ�Ķ����Ƶ� 100
		 */
		// byte c = a + b;
		int c = a + b;
		System.out.println(c);
	}
}
