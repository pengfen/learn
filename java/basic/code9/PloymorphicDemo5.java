package com.test;

/*
ClassCastException:类型转换异常
一般在多态的向下转型中容易出现
*/
class Animal5 {
	public void eat(){}
}

class Dog5 extends Animal5 {
	public void eat() {}
	
	public void lookDoor() {
	
	}
}

class Cat5 extends Animal5 {
	public void eat() {
	
	}
	
	public void playGame() {
		
	}
}

class DuoTaiDemo5 {
	public static void main(String[] args) {
		//内存中的是狗
		Animal5 a = new Dog5();
		Dog5 d = (Dog5)a;
		
		//内存中是猫
		a = new Cat5();
		Cat5 c = (Cat5)a;
		
		//内存中是猫
		Dog5 dd = (Dog5)a; //ClassCastException
	}
}

/*
 * 多态的成员访问特点及转型的理解
 * 
 * 多态的问题理解
 * 
 * class 孔子爹 {
 *     public int age = 40;
 *     
 *     public void teach() {
 *         System.out.println("讲解JavaSE");
 *     }
 * }
 * 
 * class 孔子 extends 孔子爹 {
 *     public int age = 20;
 *     
 *     public void teach() {
 *         System.out.println("讲解论语");
 *     }
 *     
 *     public void playGame() {
 *         System.out.println("英雄联盟");
 *     }
 * }
 * 
 * Java培训特别火 很多个来请孔子爹去讲课 这一天孔子爹被请走了
 * 但是还有人来请 就剩孔子在家 价格还挺高 孔子一想 我是不是可以考虑去呢
 * 然后就穿上爹的衣服 带上爹的眼睛 粘上爹的胡子 就开始装爹
 * 
 * 向上转型
 * 孔子爹 K爹 = new 孔子();
 * 
 * 到人家那里去了
 * System.out.println(k爹.age); // 40
 * k爹.teach(); // 讲解论语
 * k爹.playGame(); // 这是儿子才能做的
 * 
 * 讲完了 下班回家了
 * 脱下爹的装备 换上自己的装备
 * 向下转型
 * 孔子 k = (孔子) k爹;
 * System.out.println(k.age); // 20
 * k.teach(); // 讲解论语
 * k.playGame(); // 英雄联盟
 */