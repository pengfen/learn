package com.test;
/*
continue:����

ʹ�ó�����
	ѭ���С��뿪�˳��������塣
	
���ԣ��ҵ���break������
	break:��������ѭ��
	continue:����һ��ѭ����������һ�ε�ִ��
	
��ϰ�⣺
	for(int x=1; x<=10; x++) {
		if(x%3==0) {
			//�ڴ˴���д����
		}
		System.out.println(��Java�����ࡱ);
	}
	
	�����ڿ���̨���2��:��Java�����ࡰ
		break;
	�����ڿ���̨���7��:��Java�����ࡰ
		continue;
	�����ڿ���̨���13��:��Java�����ࡰ	
		System.out.println(��Java�����ࡱ);


*/
class ContinueDemo {
	public static void main(String[] args) {
		for(int x=0; x<10; x++) {
			if(x == 3) {
				//break;
				continue;
			}
			
			System.out.println(x);
		}
	}
}