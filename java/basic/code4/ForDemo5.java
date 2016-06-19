package com.test;

/*
需求：
	A:求1-100之和。
	B:求出1-100之间偶数和
	C:求出1-100之间奇数和(自己做)
*/
class ForDemo5 {
	public static void main(String[] args) {
		//求1-100之和。
		int sum1 = 0;
		
		for(int x=1; x<=100; x++) {
			sum1 +=x;
		}
		
		System.out.println("1-100之和是："+sum1);
		System.out.println("------------------");
		
		//求出1-100之间偶数和
		//方式1
		int sum2 = 0;
		
		for(int x=1; x<=100; x++) {
			if(x%2 == 0) {
				sum2 += x;
			}
		}
		
		System.out.println("1-100偶数之和是："+sum2);
		System.out.println("------------------");
		
		//方式2
		int sum3 = 0;
		
		for(int x=0; x<=100; x+=2) {
				sum3 += x;
		}
		
		System.out.println("1-100偶数之和是："+sum3);
		System.out.println("------------------");
	}
}
