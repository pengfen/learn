package com.demo;
/**
 * if语句格式2
 *     if(比较表达式) {
 *         语句体1;
 *     } else {
 *         语句体2;
 *     }
 *     
 * 执行流程
 *    首先计算比较表达式的值 看其返回值是true还是false
 *    如果是true 就执行语句体1
 *    如果是false 就执行语句体2
 *    
 *    注意 else后面是没有比较表达式的 只有if后面有
 *
 */
public class IfDemo3 {
	public static void main(String[] args) {
		// 判断两个数据是否相等
		
		int a = 10;
		int b = 20;
		
		if (a == b) {
			System.out.println("a等于b");
		} else {
			System.out.println("a不等于b");
		}
	}
}
