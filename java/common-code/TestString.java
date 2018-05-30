package com.java;

public class TestString {
	public static void main(String[] args) {
		// 定义字符串
		String hobby = "learn";
		String url = "www.learn.com";
		
		// 输出字符串
		System.out.println("hobby: " + hobby);
		System.out.println("url: " + url);
		
		String s1 = "peng";
		String s2 = "peng";
		// 定义字符串 s3 保存 "I love" 和 s1 拼接后的内容
		String s3 = "I love" + s1;
		// 比较字符串 s1 和 s2
		// peng 为常量字符串 多次出现时会被编译器优化 只创建一个对象
		System.out.println("s1和s2内存地址相同吗 " + (s1 == s2));
		// 比较字符串 s1 和 s3
		System.out.println("s1和s3内存地址相同吗 " + (s1 == s3));
		String s4 = "I love" + s1;
		// 比较字符串 s4 和 s3
		// s1 是变量 s4 在运行时才知道具体值 所以 s3 和 s4 是不同的对象
		System.out.println("s3 和 s4 内存地址相同吗?" + (s4 == s3));
		
		String fileName = "TestString.java"; // 定义文件名
		String email = "peng8787@163.com"; // 定义邮箱
		
		// 判断 .java 文件名是否正确 合法的文件名应该以 .java 结尾
		// 1 获取文件名中最后一次出现 '.' 号的位置
		// 2 根据 '.' 号的位置 获取文件的后缀
		// 3 判断 '.' 号位置及文件后缀名
		// 获取文件名中最后一次出现 '.' 号的位置
		int index = fileName.lastIndexOf('.');
		// 获取文件的后缀
		String prefix = fileName.substring(index);
		// 判断必须包含 "." 号, 且不能出现在首位 同时后缀名为 java
		// fileName.indexOf('.') != -1 判断必须包含 '.'
		// index != 0 判断不能出现在首位
		// prefix.equals(".java") 判断后缀名为 java
		if (fileName.indexOf('.') != -1 && index != 0 && prefix.equals(".java")) {
			System.out.println("Java 文件名正确");
		} else {
			System.out.println("Java 文件名无效");
		}
		
		// 判断邮箱格式是否正确 合法的邮箱名中至少要包含 "@" 并且 "@" 是在 "." 之前
		// 1  获取文件名中 "@" 符号的位置
		// 2  获取邮箱中 "." 号的位置
		// 3  判断必须包含 "@" 符号 且 "@" 必须在 "." 之前
		
		// 获取邮箱中 "@" 符号的位置
		int index2 = email.lastIndexOf("@");
		// 获取邮箱中 "." 号的位置
		int index3 =  email.indexOf('.');
		// 判断必须包含 "@" 符号 且 "@" 必须在 "." 这前
		if (index2 != -1 && index3 > index2) {
			System.out.println("邮箱格式正确");
		} else {
			System.out.println("邮箱格式无效");
		}
		
		// 定义一个字符串
		String s = "asdfglfghjklaaakljlkjaakkkjooj";
		// 出现次数
		int num = 0;
		// 循环遍历每个字符 判断是否是字符 a 如果是 累加次数
		for (byte bt : s.getBytes()) { // 获取是 ASCII 值
			// 获取每个字符, 判断是否是字符 a
			// System.out.println("bt 的值: " + bt);
			if (bt == 'a') {
				num ++; // 累加统计次数
			}
		}
		System.out.println("字符 a 出现的次数: " + num);
		
		// 创建一个 StringBuilder 对象 用来存储字符串
		StringBuilder peng = new StringBuilder("peng");
		System.out.println(peng);
		
		// 创建一个 StringBuilder 对象
		StringBuilder sb = new StringBuilder();
		// 追加字符串
		sb.append("lkjlklkdddlka");
		System.out.println(sb);
		// 从后往前每隔三位插入逗号 最后面不加 , 使用 sb.length() -3
		for(int i = (sb.length() - 3); i > 0; i-=3){
		    sb.insert(i, ","); 
		}
		
		// 将 StringBuilder 对象转换为 String 对象并输出
		System.out.println(sb.toString());
	}
}
