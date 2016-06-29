package com.test;

/*
一个标准代码的最终版。

学生类：
	成员变量：
		name，age
	构造方法：
		无参，带两个参
	成员方法：
		getXxx()/setXxx()
		show()：输出该类的所有成员变量值
		
给成员变量赋值：
	A:setXxx()方法
	B:构造方法
	
输出成员变量值的方式：
	A:通过getXxx()分别获取然后拼接
	B:通过调用show()方法搞定
*/
class Student8 {
	//姓名
	private String name;
	//年龄
	private int age;
	
	//构造方法
	public Student8() {
	}
	
	public Student8(String name,int age) {
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
	
	//输出所有的成员变量值
	public void show() {
		System.out.println(name+"---"+age);
	}
}

//测试类
class StudentDemo6 {
	public static void main(String[] args) {
		//方式1给成员变量赋值
		//无参构造+setXxx()
		Student8 s1 = new Student8();
		s1.setName("林青霞");
		s1.setAge(27);
		//输出值
		System.out.println(s1.getName()+"---"+s1.getAge());
		s1.show();
		System.out.println("----------------------------");
		
		//方式2给成员变量赋值
		Student8 s2 = new Student8("刘意",30);
		System.out.println(s2.getName()+"---"+s2.getAge());
		s2.show();
	}
}

/*
 * 栈                                                                   堆                                                方法区
 * main                    new Student()    class内容 StudentDemo.class main
 * Student s --- 0x001 --- name:null --- ""         Student.class
 *                         age:0 --- 27
 * 
 * Student s = new Student(); 做了哪些事情
 * 
 * 把Student.class文件加载到内存
 * 在栈内存给s变量开辟一个空间
 * 在堆内存为学生对象申请一个空间
 * 给成员变量进行默认初始化 null 0
 * 给成员变量进行了显示初始化 林青霞 27
 * 通过构造方法给成员变量进行初始化 刘意 30
 * 数据初始化完毕 然后把堆内存的地址值赋值给栈内存的s变量
 */