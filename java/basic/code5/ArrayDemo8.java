package com.test;
/*
数组获取最值(获取数组中的最大值最小值)

分析：
	A:定义一个数组，并对数组的元素进行静态初始化。
	B:从数组中任意的找一个元素作为参照物(一般取第一个),默认它就是最大值。
	C:然后遍历其他的元素，依次获取和参照物进行比较，如果大就留下来，如果小，就离开。
	D:最后参照物里面保存的就是最大值。
*/
class ArrayDemo8 {
	public static void main(String[] args) {
		//定义一个数组
		int[] arr = {34,98,10,25,67};
		
		//请获取数组中的最大值
		/*
		//从数组中任意的找一个元素作为参照物
		int max = arr[0];
		//然后遍历其他的元素
		for(int x=1; x<arr.length; x++) {
			//依次获取和参照物进行比较，如果大就留下来，如果小，就离开。
			if(arr[x] > max) {
				max = arr[x];
			}
		}
		//最后参照物里面保存的就是最大值。
		System.out.println("max:"+max);
		*/
	
		//把这个代码用方法改进
		//调用方法
		int max = getMax(arr);
		System.out.println("max:"+max);
			
		//请获取数组中的最小值
		int min = getMin(arr);
		System.out.println("min:"+min);
	}
	
	/*
		需求：获取数组中的最大值
		两个明确：
			返回值类型：int
			参数列表：int[] arr
	*/
	public static int getMax(int[] arr) {
		//从数组中任意的找一个元素作为参照物
		int max = arr[0];
		//然后遍历其他的元素
		for(int x=1; x<arr.length; x++) {
			//依次获取和参照物进行比较，如果大就留下来，如果小，就离开。
			if(arr[x] > max) {
				max = arr[x];
			}
		}
		//最后参照物里面保存的就是最大值。
		return max;
	}
	
	public static int getMin(int[] arr) {
		//从数组中任意的找一个元素作为参照物
		int min = arr[0];
		//然后遍历其他的元素
		for(int x=1; x<arr.length; x++) {
			//依次获取和参照物进行比较，如果小就留下来，如果大，就离开。
			if(arr[x] < min) {
				min = arr[x];
			}
		}
		//最后参照物里面保存的就是最小值。
		return min;
	}
}
