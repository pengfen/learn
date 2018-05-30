package com.test;
/*
数组操作的两个常见小问题：
	ArrayIndexOutOfBoundsException:数组索引越界异常
		原因：你访问了不存在的索引。
	
	NullPointerException:空指针异常
		原因：数组已经不在指向堆内存了。而你还用数组名去访问元素。
		
	作用：请自己把所有的场景Exception结尾的问题总结一下。以后遇到就记录下来。
		  现象，原因，解决方案。
*/
class ArrayDemo6 {
	public static void main(String[] args) {
		//定义数组
		int[] arr = {1,2,3};
		
		//System.out.println(arr[3]);
	
		//引用类型的常量：空常量 null
		arr = null;
		System.out.println(arr[0]);
	}
}
