package com.java;

public class TestInteger {
	public static void main(String[] args) {
		// 定义 int 类型变量 值为 86
		int score1 = 86;
		// 创建 Integer 包装类对象 表示变量 score1 的值
		Integer score2 = new Integer(score1);
		// 将 Integer 包装类转换为 double 类型
		double score3 = score2.doubleValue();
		// 将 Integer 包装类转换为 float 类型
		float score4 = score2.floatValue();
		// 将 Integer 包装类转换为 int 类型
		int score5 = score2.intValue();
		
		System.out.println("Integer 包装类: " + score2);
		System.out.println("double 类型: " + score3);
		System.out.println("float 类型: " + score4);
		System.out.println("int 类型: " + score5);
	}
}
