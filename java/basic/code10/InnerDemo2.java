package com.test;

/*
内部类位置
	成员位置:在成员位置定义的类，被称为成员内部类。	
	局部位置:在局部位置定义的类，被称为局部内部类。
	
	
成员位置:在成员位置定义的类，被称为成员内部类。	
	
*/
class Outer2 {
	private int num = 10;
	
	//成员位置
	/*
	class Inner {
		
	}
	*/
	
	
	public void method() {
		//局部位置
		class Inner {
		
		}
	}
}

class InnerClassDemo2 {
	public static void main(String[] args) {
		
	}
}