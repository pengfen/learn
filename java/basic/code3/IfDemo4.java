package com.demo;
/*
 * 由于if语句的第二种格式刚才也完成了三元运算符可以完成的效果
 * 所以 我们就认为他们可以完成一样的操作
 * 但是 他们就一点区别没有吗 肯定不是
 * 
 * 区别
 *    三元运算符实现的 都可以采用if语句实现 反之不成立
 *    
 *    什么时候if语句实现不能用三元改进呢
 *       当if语句控制的操作是一个输出语句的时候就不能
 *       为什么呢 因为三元运算符是一个运算符 运算符操作完毕就应该有一个结果 而不是一个输出
 */
public class IfDemo4 {
	public static void main(String[] args) {
		// 获取两个数据的最大值
		int a = 10;
		int b = 20;
		
		// 用if语句实现
		int max1;
		if (a > b) {
			max1 = a;
		} else {
			max1 = b;
		}
		System.out.println("max1 : " + max1);
		
		// 用三元改进
		int max2 = (a > b) ? a : b;
		System.out.println("max2 : " + max2);
		System.out.println("---------------------------");
		
		// 判断一个数据是奇数还是偶数 并输出是奇数还是偶数
		int x = 100;
		
		if (x % 2 == 0) {
			System.out.println("100是一个偶数");
		} else {
			System.out.println("100是一个奇数");
		}
		
		// 用三元改进
		// 这种改进是错误的
		// Strint s = (x % 2 == 0)?System.out.println("100是一个偶数");:System.out.println("100是一个奇数");
	}
}
