package com.test;

/*
whileѭ���Ļ�����ʽ��
	while(�ж��������) {
		ѭ�������;
	}
	
	��չ��ʽ��
	
	��ʼ�����;
    while(�ж��������) {
		 ѭ�������;
		 �����������;
	}
	
	ͨ�������ʽ�����ǾͿ��Կ�����ʵ��forѭ���ǲ��ġ�
	
	for(��ʼ�����;�ж��������;�����������) {
		ѭ�������;
	}
*/
class WhileDemo {
	public static void main(String[] args) {
		//���10��"HelloWorld"
		//for����
		for(int x=0; x<10; x++) {
			System.out.println("HelloWorld");
		}
		System.out.println("--------------");
		//while����
		int x=0;
		while(x<10) {
			System.out.println("HelloWorld");
			x++;
		}
		
	}
}
