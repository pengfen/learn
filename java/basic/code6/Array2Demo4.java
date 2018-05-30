package com.test;

/*
需求：二维数组遍历

外循环控制的是二维数组的长度，其实就是一维数组的个数。
内循环控制的是一维数组的长度。
*/
class Array2Demo4 {
	public static void main(String[] args) {
		//定义一个二维数组
		int[][] arr = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
		
		//请问谁代表{1,2,3}
		//arr[0]就是第一个数组
		//arr[0] = {1,2,3};
		for(int x = 0; x < arr[0].length; x ++) { // 遍历二维数组中第一元素 {1, 2, 3}
			System.out.println(arr[0][x]); // 1 2 3
		}
		System.out.println("--------------");
		
		for(int x = 0; x < arr[1].length; x ++) { // 遍历二维数组中第二元素 {4, 5, 6}
			System.out.println(arr[1][x]); // 4 5 6
		}
		System.out.println("--------------");
		
		for(int x = 0; x < arr[2].length; x ++) { // 遍历二维数组中第三元素 {7, 8, 9}
			System.out.println(arr[2][x]); // 7 8 9
		}
		System.out.println("--------------");
		
		//用循环改进
		/*
		 * 循环三次
		 * 每次循环遍历第二维
		 * 1 2 3
		 * 4 5 6
		 * 7 8 9
		 */
		for(int x = 0; x < 3; x ++) {
			for(int y = 0; y < arr[x].length; y ++) {
				System.out.print(arr[x][y]+" ");
			}
			System.out.println();
		}
		System.out.println("--------------");
		
		//这个时候，注意了，3是我们根据上面的代码得出来的
		//但是，它不能针对任何的数组都可以这样
		//所以，我们应该想办法改进
		//其实，外面的这个循环的长度就是二维数组的长度
		// 1 2 3
		// 4 5 6
		// 7 8 9
		
		for(int x = 0; x < arr.length; x ++) {
			for(int y = 0; y < arr[x].length; y ++) {
				System.out.print(arr[x][y]+" ");
			}
			System.out.println();
		}
		System.out.println("--------------");
		
		//用方法改进
		//调用方法
		printArray2(arr);
		System.out.println("--------------");
		
		//我们再来一个列数是变化的
		// 1 2 3
		// 4 5
		// 6
		int[][] arr2 = {{1,2,3},{4,5},{6}};
		printArray2(arr2);
	}
	
	/*
		需求：遍历二维数组
		两个明确：
			返回值类型：void
			参数列表：int[][] arr
	*/
	public static void printArray2(int[][] arr) {
		for(int x = 0; x < arr.length; x ++) {
			for(int y = 0; y < arr[x].length; y ++) {
				System.out.print(arr[x][y]+" ");
			}
			System.out.println();
		}
	}
}
