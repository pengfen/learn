package com.test;

/*
 * 字符串的特点：一旦被赋值，就不能改变。
 */
public class StringDemo2 {
	public static void main(String[] args) {
		String s = "hello";
		s += "world";
		System.out.println("s : " + s); // helloworld
	}
}
/*
字符串直接赋值的方式是先到字符串常量池里面去找 如果有就直接返回 没有 就创建并返回
栈
String s --- 0x001
找不到 会创建 创建后会指向 0x003

方法区
字符串常量池
"hello" 0x001
"world" 0x002
"hello""world" 0x003
*/