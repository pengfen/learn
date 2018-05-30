package com.test;

/*
 * public String toString():返回该对象的字符串表示。
 * 
 * Integer类下的一个静态方法：
 * 		public static String toHexString(int i)：把一个整数转成一个十六进制表示的字符串
 * 
 * 这个信息的组成我们讲解完毕了，但是这个信息是没有任何意义的。所以，建议所有子类都重写该方法。
 * 怎么重写呢?
 * 		把该类的所有成员变量值组成返回即可。
 * 重写的最终版方案就是自动生成toString()方法。
 * 
 * 注意：
 * 	 直接输出一个对象的名称，其实就是调用该对象的toString()方法。
 */
public class StudentDemo4 {
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.hashCode());
		System.out.println(s.getClass().getName());
		System.out.println("--------------------");
		System.out.println(s.toString());// cn.itcast_02.Student@42552c
		System.out.println("--------------------");
		// toString()方法的值等价于它
		// getClass().getName() + '@' + Integer.toHexString(hashCode())
		// this.getClass().getName()+'@'+Integer.toHexString(this.hashCode())

		// cn.itcast_02.Student@42552c
		// cn.itcast_02.Student@42552c

		System.out.println(s.getClass().getName() + '@'
				+ Integer.toHexString(s.hashCode()));

		System.out.println(s.toString());

		// 直接输出对象的名称
		System.out.println(s);
	}
}
