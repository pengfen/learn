package com.test;

/*
定义一个类Demo,其中定义一个求两个数据和的方法，
定义一个测试了Test，进行测试。

变量什么时候定义为成员变量：
	如果这个变量是用来描述这个类的信息的，那么，该变量就应该定义为成员变量。
	
变量到底定义在哪里好呢?
	变量的范围是越小越好。因为能及时的被回收。
*/

//方式1
/*
class Demo {
public int sum() {
	int a = 10;
	int b = 20;
	int c = a + b;
	return c;
}
}
*/
//方式1满足了我们的要求，但是不好。
//因为参与操作的数据现在是固定的。

//方式2
/*
class Demo {
public int sum(int a,int b) {
	return a + b;
}
}
*/

//方式2可以满足我们的要求，但是呢我们学习过来面向对象的思想。
//我就再想，a，b可不可以定义为成员变量呢?
//如果可以，我们再改进一版
class Demo5 {
	int a;
	int b;
	
	public int sum() {
		return a + b;
	}
}
//虽然这种方式可以，并且好像是符合了面向对象的思想。
//但是不好。
//因为我们曾经说过：类是一组相关的属性和行为的集合。
//并且类是通过事物转换过来的
//而类中的成员变量就是事物的属性
//属性是用来描述事物的
//同理：成员变量其实是用来描述类的。

//测试类
class Test {
	public static void main(String[] args) {
		//创建对象
		//方式1测试
		/*
		Demo d = new Demo();
		System.out.println(d.sum());
		*/
		
		//方式2测试
		/*
		Demo d = new Demo();
		int a = 10;
		int b = 20;
		System.out.println(d.sum(a,b));
		*/
		
		//方式3测试
		Demo5 d = new Demo5();
		d.a = 10;
		d.b = 20;
		System.out.println(d.sum());
	}
}
