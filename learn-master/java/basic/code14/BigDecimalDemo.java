package com.test;

/*
 * ������д�������������������һ��㲻һ����������Ϊfloat���͵����ݴ洢��������һ�����µġ����Ǵ󲿷ֵ�ʱ�򣬶��Ǵ�����Ч����λ��
 * 
 * �����������ʱ��float���ͺ�double�����׶�ʧ���ȣ���ʾ���������ԣ�Ϊ���ܾ�ȷ�ı�ʾ�����㸡������Java�ṩ��BigDecimal
 * 
 * BigDecimal�ࣺ���ɱ�ġ����⾫�ȵ��з���ʮ������,���Խ�����ݶ�ʧ���⡣
 */
public class BigDecimalDemo {
	public static void main(String[] args) {
		System.out.println(0.09 + 0.01);
		System.out.println(1.0 - 0.32);
		System.out.println(1.015 * 100);
		System.out.println(1.301 / 100);

		System.out.println(1.0 - 0.12);
	}
}
