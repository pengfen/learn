package com.test;

/*
匿名内部类在开发中的使用
*/
interface Person8 {
	public abstract void study();
}

class PersonDemo8 {
	//接口名作为形式参数
	//其实这里需要的不是接口，而是该接口的实现类的对象
	public void method(Person8 p) {
		p.study();
	}
}

//实现类
class Student8 implements Person8 {
	public void study() {
		System.out.println("好好学习,天天向上");
	}
}

class InnerClassTest2 {
	public static void main(String[] args) {
		//测试
		PersonDemo8 pd = new PersonDemo8();
		Person8 p = new Student8();
		pd.method(p);
		System.out.println("--------------------");
		
		//匿名内部类在开发中的使用
		//匿名内部类的本质是继承类或者实现了接口的子类匿名对象
		pd.method(new Person8(){
			public void study() {
				System.out.println("好好学习,天天向上");
			}
		});
	}
}