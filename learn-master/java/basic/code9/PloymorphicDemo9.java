package com.test;
/*
看程序写结果:先判断有没有问题，如果没有，写出结果

多态的成员访问特点：
	方法：编译看左边，运行看右边。
	
继承的时候：
	子类中有和父类中一样的方法，叫重写。
	子类中没有父亲中出现过的方法，方法就被继承过来了。
*/
class A {
	public void show() {
		show2();
	}
	public void show2() {
		System.out.println("我");
	}
}
class B extends A {
	/*
	public void show() {
		show2();
	}
	*/
	
	public void show2() {
		System.out.println("爱");
	}
}
class C extends B {
	public void show() {
		super.show();
	}
	public void show2() {
		System.out.println("你");
	}
}
public class PloymorphicDemo9 {
	public static void main(String[] args) {
		A a = new B();
		a.show();
		
		B b = new C();
		b.show();
	}
}