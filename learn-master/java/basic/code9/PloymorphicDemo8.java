package com.test;

/*
������д���:���ж���û�����⣬���û�У�д�����
*/
class Fu8 {
	public void show() {
		System.out.println("fu show");
	}
}

class Zi8 extends Fu8 {
	public void show() {
		System.out.println("zi show");
	}
	
	public void method() {
		System.out.println("zi method");
	}
}

class DuoTaiTest3 {
	public static void main(String[] args) {
		Fu8 f = new Zi8();
		//�Ҳ�������
		//f.method();
		f.show();
	}
}