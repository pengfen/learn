package com.test;
/*
Java�м̳е��ص㣺
	A:Javaֻ֧�ֵ��̳У���֧�ֶ�̳С�
		��Щ������֧�ֶ�̳У���ʽ��extends ��1,��2,...
	B:Java֧�ֶ��̳�(�̳���ϵ)
*/

/*
class Father {}
class Mother {}
class Son exnteds Father {} //��ȷ��
class Son extends Father,Mother {} // �����
*/

class GrandFather {
	public void show() {
		System.out.println("����үү");
	}
}

class Father extends GrandFather {
	public void method(){
		System.out.println("��������");
	}
}

class Son extends Father {}

class ExtendsDemo2 {
	public static void main(String[] args) {
		Son s = new Son();
		s.method(); //ʹ�ø��׵�
		s.show(); //ʹ��үү��
	}
}
