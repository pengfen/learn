package com.test;

/*
����
	A:��1-100֮�͡�
	B:���1-100֮��ż����
	C:���1-100֮��������(�Լ���)
*/
class ForDemo5 {
	public static void main(String[] args) {
		//��1-100֮�͡�
		int sum1 = 0;
		
		for(int x=1; x<=100; x++) {
			sum1 +=x;
		}
		
		System.out.println("1-100֮���ǣ�"+sum1);
		System.out.println("------------------");
		
		//���1-100֮��ż����
		//��ʽ1
		int sum2 = 0;
		
		for(int x=1; x<=100; x++) {
			if(x%2 == 0) {
				sum2 += x;
			}
		}
		
		System.out.println("1-100ż��֮���ǣ�"+sum2);
		System.out.println("------------------");
		
		//��ʽ2
		int sum3 = 0;
		
		for(int x=0; x<=100; x+=2) {
				sum3 += x;
		}
		
		System.out.println("1-100ż��֮���ǣ�"+sum3);
		System.out.println("------------------");
	}
}
