package com.test;

import java.util.Scanner;

/*
 * 用switch语句实现键盘录入月份 输出对应的季节
 * 
 * 分析
 *    键盘录入一个月份 用Scanner实现
 *    用switch语句实现即可
 *    
 * if语句和switch语句的区别
 *    if语句
 *       针对结果是boolean类型的判断
 *       针对一个范围的判断
 *       针对几个常量值的判断
 *       
 *    switch语句 针对几个常量值的判断
 */
public class SwitchDemo6 {
	public static void main(String[] args) {
		// 创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		
		// 录入数据
		System.out.println("请输入月份(1-12): ");
		int month = sc.nextInt();
		
//		switch(month) {
//			case 1:
//				System.out.println("冬季"); 
//				break;
//			case 2:
//				System.out.println("冬季"); 
//				break;
//			case 3:
//				System.out.println("春季"); 
//				break;
//			case 4:
//				System.out.println("春季"); 
//				break;
//			case 5:
//				System.out.println("春季"); 
//				break;
//			case 6:
//				System.out.println("夏季"); 
//				break;
//			case 7:
//				System.out.println("夏季"); 
//				break;
//			case 8:
//				System.out.println("夏季"); 
//				break;
//			case 9:
//				System.out.println("秋季"); 
//				break;
//			case 10:
//				System.out.println("秋季"); 
//				break;
//			case 11:
//				System.out.println("秋季"); 
//				break;
//			case 12:
//				System.out.println("冬季"); 
//				break;
//			default:
//				System.out.println("你输入的月份有误");
//		}
		
		// 这样写太麻烦了 我们使用一个我们不想使用的东西 case穿透
		
		switch(month) {
		    case 1:
		    case 2:
		    case 12:
		    	System.out.println("冬季"); 
		    	break;
		    case 3:
		    case 4:
		    case 5:
		    	System.out.println("春季"); 
		    	break;
		    case 6:
		    case 7:
		    case 8:
		    	System.out.println("夏季"); 
		    	break;
		    case 9:
		    case 10:
		    case 11:
		    	System.out.println("秋季"); 
		    	break;
	    	default:
	    		System.out.println("你输入的月份有误");
		}
	}
}
