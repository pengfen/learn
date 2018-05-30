package com.test;
/*
一个类如果没有抽象方法，可不可以定义为抽象类?如果可以，有什么意义?
	A:可以。
	B:不让创建对象。

abstract不能和哪些关键字共存?
	private	冲突
	final	冲突	
	static	无意义
*/
abstract class Fu13 {
	//public abstract void show();
	//非法的修饰符组合: abstract和private
	//private abstract void show();
	
	//非法的修饰符组合
	//final abstract void show();	
	
	//非法的修饰符组合
	// static abstract void show();
	
	public static void method() {
		System.out.println("method");
	}
}

class Zi13 extends Fu13 {
	public void show() {}
}

class AbstractDemo3 {
	public static void main(String[] args) {
		Fu13.method();
	}
}
