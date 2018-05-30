package com.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 获取功能
 *		Pattern和Matcher类的使用
 *		
 *		模式和匹配器的基本使用顺序
 */
public class RegexDemo9 {
	public static void main(String[] args) {
		// 模式和匹配器的典型调用顺序
		// 把正则表达式编译成模式对象
		Pattern p = Pattern.compile("a*b");
		// 通过模式对象得到匹配器对象，这个时候需要的是被匹配的字符串
		Matcher m = p.matcher("aaaaab");
		// 调用匹配器对象的功能
		boolean b = m.matches();
		System.out.println(b);
		
		//这个是判断功能，但是如果做判断，这样做就有点麻烦了，我们直接用字符串的方法做
		String s = "aaaaab";
		String regex = "a*b";
		boolean bb = s.matches(regex);
		System.out.println(bb);
	}
}

