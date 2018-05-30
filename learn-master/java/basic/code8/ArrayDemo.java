package com.test;

/*
我想要对数组进行操作

在同一个文件夹下，类定义在两个文件中和定义在一个文件中其实一样的。
*/
class ArrayDemo {
	public static void main(String[] args) {
		//定义数组
		int[] arr = {28,55,37,46,19};
		
		//需求：遍历数组
		/*
		for(int x=0; x<arr.length; x++) {
			if(x == arr.length-1) {
				System.out.println(arr[x]);
			}else {
				System.out.print(arr[x]+", ");
			}
		}
		*/
		
		//如果我有多个数组都要进行遍历，那么，代码的重复度就很高
		//如何改进呢?用方法改进
		//调用
		//静态方法
		//printArray(arr);
		
		//非静态方法
		//ArrayDemo ad = new ArrayDemo();
		//ad.printArray(arr);
		
		//测试类的作用：创建其他类的对象，调用其他类的功能。
		//而我们现在的操作是跟数组相关的，所以，你应该把这些操作定义到数组操作类中
		//定义一个数组的操作类
		//有了数组操作类之后的调用
		//ArrayTool at = new ArrayTool();
		//at.printArray(arr);
		
		//方法改进为静态后，就可以直接通过类名调用
		ArrayTool.printArray(arr);
	}
	
	/*
	public static void printArray(int[] arr) {
		for(int x=0; x<arr.length; x++) {
			if(x == arr.length-1) {
				System.out.println(arr[x]);
			}else {
				System.out.print(arr[x]+", ");
			}
		}
	}
	*/
	
	//假设该方法不是静态的
	/*
	public void printArray(int[] arr) {
		for(int x=0; x<arr.length; x++) {
			if(x == arr.length-1) {
				System.out.println(arr[x]);
			}else {
				System.out.print(arr[x]+", ");
			}
		}
	}
	*/
}
