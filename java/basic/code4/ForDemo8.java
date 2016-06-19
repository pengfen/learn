package com.test;
/*
练习：
	请在控制台输出满足如下条件的五位数
	个位等于万位
	十位等于千位
	个位+十位+千位+万位=百位
	
分析：
	A:五位数就告诉了我们范围。
	B:分解每一个五位数的个，十，百，千，万位上的数据
	C:按照要求进行判断即可
*/
class ForDemo8 {
	public static void main(String[] args) {
		//五位数就告诉了我们范围。
		for(int x=10000; x<100000; x++) {
			//分解每一个五位数的个，十，百，千，万位上的数据
			int ge = x%10;
			int shi = x/10%10;
			int bai  = x/10/10%10;
			int qian = x/10/10/10%10;
			int wan = x/10/10/10/10%10;
			
			//按照要求进行判断即可
			if((ge==wan) && (shi==qian) && (ge+shi+qian+wan==bai)) {
				System.out.println(x);
			}
		}
	}
}
