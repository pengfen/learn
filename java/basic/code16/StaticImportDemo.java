package com.test;

/*
 * 静态导入：
 * 格式：import static 包名….类名.方法名;
 * 可以直接导入到方法的级别
 * 
 * 静态导入的注意事项：
 * 		A:方法必须是静态的
 * 		B:如果有多个同名的静态方法，容易不知道使用谁?这个时候要使用，必须加前缀。由此可见，意义不大，所以一般不用，但是要能看懂。
 */
import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.max;

//错误
//import static java.util.ArrayList.add;

public class StaticImportDemo {
	public static void main(String[] args) {
		// System.out.println(java.lang.Math.abs(-100));
		// System.out.println(java.lang.Math.pow(2, 3));
		// System.out.println(java.lang.Math.max(20, 30));
		// 太复杂，我们就引入到import

		// System.out.println(Math.abs(-100));
		// System.out.println(Math.pow(2, 3));
		// System.out.println(Math.max(20, 30));
		// 太复杂，有更简单

//		System.out.println(abs(-100));
		System.out.println(java.lang.Math.abs(-100));
		System.out.println(pow(2, 3));
		System.out.println(max(20, 30));
	}
	
	public static void abs(String s){
		System.out.println(s);
	}
}
