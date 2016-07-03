package com.test;

/*
Math:类包含用于执行基本数学运算的方法

由于Math类在java.lang包下，所以不需要导包。
特点：
	没有构造方法，因为它的成员全部是静态的。 调用 类名.方法 Math.random() ...
	
掌握一个方法：
	获取随机数
	public static double random():返回带正号的 double 值，该值大于等于 0.0 且小于 1.0。
*/
class MathDemo {
	public static void main(String[] args) {
		//获取一个随机数
		//double d = Math.random();
		//System.out.println(d);
		
		//需求：我要获取一个1-100之间的随机数，肿么办?
		for(int x = 0; x < 100; x ++) {
			int number = (int)(Math.random() * 100) + 1;
			System.out.println(number);
		}
	}
}

/*
 * 如何使用帮助文档
 * 
 * 打开帮助文档
 * 点击显示 找到索引 看到输入框
 * 知道你要找谁 以Scanner举例
 * 在输入框里面输入Scanner 然后回车
 * 
 * 看包 java.lang包下的类不需要导入 其他的全部需要导入
 *    要导入 java.util.Scanner
 * 再简单的看看类的解释和说明 别忘了看看该类的版本
 * 看类的结构
 *    成员变量 字段摘要
 *    构造方法 构造方法摘要
 *    成员方法 方法摘要
 * 学习构造方法
 *    有构造方法 就创建对象
 *    没有构造方法 成员可能都是静态的
 * 看成员方法
 *    左边 
 *       是否静态 如果静态 可以通过类名调用
 *       返回值类型 人家返回什么 你就用什么接收
 *    右边
 *       看方法名 方法名称不要写错
 *       参数列表 人家要什么 你就给什么 人家要几个 你就给几个
 */