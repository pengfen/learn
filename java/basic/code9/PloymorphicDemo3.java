package com.test;

/*
多态的弊端：
	不能使用子类的特有功能。
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
		//测试
		Fu3 f = new Zi3();
		f.show();
		((Zi3) f).method();
	}
}
