package com.test;

/*
����ͳ��ˮ�ɻ����ж��ٸ�
*/
class WhileDemo3 {
	public static void main(String[] args) {
		//forѭ���汾
		int count = 0;
		
		for(int x=100; x<1000; x++) {
			int ge = x%10;
			int shi = x/10%10;
			int bai = x/10/10%10;
			
			if((ge*ge*ge+shi*shi*shi+bai*bai*bai) == x) {
				count++;
			}
		}
		
		System.out.println("count:"+count);
		System.out.println("------------");
		
		//whileѭ���汾
		int count2 = 0;
		
		int y = 100;
		while(y<1000) {
			int ge = y%10;
			int shi = y/10%10;
			int bai = y/10/10%10;
			
			if((ge*ge*ge+shi*shi*shi+bai*bai*bai) == y) {
				count2++;
			}
			
			y++;
		}
		
		System.out.println("count2:"+count2);
	}
}
