package com.test;

/*
��̬�ı׶ˣ�
	����ʹ����������й��ܡ�
*/
class Fu3 {
	public void show() {
		System.out.println("show fu");
	}
}

class Zi3 extends Fu3 {
	public void show() {
		System.out.println("show zi");
	}
	
	public void method() {
		System.out.println("method zi");
	}

}

class DuoTaiDemo3 {
	public static void main(String[] args) {
		//����
		Fu3 f = new Zi3();
		f.show();
		((Zi3) f).method();
	}
}
