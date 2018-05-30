package com.test;
/*
需求：求5的阶乘。

什么是阶乘呢?
	n! = n*(n-1)! 规则
	n! = n*(n-1)*(n-2)*...*3*2*1
	
求和思想。
求阶乘思想。
*/
class ForDemo6 {
	public static void main(String[] args) {
		//定义最终结果变量
		int jc = 1;
		
		//这里的x其实可以直接从2开始
		//for(int x=1; x<=5; x++) 
		
		for(int x=2; x<=5; x++) {
			jc *=x;
		}
		
		System.out.println("1-5的阶乘是："+jc);
	}
}