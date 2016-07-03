package com.test;
/*
看程序写结果：
	A:一个类的静态代码块,构造代码块,构造方法的执行流程
		静态代码块 > 构造代码块 > 构造方法
	B:静态的内容是随着类的加载而加载
		静态代码块的内容会优先执行
	C:子类初始化之前先会进行父类的初始化
	
结果是：
	静态代码块Fu
	静态代码块Zi
	构造代码块Fu
	构造方法Fu
	构造代码块Zi
	构造方法Zi
*/
class Fu12 {
	static {
		System.out.println("静态代码块Fu");
	}
	
	{
		System.out.println("构造代码块Fu");
	}
	
	public Fu12() {
		System.out.println("构造方法Fu");
	}
}

class Zi12 extends Fu12 {
	static {
		System.out.println("静态代码块Zi");
	}
	
	{
		System.out.println("构造代码块Zi");
	}
	
	public Zi12() {
		System.out.println("构造方法Zi");
	}
}

class ExtendsDemo12 {
	public static void main(String[] args) {
		Zi12 z = new Zi12();
	}
}
