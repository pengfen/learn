package com.test;
/*
需求：在控制台输出九九乘法表。

首先我们写出九九乘法表：
	1*1=1
	1*2=2	2*2=4
	1*3=3	2*3=6	3*3=9
	1*4=4	2*4=8	3*4=12	4*4=16
	...
	1*9=9	2*9=18	3*9=27	...
	
我们先把这个九九乘法表看出是这样的一个形状：
	*
	**
	***
	****
	*****
	******
	*******
	********
	*********
	
注意：
	'\x' x表示任意，这种做法叫转移字符。
	
	'\t'	tab键的位置
	'\r'	回车
	'\n'	换行
*/
class ForForDemo3 {
	public static void main(String[] args) {
		for(int x=0; x<9; x++) {
			for(int y=0; y<=x; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("--------------");
		//为了使用数据，我们从1开始
		for(int x=1; x<=9; x++) {
			for(int y=1; y<=x; y++) {
				System.out.print(y+"*"+x+"="+y*x+"\t");
			}
			System.out.println();
		}
	}
}
