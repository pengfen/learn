package com.test;
/*
whileѭ����forѭ��������?
	ʹ���������������ѭ�������󣬼���ʹ�ÿ����������Ǹ���������whileѭ����������forѭ������֪����forѭ����
	          ��Ϊ��������Ĵ��ڴ�����ʧ����������ڴ��ʹ��Ч�ʡ�
			  
	��ʵ����һ�ֳ��������:
		�����һ����Χ�ģ���forѭ���ǳ���ȷ��
		����ǲ���ȷҪ�����ٴΣ���whileѭ����Ϊ���ʡ�
			�����������ѡ�
*/
class WhileDemo4 {
	public static void main(String[] args) {
		//forѭ��ʵ��
		for(int x=0; x<10; x++) {
			System.out.println("ѧϰJava�����ļ�ǿ,�й��������ǲ���");
		}
		//���ﲻ���ڼ���������
		//System.out.println(x);
		
		//whileѭ��ʵ��
		int y = 0;
		while(y<10) {
			System.out.println("ѧϰJava�����ļ�ǿ,�й��������ǲ���");
			y++;
		}
		//�����ǿ��Լ������ʵ�
		System.out.println(y);
	}
} 
