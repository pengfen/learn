package com.test;
/*
匿名对象：就是没有名字的对象。

匿名对象的应用场景：
	A:调用方法，仅仅只调用一次的时候。
		注意：调用多次的时候，不适合。
		那么，这种匿名调用有什么好处吗?
			有，匿名对象调用完毕就是垃圾。可以被垃圾回收器回收。
	B:匿名对象可以作为实际参数传递
*/
class Student1 {
	public void show() {
		System.out.println("我爱学习");
	}
}

class Student1Demo {
	public void method(Student1 s) {
		s.show();
	}
}

class anonymous {
	public static void main(String[] args) {
		//带名字的调用
		Student1 s = new Student1();
		s.show();
		s.show();
		System.out.println("--------------");
		
		//匿名对象
		//new Student();
		//匿名对象调用方法
		new Student1().show();
		new Student1().show(); //这里其实是重新创建了一个新的对象
		System.out.println("--------------");
		
		
		//匿名对象作为实际参数传递
		Student1Demo sd = new Student1Demo();
		//Student ss = new Student();
		//sd.method(ss); //这里的s是一个实际参数
		//匿名对象
		sd.method(new Student1());
		
		//在来一个
		new Student1Demo().method(new Student1());
	}
}
