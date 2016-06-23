package com.test;
/*
需求：我要求数的和

我们的需求不断的发生改变，我们就对应的提供了多个求和的方法。
但是呢，他们的名字是不一样的。
而我们又要求方法命名做到：见名知意。
但是，很明显，现在没有做到。
那么，肿么办呢?
针对这种情况：方法的功能相同，参数列表不同的情况，为了见名知意，Java允许它们起一样的名字。

其实，这种情况有一个专业名词：方法重载。

方法重载：
	在同一个类中，方法名相同，参数列表不同。与返回值类型无关。
	
	参数列表不同：
		A:参数个数不同
		B:参数类型不同
*/
class FunctionDemo4 {
	public static void main(String[] args) {
		//jvm会根据不同的参数去调用不同的功能
		System.out.println(sum(10,20));
		System.out.println(sum(10,20,30));
		System.out.println(sum(10,20,30,40));
		
		System.out.println(sum(10.5f,20f));
	}
	
	//需求1:求两个数的和
	public static int sum(int a,int b) {
		System.out.println("int");
		return a + b;
	}
	
	//需求2:求三数的和
	/*
	public static int sum1(int a,int b,int c) {
		return a + b + c;
	}
	*/
	
	public static int sum(int a,int b,int c) {
		return a + b + c;
	}
	
	//需求3:求四个数的和
	/*
	public static int sum2(int a,int b,int c,int d) {
		return a + b + c + d;
	}
	*/
	public static int sum(int a,int b,int c,int d) {
		return a + b + c + d;
	}
	
	public static float sum(float a,float b) {
		System.out.println("float");
		return a + b;
	}
}
