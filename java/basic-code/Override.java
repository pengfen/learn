package com.java;

public class Override {
	void max(int a, int b) {
		System.out.println("invoke int");
		System.out.println(a > b ? a : b);
	}
	
	void max(short a, short b) {
		System.out.println("invoke short");
		System.out.println(a > b ? a : b);
	}
	
	void max(double a, double b) {
		System.out.println("invoke double");
		System.out.println(a > b ? a : b);
	}
	
	public static void main(String[] args) {
		Override or = new Override();
		or.max(3, 4);
		short x = 3;
		short y = 4;
		or.max(x, y);
		or.max(3.4, 4.0);
	}
}
