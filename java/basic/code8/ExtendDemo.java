package com.test;
/*
继承概述：
	把多个类中相同的内容给提取出来定义到一个类中。
	
如何实现继承呢?	
	Java提供了关键字：extends
	
格式：
	class 子类名 extends 父类名 {}
	
好处：
	A:提高了代码的复用性
	B:提高了代码的维护性
	C:让类与类之间产生了关系，是多态的前提

类与类产生了关系，其实也是继承的一个弊端：
	类的耦合性增强了。
	
	开发的原则：低耦合，高内聚。
	耦合：类与类的关系
	内聚：就是自己完成某件事情的能力
*/

//使用继承前
/*
class Student {
	public void eat() {
		System.out.println("吃饭");
	}
	
	public void sleep() {
		System.out.println("睡觉");
	}
	}
	
	class Teacher {
	public void eat() {
		System.out.println("吃饭");
	}
	
	public void sleep() {
		System.out.println("睡觉");
	}
}
*/

//使用继承后
class Person {
	public void eat() {
		System.out.println("吃饭");
	}
	
	public void sleep() {
		System.out.println("睡觉");
	}
}

class Student1 extends Person {}

class Teacher extends Person {}

class ExtendsDemo {
	public static void main(String[] args) {
		Student1 s = new Student1();
		s.eat();
		s.sleep();
		System.out.println("-------------");
		
		Teacher t = new Teacher();
		t.eat();
		t.sleep();
	}
}
/*
 * 首先我来写两个代码
 *    // 定义学生类
 *    class Student {
 *        String name;
 *        int age;
 *        
 *        public Student(){}
 *        
 *        // getXxx()/setXxx()
 *        
 *        public void eat() {
 *            System.out.println("吃饭");
 *        }
 *    }
 *    
 *    // 定义老师类
 *    class Teacher {
 *        String name;
 *        int age;
 *        
 *        public Teacher() {}
 *        
 *        // getXxx()/setXxx()
 *        
 *        public void eat() {
 *            System.our.println("吃饭");
 *        }
 *    }
 *    
 *    我们观察上面两个代码
 *       发现name age成员变量 以及getXxx()/setXxx() 还有eat()等都是相同的
 *       如果我们后来继续定义类 举例 工人类 军人类 他们是不是也具备这些内容
 *       那么 人们每一次定义这样的类的时候 都要把这些重复的内容都重新定义一遍
 *       麻烦不 麻烦 所以 我们要考虑改进
 *    如何改进呢
 *       我这想的 我能不能把这些相同的内容给定义到一个独立的类中
 *       然后 让这多个类和这个独立的类产生一个关系 有了这个关系后
 *       这多个类就可以具备这个独立的类的功能
 *       为了实现这个效果 java就提供了一个技术 继承
 *       
 *    父亲 4个儿子
 *    继承怎么表示呢 继承的格式是什么样子的呢
 *    class Fu {}
 *    class Zi extends Fu {}
 *    
 *    我们就回头修改我们的代码
 *       class Person {
 *           String name;
 *           int age;
 *           
 *           public Person() {}
 *           
 *           // getXxx()/setXxx()
 *           
 *           public void eat() {
 *               System.out.println("吃饭");
 *           }
 *       }
 *       
 *       class Student extends Person {
 *           public Student() {}
 *       }
 *       
 *       class Teacher extends Person {
 *           public Teacher() {}
 *       }
 */