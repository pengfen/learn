package com.test;

import java.util.Scanner;

/*
 * У������
 * 
 * ������
 * 		A:����¼������
 * 		B:��������Ĺ���
 * 			1517806580@qq.com
 * 			liuyi@163.com
 * 			linqingxia@126.com
 * 			fengqingyang@sina.com.cn
 * 			fqy@itcast.cn
 * 		C:���ù��ܣ��жϼ���
 * 		D:������
 */
public class RegexDemo4 {
	public static void main(String[] args) {
		//����¼������
		Scanner sc = new Scanner(System.in);
		System.out.println("���������䣺");
		String email = sc.nextLine();
		
		//��������Ĺ���
		//String regex = "[a-zA-Z_0-9]+@[a-zA-Z_0-9]{2,6}(\\.[a-zA-Z_0-9]{2,3})+";
		String regex = "\\w+@\\w{2,6}(\\.\\w{2,3})+";
		
		//���ù��ܣ��жϼ���
		boolean flag = email.matches(regex);
		
		//������
		System.out.println("flag:"+flag);
	}
}
