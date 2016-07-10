package com.test;

import java.util.Scanner;

/*
 * 校验qq号码.
 * 		1:要求必须是5-15位数字
 * 		2:0不能开头
 * 
 * 分析：
 * 		A:键盘录入一个QQ号码
 * 		B:写一个功能实现校验
 * 		C:调用功能，输出结果。
 */
public class RegexDemo {
	public static void main(String[] args) {
		// 创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的QQ号码：");
		String qq = sc.nextLine();
		
		System.out.println("checkQQ:"+checkQQ(qq));
	}

	/*
	 * 写一个功能实现校验 两个明确： 明确返回值类型：boolean 明确参数列表：String qq
	 */
	public static boolean checkQQ(String qq) {
		boolean flag = true;

		// 校验长度
		if (qq.length() >= 5 && qq.length() <= 15) {
			// 0不能开头
			if (!qq.startsWith("0")) {
				// 必须是数字
				char[] chs = qq.toCharArray();
				for (int x = 0; x < chs.length; x++) {
					char ch = chs[x];
					if (!Character.isDigit(ch)) {
						flag = false;
						break;
					}
				}
			} else {
				flag = false;
			}
		} else {
			flag = false;
		}

		return flag;
	}
}

/*
 * 字符
 *    x 字符  举例  'a'表示字符a
 *    \\ 反斜线字符
 *    \n 新行(换行)符 ('\u000A')
 *    \r 回车符 ('\u000D')
 *    
 * 字符类
 *    [abc] a b 或 c (简单类)
 *    [^abc] 任何字符 除了 a b 或 c (否定)
 *    [a-zA-Z] a 到 z 或 A 到 Z 两头的字母包括在内 (范围)
 *    [0-9] 0到9的字符都包括
 *    
 * 预定义字符类
 *    . 任何字符 我的就是.字符本身 怎么表示呢 \.
 *    \d 数字[0-9]
 *    \w 单词字符[a-zA-Z_0-9] 在正则表达式里面组成单词的东西必须有这些东西组成
 *    
 * 边界匹配器
 *    ^ 行的开头
 *    $ 行的结尾
 *    \b 单词边界 就是不是单词字符的地方 举例 hello world?haha;xixi
 *    
 * Greedy数量词
 *     X? X, 一次或一次也没有
 *     X* X, 零次或多次
 *     X+ X, 一次或多次
 *     X{n} X, 恰好n次
 *     X{n,} X, 至少n次
 *     X{n,m} X, 至少n次 但是不超过m次
 */
