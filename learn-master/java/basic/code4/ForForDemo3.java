package com.test;
/*
�����ڿ���̨����žų˷���

��������д���žų˷���
	1*1=1
	1*2=2	2*2=4
	1*3=3	2*3=6	3*3=9
	1*4=4	2*4=8	3*4=12	4*4=16
	...
	1*9=9	2*9=18	3*9=27	...
	
�����Ȱ�����žų˷�������������һ����״��
	*
	**
	***
	****
	*****
	******
	*******
	********
	*********
	
ע�⣺
	'\x' x��ʾ���⣬����������ת���ַ���
	
	'\t'	tab����λ��
	'\r'	�س�
	'\n'	����
*/
class ForForDemo3 {
	public static void main(String[] args) {
		for(int x=0; x<9; x++) {
			for(int y=0; y<=x; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("--------------");
		//Ϊ��ʹ�����ݣ����Ǵ�1��ʼ
		for(int x=1; x<=9; x++) {
			for(int y=1; y<=x; y++) {
				System.out.print(y+"*"+x+"="+y*x+"\t");
			}
			System.out.println();
		}
	}
}
