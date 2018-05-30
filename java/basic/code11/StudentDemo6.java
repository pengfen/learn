package com.test;

/*
 *	protected void finalize()：当垃圾回收器确定不存在对该对象的更多引用时，由对象的垃圾回收器调用此方法。用于垃圾回收，但是什么时候回收不确定。
 *	protected Object clone():创建并返回此对象的一个副本。
 *		A:重写该方法
 *
 *  Cloneable:此类实现了 Cloneable 接口，以指示 Object.clone() 方法可以合法地对该类实例进行按字段复制。 
 *  	这个接口是标记接口，告诉我们实现该接口的类就可以实现对象的复制了。
 */
public class StudentDemo6 {
	public static void main(String[] args) throws CloneNotSupportedException {
		//创建学生对象
		Student6 s = new Student6();
		s.setName("林青霞");
		s.setAge(27);
		
		//克隆学生对象
		Object obj = s.clone();
		Student6 s2 = (Student6)obj;
		System.out.println("---------");
		
		System.out.println(s.getName()+"---"+s.getAge());
		System.out.println(s2.getName()+"---"+s2.getAge());
		
		//以前的做法
		Student6 s3 = s;
		System.out.println(s3.getName()+"---"+s3.getAge());
		System.out.println("---------");
		
		//其实是有区别的
		s3.setName("刘意");
		s3.setAge(30);
		System.out.println(s.getName()+"---"+s.getAge());
		System.out.println(s2.getName()+"---"+s2.getAge());
		System.out.println(s3.getName()+"---"+s3.getAge());
		
	}
}
