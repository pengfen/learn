package com.test;

public class Tester {
	public static void main(String[] args) {
//		int x = 5;
//	    Integer x1 = x; Integer x2 = x;
//	    int x3 = new Integer(5);
//
//	    System.out.print(x1.equals(x));
//	    System.out.print(x1 == x);
//	    System.out.print(x2.equals(x1));
//	    System.out.print(x2 == x1);
//	    System.out.print(x2 == x3);
//	    System.out.print(x2.equals(x3));
//	    
//	    int x4 = 0;
//	    int y = 4;
//	    for (int z = 0; z < 3; z ++) {
//	        if (x4 > 1 & ++ y < 10) {
//	            y ++;
//	        }
//	        System.out.println(y);
//	    }
	    //System.out.println(y);
	    
//		boolean x = true;
//	    boolean y = false;
//	    short z = 20;
//
//	    if ((x == true) && (y = true)) z ++;
//	    if ((y == true) || (++ z == 22)) z ++;
//	    System.out.println("z = " + z);
//	    
//	    int i = 5;
//	    System.out.print("4" + i + "");
//	    System.out.print(i + 5 + "7");
//	    System.out.println(i + "8");
		
		int[] x = {1, 2, 3};
	    x[1] = (x[1] > 1) ? x[2] : 0;
	    System.out.println(x[1]);
	    
	    boolean state = false;
        int i = 2;
        if ((++ i > 2) && (state = true)) {
            i ++;
        }
        if ((++ i > 4) || (state = false)) i ++;
        System.out.println(i);
	}
}
