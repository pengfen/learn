package com.test;
/*
数组元素逆序 (就是把元素对调)

分析：
	A:定义一个数组，并进行静态初始化。
	B:思路
		把0索引和arr.length-1的数据交换
		把1索引和arr.length-2的数据交换
		...
		只要做到arr.length/2的时候即可。
*/
class ArrayDemo9 {
	public static void main(String[] args) {
		//定义一个数组，并进行静态初始化。
		int[] arr = {12,98,50,34,76};
		
		//逆序前
		System.out.println("逆序前：");
		printArray(arr);
		
		//逆序后
		System.out.println("逆序后：");
		//reverse(arr);
		reverse2(arr);
		printArray(arr);
	}
	
	/*
		需求：数组逆序
		两个明确：
			返回值类型：void (有人会想到应该返回的是逆序后的数组，但是没必要，因为这两个数组其实是同一个数组)
			参数列表：int[] arr
	*/
	public static void reverse(int[] arr) {
		/*
		//第一次交换
		int temp = arr[0];
		arr[0] = arr[arr.length-1-0];
		arr[arr.length-1-0] = temp;
		
		//第二次交换
		int temp = arr[1];
		arr[1] = arr[arr.length-1-1];
		arr[arr.length-1-1] = temp;
		
		//第三次交换
		int temp = arr[2];
		arr[2] = arr[arr.length-1-2];
		arr[arr.length-1-2] = temp;
		*/
		//用循环改进
		for(int x=0; x<arr.length/2; x++) {
			int temp = arr[x];
			arr[x] = arr[arr.length-1-x];
			arr[arr.length-1-x] = temp;
		}
	}
	
	public static void reverse2(int[] arr) {
		for(int start=0,end=arr.length-1; start<=end; start++,end--) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		}
	}
	
	//遍历数组
	public static void printArray(int[] arr) {
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
