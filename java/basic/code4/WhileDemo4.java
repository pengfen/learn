package com.test;
/*
while循环和for循环的区别?
	使用区别：如果你想在循环结束后，继续使用控制条件的那个变量，用while循环，否则用for循环。不知道用for循环。
	          因为变量及早的从内存中消失，可以提高内存的使用效率。
			  
	其实还有一种场景的理解:
		如果是一个范围的，用for循环非常明确。
		如果是不明确要做多少次，用while循环较为合适。
			举例：吃葡萄。
*/
class WhileDemo4 {
	public static void main(String[] args) {
		//for循环实现
		for(int x=0; x<10; x++) {
			System.out.println("学习Java技术哪家强,中国北京传智播客");
		}
		//这里不能在继续访问了
		//System.out.println(x);
		
		//while循环实现
		int y = 0;
		while(y<10) {
			System.out.println("学习Java技术哪家强,中国北京传智播客");
			y++;
		}
		//这里是可以继续访问的
		System.out.println(y);
	}
} 
