package com.test;
/*
看程序写结果
*/
class SwitchDemo3 {
	public static void main(String[] args) {
		int x = 2;
		int y = 3;
		switch(x){
			default:
				y++;
				break;
			case 3:
				y++;
			case 4:
				y++;
		}
		System.out.println("y="+y);
		System.out.println("---------------");
		
		int a = 2;
		int b = 3;
		switch(a){
			default:
				b++;
			case 3:
				b++;
			case 4:
				b++;
		}
		System.out.println("b="+b);
	}
}