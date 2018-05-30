package com.test;

/*
 * 查找：
 * 		基本查找:数组元素无序(从头找到尾)
 * 		二分查找(折半查找):数组元素有序
 * 
 * 分析：
 * 		A:定义最大索引，最小索引
 * 		B:计算出中间索引
 * 		C:拿中间索引的值和要查找的值进行比较
 * 			相等：就返回当前的中间索引
 * 			不相等：
 * 				大	左边找
 * 				小	右边找
 * 		D:重新计算出中间索引
 * 			大	左边找
 * 				max = mid - 1;
 * 			小	右边找
 * 				min = mid + 1;
 * 		E:回到B
 */
public class ArrayDemo4 {
	public static void main(String[] args) {
		//定义一个数组
		int[] arr = {11,22,33,44,55,66,77};
		
		//写功能实现
		int index = getIndex(arr, 33);
		System.out.println("index:"+index);
		
		//假如这个元素不存在后有什么现象呢?
		index = getIndex(arr, 333);
		System.out.println("index:"+index);
	}
	
	/*
	 * 两个明确：
	 * 返回值类型：int
	 * 参数列表：int[] arr,int value
	 */
	public static int getIndex(int[] arr,int value){
		//定义最大索引，最小索引
		int max = arr.length -1;
		int min = 0;
		
		//计算出中间索引
		int mid = (max +min)/2;
		
		//拿中间索引的值和要查找的值进行比较
		while(arr[mid] != value){
			if(arr[mid]>value){
				max = mid - 1;
			}else if(arr[mid]<value){
				min = mid + 1;
			}
			
			//加入判断
			if(min > max){
				return -1;
			}
			
			mid = (max +min)/2;
		}
		
		return mid;
	}
}
