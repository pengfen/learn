package com.test;

/*
main方法的格式讲解：
	public static void main(String[] args) {...}
	
	public:公共的，访问权限是最大的。由于main方法是被jvm调用，所以权限要够大。
	static:静态的，不需要创建对象，通过类名就可以。方便jvm的调用。
	void:因为我们曾经说过，方法的返回值是返回给调用者，而main方法是被jvm调用。你返回内容给jvm没有意义。
	main:是一个常见的方法入口。我见过的语言都是以main作为入口。
	String[] args:这是一个字符串数组。值去哪里了?
		这个东西到底有什么用啊?怎么给值啊?
			这个东西早期是为了接收键盘录入的数据的。
			格式是：
				java MainDemo hello world java
*/
class MainDemo {
	public static void main(String[] args) {
		//System.out.println(args); //[Ljava.lang.String;@175078b
		//System.out.println(args.length); //0
		//System.out.println(args[0]); //ArrayIndexOutOfBoundsException
		
		//接收数据后
		System.out.println(args); 
		System.out.println(args.length); 
		//System.out.println(args[0]); 
		for(int x=0; x<args.length; x++) {
			System.out.println(args[x]);
		}
	}
}
