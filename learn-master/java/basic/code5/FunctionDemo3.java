package com.test;
/*
 * 需求 在控制台输出如下的形状
 *   *****
 *   *****
 *   *****
 *   *****
 *   
 * void类型返回值的方法调用
 *     单独调用
 *     输出调用(错误)
 *     赋值调用(错误)
 */
public class FunctionDemo3 {
	public static void main(String[] args) {
		// for 循环嵌套输出图形
		for (int x = 0; x < 4; x ++) {
			for (int y = 0; y < 5; y ++) {
				System.out.println("*");
			}
			System.out.println();
		}
		System.out.println("------------------------");
		
		// 需求 我要在控制台输出一个6行7列的星形图形
		for (int x = 0; x < 6; x ++) {
			for (int y = 0; y < 7; y ++) {
				System.out.println("*");
			}
			System.out.println();
		}
		System.out.println("---------------------");
		
		// 如果需要继续改变 我们就应该考虑使用方法改进
		// 单独调用
		pringXing(3, 4);
		System.out.println("--------------------");
		pringXing(6, 7);
		System.out.println("--------------------");
		pringXing(8, 9);
		
		// 输出调用
		// 此处不允许使用 '空' 类型
		// System.out.println(pringXing(3, 4));
		
		// 赋值调用
		// 非法的表达式开始
		// void v = pringXing(3, 4);
	}
	
	/*
	 * 写一个什么样子的方法呢 写一个m行n列的代码
	 * 
	 * 两个明确
	 *    返回值类型 这个时候没有明确的返回值 不写东西还不行 所以 这里记住是void
	 *    参数列表 int m, int n
	 */
	public static void pringXing(int m, int n) {
		for (int x = 0; x < m; x ++) {
			for (int y = 0; y < n; y ++) {
				System.out.println("*");
			}
			System.out.println();
		}
	}
}
