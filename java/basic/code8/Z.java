package com.test;

/*
看程序写结果：
	A:成员变量的问题
		int x = 10; //成员变量是基本类型
		Student s = new Student(); //成员变量是引用类型
	B:一个类的初始化过程
		成员变量的初始化
			默认初始化
			显示初始化
			构造方法初始化
	C:子父类的初始化(分层初始化)
		先进行父类初始化，然后进行子类初始化。
		
结果：
	YXYZ
	
问题：
	虽然子类中构造方法默认有一个super()
	初始化的时候，不是按照那个顺序进行的。
	而是按照分层初始化进行的。
	它仅仅表示要先初始化父类数据，再初始化子类数据。
*/
class X {
	Y b = new Y();
	X() {
		System.out.print("X");
	}
}

class Y {
	Y() {
		System.out.print("Y");
	}
}

public class Z extends X {
	Y y = new Y();
	Z() {
		// super();
		System.out.print("Z");
	}
	public static void main(String[] args) {
		new Z(); 
	}
}
