package com.test;

/*
成员内部类的修饰符：
	private 为了保证数据的安全性
	static 为了方便访问数据
		注意：静态内部类访问的外部类数据必须用静态修饰。

案例：我有一个人(人有身体，身体内有心脏。)
	
	class Body {
		private class Heart {
			public void operator() {
				System.out.println("心脏搭桥");
			}
		}
		
		public void method() {
			if(如果你是外科医生) {
				Heart h = new Heart();
				h.operator();
			}
		}
	}
	
	按照我们刚才的讲解，来使用一下
	Body.Heart bh = new Body().new Heart();
	bh.operator();
	//加了private后，就不能被访问了，那么，怎么玩呢?
	Body b =  new Body();
	b.method();
*/
class Outer4 {
	private int num = 10;
	private static int num2 = 100;
	
	//内部类用静态修饰是因为内部类可以看出是外部类的成员
	public static class Inner {
		public void show() {
			//System.out.println(num);
			System.out.println(num2);
		}
	
		public static void show2() {
			//System.out.println(num);
			System.out.println(num2);
		}		
	}
}

class InnerClassDemo4 {
	public static void main(String[] args) {
		//使用内部类
		// 限定的新静态类
		//Outer.Inner oi = new Outer().new Inner();
		//oi.show();
		//oi.show2();
		
		//成员内部类被静态修饰后的访问方式是:
		//格式：外部类名.内部类名 对象名 = new 外部类名.内部类名();
		Outer4.Inner oi = new Outer4.Inner();
		oi.show();
		oi.show2();
		
		//show2()的另一种调用方式
		Outer4.Inner.show2();
	}
}
