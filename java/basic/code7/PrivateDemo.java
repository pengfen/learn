package com.test;

/*
private:
	是一个权限修饰符
	可以修饰成员变量和成员方法
	被其修饰的成员只能在本类中被访问
*/
class Demo1 {
	//int num = 10;
	//用private修饰
	private int num = 10;
	
	public void show() {
		System.out.println(num);
	}
	
	private void method() {
		System.out.println("method");
	}
	
	public void function() {
		method();
	}
}

class PrivateDemo {
	public static void main(String[] args) {
		Demo1 d = new Demo1();
		//不能方法私有的成员变量
		//System.out.println(d.num);
		d.show();
		//不能访问私有的成员方法
		//d.method();
		d.function();
	}
}

