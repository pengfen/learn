package com.java;

public class TestDouble {
	public static void main(String[] args) {
		// 定义 double 类型变量
		double a = 91.5;
		// 手动装箱
		Double b = new Double(a);
		// 自动装箱
		Double c = a;
		System.out.println("装箱后的结果为: " + b + "和" + c);
		// 定义一个 Double 包装类对象 值为 8
		Double d = new Double(87.0);
		// 手动拆箱
		double e = d.doubleValue();
		// 自动拆箱
		double f = d;
		System.out.println("拆箱后的结果为: " + e + "和" + f);
		
		double m = 78.5;
		String str1 = Double.toString(m); // 将基本类型转换为字符
		System.out.println("m 转换为 String 型后与整数 20 的求和结果为: " + (str1 + 20));
		String str = "180.20";
		// 将字符串转换为基本类型
		Double a1 = Double.parseDouble(str);
		System.out.println("str 转换为 double 型后与整数 20 的求和结果为: " + (a + 20));
	}
}
