package com.test;

/*
教练和运动员案例(学生分析然后讲解)
	乒乓球运动员和篮球运动员。
	乒乓球教练和篮球教练。
	为了出国交流，跟乒乓球相关的人员都需要学习英语。
	请用所学知识：
	分析，这个案例中有哪些抽象类，哪些接口，哪些具体类。

整个分析过程，我是通过画图讲解的。	
*/
//定义一个说英语的接口
interface SpeakEnglish {
	//说英语
	public abstract void speak();
}

//定义人的抽象类
abstract class Person {
	private String name;
	private int age;
	
	public Person() {}
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	//睡觉
	public void sleep() {
		System.out.println("人都是要睡觉的");
	}
	
	//吃饭
	public abstract void eat();
}

//定义运动员抽象类
abstract class Player extends Person {
	public Player() {}
	
	public Player(String name,int age) {
		super(name,age);
	}
	
	//学习
	public abstract void study();
}

//定义教练抽象类
abstract class Coach extends Person {
	public Coach() {}
	
	public Coach(String name,int age) {
		super(name,age);
	}
	
	//教
	public abstract void teach();
}

//定义乒乓球运动员具体类
class PingPangPlayer extends Player implements SpeakEnglish {
	public PingPangPlayer(){}
	
	public PingPangPlayer(String name,int age) {
		super(name,age);
	}
	
	//吃
	public void eat() {
		System.out.println("乒乓球运动员吃大白菜，喝小米粥");
	}
	
	//学习
	public void study() {
		System.out.println("乒乓球运动员学习如何发球和接球");
	}
	
	//说英语
	public void speak() {
		System.out.println("乒乓球运动员说英语");
	}
}

//定义篮球运动员具体类
class BasketballPlayer extends Player {
	public BasketballPlayer(){}
	
	public BasketballPlayer(String name,int age) {
		super(name,age);
	}
	
	//吃
	public void eat() {
		System.out.println("篮球运动员吃牛肉，喝牛奶");
	}
	
	//学习
	public void study() {
		System.out.println("篮球运动员学习如何运球和投篮");
	}
}

//定义乒乓球教练具体类
class PingPangCoach extends Coach implements SpeakEnglish {
	public PingPangCoach(){}
	
	public PingPangCoach(String name,int age) {
		super(name,age);
	}
	
	//吃
	public void eat() {
		System.out.println("乒乓球教练吃小白菜，喝大米粥");
	}
	
	//教
	public void teach() {
		System.out.println("乒乓球教练教如何发球和接球");
	}
	
	//说英语
	public void speak() {
		System.out.println("乒乓球教练说英语");
	}
}

//定义篮球教练具体类
class BasketballCoach extends Coach {
	public BasketballCoach(){}
	
	public BasketballCoach(String name,int age) {
		super(name,age);
	}
	
	//吃
	public void eat() {
		System.out.println("篮球教练吃羊肉，喝羊奶");
	}
	
	//教
	public void teach() {
		System.out.println("篮球教练教如何运球和投篮");
	}
}

class InterfaceDemo {
	public static void main(String[] args) {
		//测试运动员(乒乓球运动员和篮球运动员)
		//乒乓球运动员
		PingPangPlayer ppp = new PingPangPlayer();
		ppp.setName("王浩");
		ppp.setAge(33);
		System.out.println(ppp.getName()+"---"+ppp.getAge());
		ppp.eat();
		ppp.sleep();
		ppp.study();
		ppp.speak();
		System.out.println("----------------");
		//通过带参构造给数据(留给你们)
		
		//篮球运动员
		BasketballPlayer bp = new BasketballPlayer();
		bp.setName("姚明");
		bp.setAge(34);
		System.out.println(bp.getName()+"---"+bp.getAge());
		bp.eat();
		bp.sleep();
		bp.study();
		//bp.speak(); //没有该方法
		
		//测试教练自己做
	}
}

/*
 * 人 (抽象类 姓名 年龄 吃饭() 睡觉(){})
 * 运动员 (抽象类 学习()) 继承 人
 * 教练 (抽象类 教()) 继承 人
 * 乒乓球运动员 (具体类) 继承 运动员 实现 学习英语
 * 蓝球运动员 (具体类) 继承 运动员
 * 乒乓球教练 (具体类) 继承 教练 实现 学习英语
 * 蓝球教练 (具体类) 继承 教练
 * 学习英语 (接口 口语())
 */
