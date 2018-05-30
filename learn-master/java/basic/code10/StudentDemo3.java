package com.test;

/*
形式参数：
	基本类型(太简单，不是我今天要讲解的)
	引用类型
		类名:(匿名对象的时候其实我们已经讲过了) 需要的是该类的对象
		抽象类:
		接口
*/
class Student3 {
	public void study() {
		System.out.println("Good Good Study,Day Day Up");
	}
}

class StudentDemo {
	public void method(Student3 s) { //ss; ss = new Student();  Student s = new Student();
		s.study();
	}
}

class StudentTest {
	public static void main(String[] args) {
		//需求：我要测试Student类的study()方法
		Student3 s = new Student3();
		s.study();
		System.out.println("----------------");
		
		//需求2：我要测试StudentDemo类中的method()方法
		StudentDemo sd = new StudentDemo();
		Student3 ss = new Student3();
		sd.method(ss);
		System.out.println("----------------");
		
		//匿名对象用法
		new StudentDemo().method(new Student3());
	}
}
