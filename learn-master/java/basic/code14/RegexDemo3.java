package com.test;

import java.util.Scanner;

/*
 * 判断功能
 *		String类的public boolean matches(String regex)
 *
 * 需求：
 * 		判断手机号码是否满足要求?
 * 
 * 分析：
 * 		A:键盘录入手机号码
 * 		B:定义手机号码的规则
 * 			13436975980
 * 			13688886868
 * 			13866668888
 * 			13456789012
 * 			13123456789
 * 			18912345678
 * 			18886867878
 * 			18638833883
 * 		C:调用功能，判断即可
 * 		D:输出结果
 */
public class RegexDemo3 {
	public static void main(String[] args) {
		//键盘录入手机号码
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的手机号码：");
		String phone = sc.nextLine();
		
		//定义手机号码的规则
		String regex = "1[38]\\d{9}";
		
		//调用功能，判断即可
		boolean flag = phone.matches(regex);
		
		//输出结果
		System.out.println("flag:"+flag);
	}
}