package com.test;

/*
 * JDK5的新特性
 * 自动装箱：把基本类型转换为包装类类型
 * 自动拆箱：把包装类类型转换为基本类型
 * 
 * 注意一个小问题：
 * 		在使用时，Integer  x = null;代码就会出现NullPointerException。
 * 		建议先判断是否为null，然后再使用。
 */
public class IntegerDemo5 {
	public static void main(String[] args) {
		// 定义了一个int类型的包装类类型变量i
		// Integer i = new Integer(100);
		Integer ii = 100;
		ii += 200;
		System.out.println("ii:" + ii);

		// 通过反编译后的代码
		// Integer ii = Integer.valueOf(100); //自动装箱
		// ii = Integer.valueOf(ii.intValue() + 200); //自动拆箱，再自动装箱
		// System.out.println((new StringBuilder("ii:")).append(ii).toString());

		Integer iii = null;
		// NullPointerException
		if (iii != null) {
			iii += 1000;
			System.out.println(iii);
		}
	}
}

