package com.test;
/*
返回值类型
	基本类型:(基本类型太简单，我不准备讲解)
	引用类型：
		类:返回的是该类的对象
		抽象类:返回的是该抽象类的子类对象
		接口:返回的是该接口的实现类的对象
*/
//定义一个爱好的接口
interface Love7 {
	public abstract void love();
}

class LoveDemo7 {
	public Love7 getLove() {
		//Love l = new Teacher();
		//return l;
		
		return new Teacher7();
	}
}

//定义具体类实现接口
class Teacher7 implements Love7 {
	public void love() {
		System.out.println("老师爱学生,爱Java,爱林青霞");
	}
}

class TeacherTest2 {
	public static void main(String[] args) {
		//如何测试呢?
		LoveDemo7 ld = new LoveDemo7();
		Love7 l = ld.getLove(); //new Teacher(); Love l = new Teacher(); 多态
		l.love();
	}
}
