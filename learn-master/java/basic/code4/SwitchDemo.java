package com.test;
/*
	switch����ʽ��
		switch(���ʽ) {
			case ֵ1:
				�����1;
				break;
			case ֵ2:
				�����2;
				break;
			...
			default:
				�����n+1;
				break;
		}
		
	��ʽ�Ľ��ͣ�
		switch:��ʾ����switchѡ��ṹ
		���ʽ:����ط���ȡֵ�����޶���
			byte,short,int,char
			JDK5�Ժ������ö��
			JDK7�Ժ�������ַ���
		case:���������Ҫ�ͱ��ʽ���бȽϵ�ֵ
		�����:Ҫִ�еĴ���
		break:��ʾ�жϣ���������˼�����Կ���switch���Ľ�����
		default:�����е�ֵ���ͱ��ʽ��ƥ���ʱ�򣬾�ִ��default���Ƶ���䡣��ʵ�����൱��if����else��
	
	�����⣺
		byte������Ϊswitch�ı��ʽ��?
		long������Ϊswitch�ı��ʽ��?
		String������Ϊswitch�ı��ʽ��?
		
	������
		����¼��һ�����ݣ�����������ݣ����������Ӧ������?
			����¼��1,��Ӧ�������һ
			����¼��2,��Ӧ������ڶ�
			...
			����¼��7,��Ӧ���������
			
	������
		1:����¼�룬��Scannerʵ��
		2:�ж����Ǽȿ���ʹ��if��䣬Ҳ����ʹ������Ҫ�����switch���
		
	ע�⣺
		A:���������������һ��tab��λ�á�
		B:�������Ǻܴ���������
*/
import java.util.Scanner;

class SwitchDemo {
	public static void main(String[] args) {
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		
		//���Ƽ���¼������
		System.out.println("������һ������(1-7):");
		int week = sc.nextInt(); //3
		
		//switch�ж����
		switch(week) {
			case 1:
				System.out.println("����һ");
				break;
			case 2:
				System.out.println("���ڶ�");
				break;
			case 3:
				System.out.println("������");
				break;
			case 4:
				System.out.println("������");
				break;
			case 5:
				System.out.println("������");
				break;
			case 6:
				System.out.println("������");
				break;
			case 7:
				System.out.println("������");
				break;
			default:
				System.out.println("���������������");
				break;
		}
	}
}
