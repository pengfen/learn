package com.test;
/*
格式2：
	数据类型[][] 数组名 = new 数据类型[m][];
	
	m:表示这个二维数组有多少个一维数组。
	列数没有给出，可以动态的给。这一次是一个变化的列数。
*/
class Array2Demo2 {
	public static void main(String[] args) {
		//定义数组
		int[][] arr = new int[3][];
		
		System.out.println(arr);	//[[I@175078b
		System.out.println(arr[0]); //null 初始值为null new 之后会分配空间 值为空间的地址值
		System.out.println(arr[1]); //null
		System.out.println(arr[2]); //null
		
		//动态的为每一个一维数组分配空间
		arr[0] = new int[2];
		arr[1] = new int[3];
		arr[2] = new int[1];
		
		System.out.println(arr[0]); //[I@42552c
		System.out.println(arr[1]); //[I@e5bbd6
		System.out.println(arr[2]); //[I@8ee016
		
		System.out.println(arr[0][0]); //0
		System.out.println(arr[0][1]); //0
		//ArrayIndexOutOfBoundsException
		//System.out.println(arr[0][2]); //错误
		
		arr[1][0] = 100;
		arr[1][2] = 200;
	}
}