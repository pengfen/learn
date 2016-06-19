package com.test;
/*
需求：小芳的妈妈每天给她2.5元钱，她都会存起来，但是，
      每当这一天是存钱的第5天或者5的倍数的话，她都会花去6元钱，
	  请问，经过多少天，小芳才可以存到100元钱。

分析：
	A:小芳的妈妈每天给她2.5元钱
		double dayMoney = 2.5;
	B:她都会存起来
		double daySum = 0;
	C:从第一天开始存储
		int dayCount = 1;
	D:经过多少天，小芳才可以存到100元钱。
		double result = 100;
	E:这一天是存钱的第5天或者5的倍数的话，她都会花去6元钱，
		说明要判断dayCount的值，如果对5整除就减去6元钱。
			daySum -= 6;
	  由此还隐含了一个问题，就是如果不是5的倍数天的话，钱要累加
			daySum += dayMoney;
	F:因为不知道是多少天，所以我用死循环，一旦超过100元我就退出循环。
*/
class WhileDemo6 {
	public static void main(String[] args) {
		//每天要存储的钱是2.5元
		double dayMoney = 2.5;
		
		//存钱的初始化值是0
		double daySum = 0;
		
		//从第一天开始存储
		int dayCount = 1;
		
		//最终存储不小于100就不存储了
		int result = 100;
		
		//因为不知道是多少天，所以我用死循环，
		while(true) {
			//累加钱
			daySum += dayMoney;
			
			//一旦超过100元我就退出循环。
			if(daySum >= result) {
				System.out.println("共花了"+dayCount+"天存储了100元");
				break;
			}
			
			if(dayCount%5 == 0) {
				//花去6元钱
				daySum -= 6;
				System.out.println("第"+dayCount+"天花了6元钱");
			}
			
			//天数变化
			dayCount++;
		}
	}
}
