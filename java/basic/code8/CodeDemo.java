package com.test;

/*
代码块：在Java中，使用{}括起来的代码被称为代码块。
根据其位置和声明的不同，可以分为
	局部代码块:局部位置,用于限定变量的生命周期。
	构造代码块:在类中的成员位置,用{}括起来的代码。每次调用构造方法执行前，都会先执行构造代码块。
		作用：可以把多个构造方法中的共同代码放到一起，对对象进行初始化。
	静态代码块:在类中的成员位置,用{}括起来的代码,只不过它用static修饰了。
		作用：一般是对类进行初始化。
		
面试题?
	静态代码块,构造代码块,构造方法的执行顺序?
	静态代码块 -- 构造代码块 -- 构造方法
	静态代码块：只执行一次
	构造代码块：每次调用构造方法都执行
*/
class Code {
	// 静态代码块
	static {
		int a = 1000;
		System.out.println(a);
	}
	
	//构造代码块
	{
		int x = 100;
		System.out.println(x);
	}
	
	//构造方法
	public Code(){
		System.out.println("code");
	}
	
	//构造方法
	public Code(int a){
		System.out.println("code");
	}
	
	//构造代码块
	{
		int y = 200;
		System.out.println(y);
	}
	
	//静态代码块
	static {
		int b = 2000;
		System.out.println(b);
	}
}

class CodeDemo {
	public static void main(String[] args) {
		//局部代码块
		{
			int x = 10;
			System.out.println(x);
		}
		//找不到符号
		//System.out.println(x);
		{
			int y = 20;
			System.out.println(y);
		}
		System.out.println("---------------");
		
		Code c = new Code();	
		System.out.println("---------------");
		Code c2 = new Code();
		System.out.println("---------------");
		Code c3 = new Code(1);
	}
}
