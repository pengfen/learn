package com.test;
/*
ѭ����������:
	do...whileѭ������ִ��һ��ѭ���塣
	��for,whileѭ���������ж������Ƿ������Ȼ������Ƿ�ִ��ѭ������䡣
	
��ô������һ��ʹ������ѭ����?
	���ȿ���for����ο���while�������do...while
*/
class DoWhileDemo2 {
	public static void main(String[] args) {
		int x = 3;
		while(x < 3) {
			System.out.println("�Ұ�����ϼ");
			x++;
		}
		
		System.out.println("--------------");
		
		int y = 3;
		do {
			System.out.println("�Ұ�����ϼ");
			y++;
		}while(y < 3);
	}
}