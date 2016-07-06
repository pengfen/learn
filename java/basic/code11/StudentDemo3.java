package com.test;

/*
 * Object:类 Object 是类层次结构的根类。每个类都使用 Object 作为超类。
 * 每个类都直接或者间接的继承自Object类。
 * 
 * Object类的方法：
 * 		public int hashCode():返回该对象的哈希码值。
 * 			注意：哈希值是根据哈希算法计算出来的一个值，这个值和地址值有关，但是不是实际地址值。
 * 			           你可以理解为地址值。
 * 
 *		public final Class getClass():返回此 Object 的运行时类
 *			Class类的方法：
 *				public String getName()：以 String 的形式返回此 Class 对象所表示的实体
 */
public class StudentDemo3 {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1.hashCode()); // 11299397
		Student s2 = new Student();
		System.out.println(s2.hashCode());// 24446859
		Student s3 = s1;
		System.out.println(s3.hashCode()); // 11299397
		System.out.println("-----------");

		Student s = new Student();
		Class c = s.getClass();
		String str = c.getName();
		System.out.println(str); // cn.itcast_01.Student
		
		//链式编程
		String str2  = s.getClass().getName();
		System.out.println(str2);
	}
}
