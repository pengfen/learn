package com.test;

/*
二维数组：就是元素为一维数组的一个数组。

格式1：
	数据类型[][] 数组名 = new 数据类型[m][n];
	
	m:表示这个二维数组有多少个一维数组。
	n:表示每一个一维数组的元素有多少个。
	
注意：
	A:以下格式也可以表示二维数组
		a:数据类型 数组名[][] = new 数据类型[m][n];
		b:数据类型[] 数组名[] = new 数据类型[m][n];
	B:注意下面定义的区别
		int x;
		int y;
		int x,y;
		
		int[] x;
		int[] y[];
		
		int[] x,y[];
*/
class Array2Demo {
	public static void main(String[] args) {
		 //定义一个二维数组
		 int[][] arr = new int[3][2];
		 //定义了一个二维数组arr
		 //这个二维数组有3个一维数组的元素
		 //每一个一维数组有2个元素
		 //输出二维数组名称
		 System.out.println(arr); //地址值	[[I@2a139a55  注意地址值每次运行生成的都不一样
		 
		 //输出二维数组的第一个元素一维数组的名称
		 System.out.println(arr[0]); //地址值	[I@15db9742
		 System.out.println(arr[1]); //地址值	[I@6d06d69c
		 System.out.println(arr[2]); //地址值	[I@7852e922
		 //输出二维数组的元素
		 System.out.println(arr[0][0]); //0
		 System.out.println(arr[0][1]); //0
	}
}
/*
 * 内存图
 * 
 * 栈                                                 堆
 *                                new int[3][2]
 * int[][] arr ---- [[I@175078b   [I@42552c  [I@e5bbd6  [I@8ee016
 *                  [I@42552c     0     1
 *                  [I@e5bbd6     0     1
 *                  [I@8ee016     0     1
 *                  
 * 第一步 先在栈中划一个区域
 * 第二步 在堆中划一个区域 地址指向 [[I@175078b 将地址值保存在栈中 并初始化 null null null
 * 第三步 在堆中划区域 地址指向 [I@42552c  [I@e5bbd6  [I@8ee016 并将地址值保存到第二步的区域中 替换null  
 */
