package com.test;
/*
������д���:���ж���û�����⣬���û�У�д�����

��̬�ĳ�Ա�����ص㣺
	���������뿴��ߣ����п��ұߡ�
	
�̳е�ʱ��
	�������к͸�����һ���ķ���������д��
	������û�и����г��ֹ��ķ����������ͱ��̳й����ˡ�
*/
class A {
	public void show() {
		show2();
	}
	public void show2() {
		System.out.println("��");
	}
}
class B extends A {
	/*
	public void show() {
		show2();
	}
	*/
	
	public void show2() {
		System.out.println("��");
	}
}
class C extends B {
	public void show() {
		super.show();
	}
	public void show2() {
		System.out.println("��");
	}
}
public class PloymorphicDemo9 {
	public static void main(String[] args) {
		A a = new B();
		a.show();
		
		B b = new C();
		b.show();
	}
}