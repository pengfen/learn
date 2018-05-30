package com.test;
/*
 * 方法的注意事项
 *    方法不调用不执行
 *    方法与方法是平级关系 不能嵌套定义
 *    方法定义的时候参数之间用逗号隔开
 *    方法调用的时候不用在传递数据类型
 *    如果方法用明确的返回值 一定要有return带回一个值
 */
public class FunctionDemo2 {
	public static void main(String[] args) { // 第一步 程序从main方法开始执行
		int x = 10; // 第二步 定义了两个int类型的变量 
		int y = 20;
		
		int result = sum(x, y); // 第三步 调用方法
		System.out.println(result); // 输出result 其实就是输出30
		/*
		 * 错误的
		 * public static int sum(int a, int b) {return a + b;}
		 */
		
		// sum(10, 20);
		
		// int x = 10;
		// int y = 20;
		// 错误
		// sum(int x, int y);
	}
	
	public static int sum(int a, int b) { // 第四步 分别把x y的值给了a b
		return a + b; // 第五步 把a + b的结果计算出来
		// 第六步 通过return 把30返回
	}
}
