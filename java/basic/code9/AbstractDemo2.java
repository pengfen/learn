package com.test;

/*
������ĳ�Ա�ص㣺
	��Ա�������ȿ����Ǳ�����Ҳ�����ǳ�����
	���췽�����С�
				����������ʸ������ݵĳ�ʼ����
	��Ա�������ȿ����ǳ���ģ�Ҳ�����Ƿǳ���ġ�
	
������ĳ�Ա�������ԣ�
	A:���󷽷� ǿ��Ҫ�������������顣
	B:�ǳ��󷽷� ����̳е����飬��ߴ��븴���ԡ�
*/
abstract class Animal12 {
	public int num = 10;
	public final int num2 = 20;
	
	public Animal12() {}
	
	public Animal12(String name,int age){}
	
	public abstract void show();
	
	public void method() {
		System.out.println("method");
	}
}

class Dog12 extends Animal12 {
	public void show() {
		System.out.println("show Dog");
	}
}

class AbstractDemo2 {
	public static void main(String[] args) {
		//��������
		Animal12 a = new Dog12();
		a.num = 100;
		System.out.println(a.num);
		//a.num2 = 200;
		System.out.println(a.num2);
		System.out.println("--------------");
		a.show();
		a.method();
	}
}
