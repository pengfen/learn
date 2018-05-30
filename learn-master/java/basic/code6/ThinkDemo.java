package com.test;

/*
˼����1��������д�����Ȼ�����Ϊʲô��������ӵġ�����ͼ���⡣����ܽ�Java�в������ݹ��ɡ�

Java�еĲ����������⣺
	�������ͣ���ʽ�����ĸı��ʵ�ʲ���û��Ӱ�졣
	�������ͣ���ʽ�����ĸı�ֱ��Ӱ��ʵ�ʲ�����
*/
class ThinkDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("a : " + a + ",b : " + b); //a:10,b:20
		change(a,b);
		System.out.println("a : " + a + ",b : " + b); //???	a:10,b:20
	
		int[] arr = {1, 2, 3, 4, 5}; 
		change(arr);
		System.out.println(arr[1]); //???	4
	}
	
	public static void change(int a,int b) { //a=10,b=20
		System.out.println("a : " + a + ",b : " + b); //a:10,b:20
		a = b;	//a=20
		b = a + b; //b=40
		System.out.println("a : " + a + ",b : " + b); //a:20,b:40
	}
	
	public static void change(int[] arr) { //arr={1,2,3,4,5};
		for(int x = 0; x < arr.length; x ++) {
			if(arr[x] % 2 == 0) {
				arr[x] *= 2;
			}
		}
		//arr={1,4,3,8,5};
	}
}
