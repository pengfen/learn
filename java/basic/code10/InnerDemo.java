package com.test;

/*
�ڲ������:
	���ඨ������������ڲ��������ͱ���Ϊ�ڲ��ࡣ
	����������A�ж�����һ����B����B�����ڲ��ࡣ

�ڲ��ķ����ص㣺
	A:�ڲ������ֱ�ӷ����ⲿ��ĳ�Ա������˽�С�
	B:�ⲿ��Ҫ�����ڲ���ĳ�Ա�����봴������

*/
class Outer {
	private int num = 10;
	
	class Inner {
		public void show() {
			System.out.println(num);
		}
	}
	
	public void method() {
		//�Ҳ�������
		//show();
	
		Inner i = new Inner();
		i.show();
	}

}

class InnerClassDemo {
	public static void main(String[] args) {
	
	}
}
