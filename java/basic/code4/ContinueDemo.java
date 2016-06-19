package com.test;
/*
continue:继续

使用场景：
	循环中。离开此场景无意义。
	
测试，找到和break的区别：
	break:跳出单层循环
	continue:跳出一次循环，进入下一次的执行
	
练习题：
	for(int x=1; x<=10; x++) {
		if(x%3==0) {
			//在此处填写代码
		}
		System.out.println(“Java基础班”);
	}
	
	我想在控制台输出2次:“Java基础班“
		break;
	我想在控制台输出7次:“Java基础班“
		continue;
	我想在控制台输出13次:“Java基础班“	
		System.out.println(“Java基础班”);


*/
class ContinueDemo {
	public static void main(String[] args) {
		for(int x=0; x<10; x++) {
			if(x == 3) {
				//break;
				continue;
			}
			
			System.out.println(x);
		}
	}
}