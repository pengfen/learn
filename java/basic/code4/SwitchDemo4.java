package com.test;

/*
ģ�ⵥ��ѡ���⡣

������
	A:��һ��ѡ���⣬Ȼ����ѡ��
	B:����¼��ѡ������ݡ�
	C:����ѡ����������ѡ��Ľ��ۡ�
*/
import java.util.Scanner;

class SwitchDemo4 {
	public static void main(String[] args) {
		//��һ��ѡ���⣬Ȼ����ѡ��
		//������������û�а취����¼��õ�һ��'A','B'
		//�����Ķ������Ҿ���65��66������ֵ���
		//�������ǻ�ȡ��������ֵ�Ժ�ǿ��ת��Ϊ�ַ�����
		System.out.println("����ļ��������˭?");
		System.out.println("65 ����ϼ");
		System.out.println("66 ������");
		System.out.println("67 ���»�");
		System.out.println("68 ������");
		
		//����¼��ѡ������ݡ�
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���������ѡ��");
		int choiceNumber = sc.nextInt();
		
		//ǿ��ת��Ϊ�ַ�����
		char choice = (char) choiceNumber;
		
		switch(choice) {
			case 'A':
				System.out.println("��ϲ��,ѡ����ȷ");
				break;
			case 'B':
				System.out.println("������˼����ѡ������");
				break;
			case 'C':
				System.out.println("������˼����ѡ������");
				break;
			case 'D':
				System.out.println("������˼����ѡ������");
				break;
			default:
				System.out.println("û�и�ѡ��");
				break;
		}
	}
}
