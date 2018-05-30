package com.test;

/*
 * 面试题：
 * 1:final,finally和finalize的区别
 * final：最终的意思，可以修饰类，成员变量，成员方法
 * 		修饰类，类不能被继承
 * 		修饰变量，变量是常量
 * 		修饰方法，方法不能被重写
 * finally：是异常处理的一部分，用于释放资源。
 * 		一般来说，代码肯定会执行，特殊情况：在执行到finally之前jvm退出了
 * finalize：是Object类的一个方法，用于垃圾回收
 * 
 * 2:如果catch里面有return语句，请问finally里面的代码还会执行吗?
 *   如果会，请问是在return前，还是return后。
 * 	   会。前。
 * 
 * 	 准确的说，应该是在中间。
 * 
 * 3:try...catch...finally的格式变形
 * 		A:try...catch...finally
 * 		B:try...catch
 * 		C:try...catch...catch...
 * 		D:try...catch...catch...finally
 * 		E:try...finally
 * 			这种做法的目前是为了释放资源。
 */
public class FinallyDemo2 {
	public static void main(String[] args) {
		System.out.println(getInt());
	}

	public static int getInt() {
		int a = 10;
		try {
			System.out.println(a / 0);
			a = 20;
		} catch (ArithmeticException e) {
			a = 30;
			return a;
			/*
			 * return a在程序执行到这一步的时候，这里不是return a而是return 30;这个返回路径就形成了。
			 * 但是呢，它发现后面还有finally，所以继续执行finally的内容，a=40
			 * 再次回到以前的返回路径，继续走return 30;
			 */
		} finally {
			a = 40;
			return a;//如果这样结果就是40了。
		}
		// return a;
	}
}
