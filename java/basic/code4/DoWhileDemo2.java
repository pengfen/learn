package com.test;
/*
循环语句的区别:
	do...while循环至少执行一次循环体。
	而for,while循环必须先判断条件是否成立，然后决定是否执行循环体语句。
	
那么，我们一般使用哪种循环呢?
	优先考虑for，其次考虑while，最后考虑do...while
*/
class DoWhileDemo2 {
	public static void main(String[] args) {
		int x = 3;
		while(x < 3) {
			System.out.println("我爱林青霞");
			x++;
		}
		
		System.out.println("--------------");
		
		int y = 3;
		do {
			System.out.println("我爱林青霞");
			y++;
		}while(y < 3);
	}
}