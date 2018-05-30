package com.test;
/*
控制跳转语句：
	break:中断
	continue:继续
	return:返回

break:中断的意思
使用场景：
	A:switch语句中
	B:循环语句中。
		(循环语句中加入了if判断的情况)
	注意：离开上面的两个场景，无意义。
	
如何使用呢?
	A:跳出单层循环
	B:跳出多层循环
		要想实现这个效果，就必须知道一个东西。带标签的语句。
		格式：
			标签名: 语句
*/
class BreakDemo {
	public static void main(String[] args) {
		//在 switch 或 loop 外部中断
		//break;
		
		//跳出单层循环
		for(int x=0; x<10; x++) {
			if(x == 3) {
				break;
			}
			System.out.println("HelloWorld");
		}
		
		System.out.println("over");
		System.out.println("-------------");
		
		wc:for(int x=0; x<3; x++) {
			nc:for(int y=0; y<4; y++) {
				if(y == 2) {
					//break nc;
					break wc;
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
