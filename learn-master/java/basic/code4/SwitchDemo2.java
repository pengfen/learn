package com.test;
/*
switch����ע�����
	A:case����ֻ���ǳ����������Ǳ��������ң����case�����ֵ���ܳ�����ͬ��
	B:default����ʡ����?
		����ʡ�ԣ����ǲ����飬��Ϊ���������ǶԲ���ȷ�����������ʾ��
		���������
			case�Ϳ��԰�ֵ�̶���
			A,B,C,D
	C:break����ʡ����?
		����ʡ�ԣ����ǽ�����ܲ���������Ҫ�ġ�
		�����һ������case��͸��
		�������ǽ��鲻Ҫʡ��
	D:defaultһ��Ҫ�������?
		���ǣ�����������λ�á����ǽ��������
	E:switch���Ľ�������
		a:����break�ͽ�����
		b:ִ�е�ĩβ�ͽ�����
*/
import java.util.Scanner;

class SwitchDemo2 {
	public static void main(String[] args) {
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		
		//���Ƽ���¼������
		System.out.println("������һ������(1-7):");
		int week = sc.nextInt(); //3
		
		//���峣��
		//int number = 3;
		//Ȼ���case�����ֵ��Ϊnumber���ͻᱨ��
		
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
				//break;
		}
	}
}