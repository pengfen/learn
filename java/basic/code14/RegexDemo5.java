package com.test;

import java.util.Scanner;

/*
 * �ָ��
 *		String���public String[] split(String regex)
 *		���ݸ���������ʽ��ƥ���ִ��ַ����� 
 *
 * ������
 * 		�ٺ��������ͼ�Ե,�䰮��,QQ
 * 		��������
 * 			�Ա�Ů
 * 			��Χ��"18-24"
 * 
 * 		age>=18 && age<=24
 */
public class RegexDemo5 {
	public static void main(String[] args) {
		//����һ������������Χ
		String ages = "18-24";
		
		//�������
		String regex = "-";
		
		//���÷���
		String[] strArray = ages.split(regex);
		
//		//����
//		for(int x=0; x<strArray.length; x++){
//			System.out.println(strArray[x]);
//		}
		
		//��εõ�int���͵���?
		int startAge = Integer.parseInt(strArray[0]);
		int endAge = Integer.parseInt(strArray[1]);
		
		//����¼������
		Scanner sc = new Scanner(System.in);
		System.out.println("������������䣺");
		int age = sc.nextInt();
		
		if(age>=startAge && age<=endAge) {
			System.out.println("����������ҵ�");
		}else {
			System.out.println("�������ҵ�Ҫ��gun");
		}
	}
}