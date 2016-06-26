package com.test;

class Wrench {
	public static void main(String[] args) {
	    Wrench w = new Wrench();
	    Wrench w2 = new Wrench();
	    w2 = go(w, w2);
	    System.out.print(w2 == w);
	    
	    short a, b, c;
	    a = 1;
	    b = 2;
	    c = (short) (a + b);
	    a += 2;
	    
	    String s = "123";
	    String s1 = s + 456;
	    System.out.println(s1);
	    
	    for (int i = 0; i < 10; i ++){
        if(i == 3)
        break;
        System.out.print (i);
        }
	    
	    int x = 6;
	    if (x > 1) {
	        System.out.println("x > 1");
	    } else if (x > 5) {
	        System.out.println("x > 5");
	    } else if (x < 10) {
	        System.out.println("x < 10");
	    } else if (x < 29) {
	        System.out.println("x < 29");
	    } else {
	        System.out.println("以上都不是");
	    }
	    
	    
	    int[] myarray = {10, 11, 12, 13, 14};
	    System.out.println(myarray.length);
	    int sum = 0;
	    for  (int i : myarray) {
	        sum += i;
	        System.out.println("sum = " + sum);
	    }
	    
	    boolean state = false;
        int i = 2;
        if ((++ i > 2) && (state = true)) {
            i ++;
        }
        if ((++ i > 4) || (state = false)) i ++;
        System.out.println(i);

	}


	static Wrench go(Wrench wr1, Wrench wr2) {
	    Wrench wr3 = wr1;
	    wr1 = wr2;
	    wr2 = wr3;
	    return wr3;
	}
}
