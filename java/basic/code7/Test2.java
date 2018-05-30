package com.test;

/*
定义一个长方形类,定义 求周长和面积的方法，
然后定义一个测试了Test2，进行测试。

长方形的类：
	成员变量：
		长，宽
	成员方法：
		求周长：(长+宽)*2;
		求面积：长*宽
		
注意：
	import必须出现在所有的class前面。
*/

import java.util.Scanner;

class ChangFangXing {
	//长方形的长
	private int length;
	//长方形的宽
	private int width;
	
	public ChangFangXing(){}
	
	//仅仅提供setXxx()即可
	public void setLength(int length) {
		this.length = length;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	//求周长
	public int getZhouChang() {
		return (length + width) * 2;
	}
	
	//求面积
	public int getArea() {
		return length * width;
	}
}

class Test2 {
	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入长方形的长：");
		int length = sc.nextInt();
		System.out.println("请输入长方形的宽：");
		int width = sc.nextInt();
		
		//创建对象
		ChangFangXing cfx = new ChangFangXing();
		//先给成员变量赋值
		cfx.setLength(length);
		cfx.setWidth(width);
		
		System.out.println("周长是："+cfx.getZhouChang());
		System.out.println("面积是："+cfx.getArea());
	}
}
