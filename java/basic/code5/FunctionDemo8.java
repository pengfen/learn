package com.test;
/*
键盘录入行数和列数，输出对应的星形
*/
import java.util.Scanner;

class FunctionTest4 {
	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入行数：");
		int m = sc.nextInt();
		
		System.out.println("请输入列数：");
		int n = sc.nextInt();
		
		//void类型的方法调用
		pringXing(m,n);
	}
	
	/*
		输出星形
		
		两个明确：
			返回值类型：void
			参数列表：int m,int n
	*/
	public static void pringXing(int m,int n) {
		for(int x=0; x<m; x++) {
			for(int y=0; y<n; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
