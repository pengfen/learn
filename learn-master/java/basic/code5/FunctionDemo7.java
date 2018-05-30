package com.test;
/*
键盘录入三个数据，返回三个数中的最大值
*/
import java.util.Scanner;

class FunctionDemo7 {
	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入第一个数据:");
		int a = sc.nextInt();
		
		System.out.println("请输入第二个数据:");
		int b = sc.nextInt();
		
		System.out.println("请输入第三个数据:");
		int c = sc.nextInt();
		
		int max = getMax(a,b,c);
		System.out.println("三个数据中的最大值是："+max);
	}
	
	/*
		需求；返回三个数中的最大值
		
		两个明确：
			返回值类型：int
			参数列表：int a,int b,int c
	*/
	public static int getMax(int a,int b,int c) {
		//if嵌套
		/*
		if(a > b) {
			if(a > c) {
				return a;
			}else {
				return c;
			}
		}else {
			if(b > c) {
				return b;
			}else {
				return c;
			}
		}
		*/
		
		//用三元改
		/*
		if(a > b) {
			return (a>c? a: c);
		}else {
			return (b>c? b: c);
		}
		*/
		
		//继续改进
		//return (a>b)? (a>c? a: c): (b>c? b: c);
		//不建议，写代码一定要注意阅读性强
		int temp = ((a>b)? a: b);
		int max = ((temp>c)? temp: c);
		return max;
	}
}
