package com.test;

/*
�����ࣺ
	�̳й�ϵ,ֻ�ܵ��̳�,���Զ��̳С�
����ӿڣ�
	ʵ�ֹ�ϵ,���Ե�ʵ��,Ҳ���Զ�ʵ�֡�
	���һ������ڼ̳�һ�����ͬʱʵ�ֶ���ӿڡ�
�ӿ���ӿڣ�
	�̳й�ϵ,���Ե��̳�,Ҳ���Զ�̳С�
*/
interface Father {
	public abstract void show();
}

interface Mother {
	public abstract void show2();
}

interface Sister extends Father,Mother {

}

//class Son implements Father,Mother //��ʵ��
class Son extends Object implements Father,Mother {
	public void show() {
		System.out.println("show son");
	}
	
	public void show2() {
		System.out.println("show2 son");
	}
}

class InterfaceDemo3 {
	public static void main(String[] args) {
		//��������
		Father f = new Son();
		f.show();
		//f.show2(); //����
	
		Mother m = new Son();
		//m.show(); //����
		m.show2();
	}
}