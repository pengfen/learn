package com.test;

/*
Test�࣬����

������
	��ʽ��import ����;
		���ַ�ʽ�����ǵ�������ơ�
	ע�⣺������˭�͵�˭��
	
�����⣺
	package,import,class��û��˳���ϵ?
	�С�
	package > import > class
	
	Package:ֻ����һ��
	import:�����ж��
	class:�����ж�����Ժ�����һ��
*/

class ImportDemo {
	public static void main(String[] args) {
		//Demo d = new Demo();
		/*
		com.liuyi.Demo d = new com.liuyi.Demo();
		System.out.println(d.sum(10,20));
		
		com.liuyi.Demo d2 = new com.liuyi.Demo();
		System.out.println(d2.sum(10,20));
		
		com.liuyi.Demo d3 = new com.liuyi.Demo();
		System.out.println(d3.sum(10,20));
		
		com.liuyi.Demo d4 = new com.liuyi.Demo();
		System.out.println(d4.sum(10,20));
		*/
		
		ImportDemo2 d = new ImportDemo2();
		System.out.println(d.sum(10,20));
	}
}

/*
��һ�����⣺�Ҳ���Demo

�ڶ������⣺�����com.liuyi������

���������⣺ Demo��com.liuyi�в��ǹ�����; �޷����ⲿ������ж�����з���
*/