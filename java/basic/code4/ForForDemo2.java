package com.test;
/*
需求：请输出下列的形状
	*
	**
	***
	****
	*****
*/
class ForForDemo2 {
	public static void main(String[] args) {
		//通过简单的观察，我们看到这是一个行是5，列数是变化的形状
		//我们先打印出一个5行5列的形状
		for(int x=0; x<5; x++) {
			for(int y=0; y<5; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------");
		
		//我们实现了一个5行5列的形状
		//但是这不是我们想要的
		//我们要的是列数变化的
		//列数是如何变化的呢?
		//第一行：1列	y=0,y<=0,y++
		//第二行：2列	y=0,y<=1,y++
		//第三行：3列	y=0,y<=2,y++
		//第四行：4列	y=0,y<=3,y++
		//第五行：5列	y=0,y<=4,y++
		//在看外循环x的变化，恰好就是x=0,1,2,3,4
		//所以这个最终版的程序就是如下
		for(int x=0; x<5; x++) {
			for(int y=0; y<=x; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}