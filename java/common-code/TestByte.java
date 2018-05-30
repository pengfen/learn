package com.java;

public class TestByte {
	public static void main(String[] args) {
		System.out.println("Integer 的最大值: " + Integer.MAX_VALUE);
		System.out.println("Integer 的最小值: " + Integer.MIN_VALUE);
		int i = Integer.parseInt("123");
		System.out.println(i);
		String s = Integer.toBinaryString(10);
		System.out.println(s); // 二进制
		
		System.out.println("Double 的最大值: " + Double.MAX_VALUE);
		System.out.println("Double 的最小值: " + Double.MIN_VALUE);
		double d = Double.parseDouble("123.456");
		System.out.println(d);
		System.out.println(Double.POSITIVE_INFINITY);
		System.out.println(Double.NEGATIVE_INFINITY);
		
		Integer i1 = new Integer(10);
		int i2 = i1;
		System.out.println(i2);
	}
}
