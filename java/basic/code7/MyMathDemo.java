package com.test;
/*
定义一个类MyMath,提供基本的加减乘除功能，然后进行测试。
*/
import java.util.Scanner;

class MyMath {
	//加法功能
	public int add(int a,int b) {
		return a + b;
	}
	
	//减法功能
	public int sub(int a,int b) {
		return a - b;
	}
	
	//乘法功能
	public int mul(int a,int b){
		return a * b;
	}
	
	//除法功能
	public int div(int a,int b) {
		return a / b;
	}
}

//测试类
class MyMathTest {
	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入第一个操作数：");
		int firstNumber = sc.nextInt();
		System.out.println("请输入第二个操作数：");
		int secondNumber = sc.nextInt();
		
		//创建MyMath对象，并使用
		MyMath mm = new MyMath();
		
		System.out.println("加法结果："+mm.add(firstNumber,secondNumber));
		System.out.println("减法结果："+mm.sub(firstNumber,secondNumber));
		System.out.println("乘法结果："+mm.mul(firstNumber,secondNumber));
		System.out.println("除法结果："+mm.div(firstNumber,secondNumber));
	}
}
