package com.test;

class Passer {
	static final int x = 5;
	public static void main(String[] args) {
	    new Passer().go(x);
	    System.out.print(x);
	}

	void go (int x) {
	    System.out.print(x ++);
	}
}
