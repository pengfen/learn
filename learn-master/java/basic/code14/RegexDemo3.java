package com.test;

import java.util.Scanner;

/*
 * �жϹ���
 *		String���public boolean matches(String regex)
 *
 * ����
 * 		�ж��ֻ������Ƿ�����Ҫ��?
 * 
 * ������
 * 		A:����¼���ֻ�����
 * 		B:�����ֻ�����Ĺ���
 * 			13436975980
 * 			13688886868
 * 			13866668888
 * 			13456789012
 * 			13123456789
 * 			18912345678
 * 			18886867878
 * 			18638833883
 * 		C:���ù��ܣ��жϼ���
 * 		D:������
 */
public class RegexDemo3 {
	public static void main(String[] args) {
		//����¼���ֻ�����
		Scanner sc = new Scanner(System.in);
		System.out.println("����������ֻ����룺");
		String phone = sc.nextLine();
		
		//�����ֻ�����Ĺ���
		String regex = "1[38]\\d{9}";
		
		//���ù��ܣ��жϼ���
		boolean flag = phone.matches(regex);
		
		//������
		System.out.println("flag:"+flag);
	}
}