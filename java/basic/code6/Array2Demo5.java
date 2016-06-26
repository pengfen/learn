package com.test;
/*
公司年销售额求和
某公司按照季度和月份统计的数据如下：单位(万元)
第一季度：22,66,44
第二季度：77,33,88
第三季度：25,45,65
第四季度：11,66,99

分析：
	A:把题目的数据用二维数组来表示
		int[][] arr = {{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
	B:如何求和呢?
		求和其实就是获取到每一个元素，然后累加即可。
	C:定义一个求和变量sum，初始化值是0。
	D:通过遍历就可以得到每一个二维数组的元素。
	E:把元素累加即可。
	F:最后输出sum，就是结果。
*/
class Array2Demo5 {
	public static void main(String[] args) {
		//把题目的数据用二维数组来表示
		int[][] arr = {{22, 66, 44}, {77, 33, 88}, {25, 45, 65}, {11, 66, 99}};
		
		//定义一个求和变量sum，初始化值是0。
		int sum = 0;
		
		//通过遍历就可以得到每一个二维数组的元素。
		for(int x = 0; x < arr.length; x ++) {
			for(int y = 0; y < arr[x].length; y ++) {
				//把元素累加即可。
				sum += arr[x][y];
			}
		}
		
		//最后输出sum，就是结果。
		System.out.println("一年的销售额为：" + sum + "万元"); // 641
	}
}
