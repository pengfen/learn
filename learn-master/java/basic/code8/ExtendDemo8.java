package com.test;

/*
�̳��г�Ա�����Ĺ�ϵ:
	A:�����еķ����͸����еķ���������һ�������̫�򵥡�
	B:�����еķ����͸����еķ�������һ�����������ô����?
		ͨ�����������÷�����
			a:���������У�����û������������о�ʹ��
			b:�ٿ������У���û������������о�ʹ��
			c:���û�оͱ���
*/
class Father8 {
	public void show() {
		System.out.println("show Father");
	}
}

class Son8 extends Father8 {
	public void method() {
		System.out.println("method Son");
	}
	
	public void show() {
		System.out.println("show Son");
	}
}

class ExtendsDemo8 {
	public static void main(String[] args) {
		//��������
		Son8 s = new Son8();
		s.show();
		s.method();
		//s.fucntion(); //�Ҳ�������
	}
}