package com.test;
/*
do...whileѭ���Ļ�����ʽ��
	do {
		ѭ�������;
	}while(�ж��������);
	
	��չ��ʽ��
	��ʼ�����;
	do {
		ѭ�������;
		�����������;
	}while(�ж��������);
*/
class DoWhileDemo {
	public static void main(String[] args) {
		//���10��HelloWorld��
		int x = 0;
		do {
			System.out.println("HelloWorld");
			x++;
		}while(x<10);
		
		System.out.println("--------------");
		
		//���1-100
		int sum = 0;
		int a = 1;
		do {
			sum += a;
			a++;
		}while(a<=100);
		
		System.out.println(sum);
	}
}