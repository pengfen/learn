package com.test;
/*
数组遍历：就是依次输出数组中的每一个元素。

注意：数组提供了一个属性length，用于获取数组的长度。
	  格式：数组名.length
*/
class ArrayDemo7 {
	public static void main(String[] args) {
		//定义数组
		int[] arr = {11,22,33,44,55};
		
		//获取每一个元素
		//如何获取呢?我们知道数组名结合编号(索引)就可以找到数据
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println("--------------------");
		
		//虽然这种做法可以，但是不是我想要的
		//我们发现，代码的重复度很高
		//输出语句，数组名都是相同的，仅仅是索引是变化的
		//我们就可以使用循环搞定索引值
		for(int x=0; x<5; x++) {
			//x=0,1,2,3,4
			System.out.println(arr[x]);
		}
		System.out.println("--------------------");
		
		//从0开始我们是明确的，但是为什么到5呢，我们是数了一下数组的个数
		//继续看下个数组如何遍历
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10,11,2,2,3,4,5,7,8,5,3,5,6,8,7,8,5,3,5,6,8,7,8,5,3,5,6,8,7,8,5,3,5,6,8,7,8,5,3,5,6,8};
		//而我们在很多时候，数组的元素不能靠数
		//这个时候，数组就给我们提供了一个属性：length专门用于获取数组的长度
		//格式：数组名.length 返回数组的长度
		System.out.println(arr.length);
		System.out.println(arr2.length);
		System.out.println("--------------------");
		
		//改进第一个程序
		for(int x=0; x<arr.length; x++) {
			System.out.println(arr[x]);
		}
		System.out.println("--------------------");
		
		//我们如果想要对多个数组进行遍历，每个数组的遍历我们都把代码写一遍，麻烦不
		//麻烦，所以，我们准备用方法改进。
		//用方法改进后，请调用
		printArray(arr);
		System.out.println("--------------------");
		printArray(arr2);
		System.out.println("--------------------");
		printArray2(arr);
	}
	
	/*
		遍历数组的方法
		
		两个明确：
			返回值类型：void
			参数列表：int[] arr
	*/
	public static void printArray(int[] arr) {
		for(int x=0; x<arr.length; x++) {
			System.out.println(arr[x]);
		}
	}
	
	//请看改进版本
	public static void printArray2(int[] arr) {
		System.out.print("[");
		for(int x=0; x<arr.length; x++) {
			if(x == arr.length-1) { //这是最后一个元素
				System.out.println(arr[x]+"]");
			}else {
				System.out.print(arr[x]+", ");
			}
		}
	}
}
