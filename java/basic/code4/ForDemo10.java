package com.test;
/*
需求：请统计1-1000之间同时满足如下条件的数据有多少个：
		对3整除余2
		对5整除余3
		对7整除余2

分析：
	A:定义统计变量,初始化值是0
	B:1-1000之间是一个范围，用for很容易就可以实现。
	C:每个数据要同时满足如下要求
		x%3==2
		x%5==3
		x%7==2
	D:如果满足条件，统计数据++即可，最后输出统计变量
*/
class ForDemo10 {
	public static void main(String[] args) {
		//定义统计变量,初始化值是0
		int count = 0;
	
		//1-1000之间是一个范围，用for很容易就可以实现。
		for(int x=1; x<=1000; x++) {
			/*
				每个数据要同时满足如下要求
				x%3==2
				x%5==3
				x%7==2
			*/
			if(x%3==2 && x%5==3 && x%7==2) {
				count++;
				System.out.println(x);
			}
		}
		
		//输出数据
		System.out.println("满足这样条件的数据共有："+count+"个");
	}
}
