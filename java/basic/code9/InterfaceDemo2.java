package com.test;

/*
接口成员特点
	成员变量；只能是常量，并且是静态的。
			默认修饰符：public static final
			建议：自己手动给出。
	构造方法：接口没有构造方法。
	成员方法：只能是抽象方法。
			默认修饰符：public abstract
			建议：自己手动给出。
	
所有的类都默认继承自一个类：Object。
类 Object 是类层次结构的根类。每个类都使用 Object 作为超类。
*/
interface Inter {
	public int num = 10;
	public final int num2 = 20;
	public static final int num3 = 30;
	
	//错误: 需要<标识符>
	//public Inter() {}
	
	//接口方法不能带有主体
	//public void show() {}
	
	//abstract void show(); //默认public
	public void show(); //默认abstract
}

//接口名+Impl这种格式是接口的实现类格式
/*
class InterImpl implements Inter {
	public InterImpl() {
		super();
	}
}
*/

class InterImpl extends Object implements Inter {
	public InterImpl() {
		super();
	}
	
	public void show() {}
}

//测试类
class InterfaceDemo2 {
	public static void main(String[] args) {
		//创建对象
		Inter i = new InterImpl();
		System.out.println(i.num);
		System.out.println(i.num2);
		//i.num = 100;
		//i.num2 = 200;
		//System.out.println(i.num); //无法为最终变量num分配值
		//System.out.println(i.num2);//无法为最终变量num2分配值
		System.out.println(Inter.num);
		System.out.println(Inter.num2);
		System.out.println("--------------");
	}
}