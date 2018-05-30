package com.test;

/*
Test类，测试

导包：
	格式：import 包名;
		这种方式导入是到类的名称。
	注意：我们用谁就导谁。
	
面试题：
	package,import,class有没有顺序关系?
	有。
	package > import > class
	
	Package:只能有一个
	import:可以有多个
	class:可以有多个，以后建议是一个
*/

class ImportDemo {
	public static void main(String[] args) {
		//Demo d = new Demo();
		/*
		com.liuyi.Demo d = new com.liuyi.Demo();
		System.out.println(d.sum(10,20));
		
		com.liuyi.Demo d2 = new com.liuyi.Demo();
		System.out.println(d2.sum(10,20));
		
		com.liuyi.Demo d3 = new com.liuyi.Demo();
		System.out.println(d3.sum(10,20));
		
		com.liuyi.Demo d4 = new com.liuyi.Demo();
		System.out.println(d4.sum(10,20));
		*/
		
		ImportDemo2 d = new ImportDemo2();
		System.out.println(d.sum(10,20));
	}
}

/*
第一个问题：找不到Demo

第二个问题：程序包com.liuyi不存在

第三个问题： Demo在com.liuyi中不是公共的; 无法从外部程序包中对其进行访问
*/