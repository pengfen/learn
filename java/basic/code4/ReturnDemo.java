package com.test;
/*
return:����

��ʵ�������ò��ǽ���ѭ���ģ����ǽ��������ġ�
*/
class ReturnDemo {
	public static void main(String[] args) {
		for(int x=0; x<10; x++) {
			if(x == 2) {
				System.out.println("�˳�");
				//break;
				//continue;
				return;
			}
			
			System.out.println(x);
		}
		
		System.out.println("over");
	}
}
