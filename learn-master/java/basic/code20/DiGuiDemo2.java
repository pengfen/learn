package com.test;

/*
 * 需求：请用代码实现求5的阶乘。
 * 下面的知识要知道：
 * 		5! = 1*2*3*4*5
 * 		5! = 5*4!
 * 
 * 有几种方案实现呢?
 * 		A:循环实现
 * 		B:递归实现
 * 			a:做递归要写一个方法
 * 			b:出口条件
 * 			c:规律
 */
public class DiGuiDemo2 {
	public static void main(String[] args) {
		int jc = 1;
		for (int x = 2; x <= 5; x++) {
			jc *= x;
		}
		System.out.println("5的阶乘是：" + jc);
		
		System.out.println("5的阶乘是："+jieCheng(5));
	}
	
	/*
	 * 做递归要写一个方法:
	 * 		返回值类型：int
	 * 		参数列表：int n
	 * 出口条件:
	 * 		if(n == 1) {return 1;}
	 * 规律:
	 * 		if(n != 1) {return n*方法名(n-1);}
	 */
	public static int jieCheng(int n){
		if(n==1){
			return 1;
		}else {
			return n*jieCheng(n-1);
		}
	}
}
