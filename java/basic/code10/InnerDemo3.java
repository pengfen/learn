package com.test;

/*
��Ա�ڲ���:
	���ֱ�ӷ����ڲ���ĳ�Ա��
	�ⲿ����.�ڲ����� ������ = �ⲿ�����.�ڲ������;
*/
class Outer3 {
	private int num = 10;
	
	class Inner {
		public void show() {
			System.out.println(num);
		}
	}
}

class InnerClassDemo3 {
	public static void main(String[] args) {
		//������Ҫ����Inner���show()����
		//Inner i = new Inner();
		//i.show();
		
		//��ʽ���ⲿ����.�ڲ����� ������ = �ⲿ�����.�ڲ������;
		Outer.Inner oi = new Outer().new Inner();
		oi.show();
	}
}
