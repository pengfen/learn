package com.test;
/*
������ת��䣺
	break:�ж�
	continue:����
	return:����

break:�жϵ���˼
ʹ�ó�����
	A:switch�����
	B:ѭ������С�
		(ѭ������м�����if�жϵ����)
	ע�⣺�뿪��������������������塣
	
���ʹ����?
	A:��������ѭ��
	B:�������ѭ��
		Ҫ��ʵ�����Ч�����ͱ���֪��һ������������ǩ����䡣
		��ʽ��
			��ǩ��: ���
*/
class BreakDemo {
	public static void main(String[] args) {
		//�� switch �� loop �ⲿ�ж�
		//break;
		
		//��������ѭ��
		for(int x=0; x<10; x++) {
			if(x == 3) {
				break;
			}
			System.out.println("HelloWorld");
		}
		
		System.out.println("over");
		System.out.println("-------------");
		
		wc:for(int x=0; x<3; x++) {
			nc:for(int y=0; y<4; y++) {
				if(y == 2) {
					//break nc;
					break wc;
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
