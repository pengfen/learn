package com.test;
/*
������д�����
	A:һ����ľ�̬�����,��������,���췽����ִ������
		��̬����� > �������� > ���췽��
	B:��̬��������������ļ��ض�����
		��̬���������ݻ�����ִ��
	C:�����ʼ��֮ǰ�Ȼ���и���ĳ�ʼ��
	
����ǣ�
	��̬�����Fu
	��̬�����Zi
	��������Fu
	���췽��Fu
	��������Zi
	���췽��Zi
*/
class Fu12 {
	static {
		System.out.println("��̬�����Fu");
	}
	
	{
		System.out.println("��������Fu");
	}
	
	public Fu12() {
		System.out.println("���췽��Fu");
	}
}

class Zi12 extends Fu12 {
	static {
		System.out.println("��̬�����Zi");
	}
	
	{
		System.out.println("��������Zi");
	}
	
	public Zi12() {
		System.out.println("���췽��Zi");
	}
}

class ExtendsDemo12 {
	public static void main(String[] args) {
		Zi12 z = new Zi12();
	}
}
