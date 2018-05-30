package com.test;

/*
循环语句：for循环,while循环,do...while循环。

for循环格式：
	for(初始化语句;判断条件语句;控制条件语句) {
		循环体语句;
	}
	
	执行流程：
		A:执行初始化语句
		B:执行判断条件语句,看其返回值是true还是false
			如果是true，就继续执行
			如果是false，就结束循环
		C:执行循环体语句;
		D:执行控制条件语句
		E:回到B继续。
		
注意事项：
	A:判断条件语句无论简单还是复杂结果是boolean类型。
	B:循环体语句如果是一条语句，大括号可以省略；如果是多条语句，大括号不能省略。建议永远不要省略。
	C:一般来说：有左大括号就没有分号，有分号就没有左大括号
		
需求：请在控制台输出10次"HelloWorld"
*/
class ForDemo2 {
	public static void main(String[] args) {
		//最原始的做法
		System.out.println("HelloWorld");
		System.out.println("HelloWorld");
		System.out.println("HelloWorld");
		System.out.println("HelloWorld");
		System.out.println("HelloWorld");
		System.out.println("HelloWorld");
		System.out.println("HelloWorld");
		System.out.println("HelloWorld");
		System.out.println("HelloWorld");
		System.out.println("HelloWorld");
		System.out.println("----------");
		
		//这种做法不好,代码的重复度太高。
		//所以呢，我们用循环改进
		for(int x=1;x<=10;x++) {
			System.out.println("HelloWorld");
		}
	}
}
