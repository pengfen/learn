package com.test;
/*
ע����ѭ����
	A:һ��Ҫע��������������Ƶ��Ǹ����������⣬��ҪŪ���ˣ������������ѭ����
	B:������򵥵���ѭ����ʽ
		while(true){...}
		for(;;){...}
		
*/
class DoWhileDemo3 {
	public static void main(String[] args) {
		int x = 0;
		while(x < 10) {
			System.out.println(x);
			x++;
		}
		System.out.println("--------------");
		
		/*
		while(true) {
			System.out.println("�����Һܸ��ˣ�ѧϰ����ѭ��");
		}
		*/
		
		for(;;){
			System.out.println("�����Һܸ��ˣ�ѧϰ����ѭ��");
		}
		
		//System.out.println("--------------");
	}
}
