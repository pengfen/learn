package com.test;
/*
������5�Ľ׳ˡ�

ʲô�ǽ׳���?
	n! = n*(n-1)! ����
	n! = n*(n-1)*(n-2)*...*3*2*1
	
���˼�롣
��׳�˼�롣
*/
class ForDemo6 {
	public static void main(String[] args) {
		//�������ս������
		int jc = 1;
		
		//�����x��ʵ����ֱ�Ӵ�2��ʼ
		//for(int x=1; x<=5; x++) 
		
		for(int x=2; x<=5; x++) {
			jc *=x;
		}
		
		System.out.println("1-5�Ľ׳��ǣ�"+jc);
	}
}