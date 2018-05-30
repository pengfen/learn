package com.test;

class Top {
	static int x = 1;
	public Top() {x *= 3;}
}

class Middle extends Top {
	public Middle(int y) {
		super();
		x += 1;
	}

	//public Middle() { x += 1;}
	public static void main(String[] args) {
	    Middle m = new Middle(3);
	    System.out.println(x);
	}
}
