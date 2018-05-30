package com.test;
/*
继承的代码体现

由于继承中方法有一个现象：方法重写。
所以，父类的功能，就会被子类给覆盖调。
有些时候，我们不想让子类去覆盖掉父类的功能，只能让他使用。
这个时候，针对这种情况，Java就提供了一个关键字：final

final:最终的意思。常见的是它可以修饰类，方法，变量。
*/
class Fu1 {
	public final void show() {
		System.out.println("这里是绝密资源,任何人都不能修改");
	}
}
	
class Zi1 extends Fu1 {
	// Zi中的show()无法覆盖Fu中的show()
//	public void show() {
//		System.out.println("这是一堆垃圾");
//	}
}

class ZiDemo {
	public static void main(String[] args) {
		Zi1 z = new Zi1();
		z.show();
	}
}
