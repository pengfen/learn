package com.java;

public class TestTry {
	public static void main(String[] args) {
		TestTry tt = new TestTry();
		int result = tt.test();
		System.out.println("test() 方法, 执行完毕 返回值为: " + result);
		int result2 = tt.test2();
		System.out.println("我想大声告诉你 test2() 执行完毕");
	}
	
	/**
	 * divider(除数)
	 * result(结果)
	 * try-catch 捕获 while 循环
	 * 每次循环 divider 减一  result = result + 100 / divider
	 * 如果 捕获异常 打印输出 "抛出异常了" 返回 -1
	 * 否则 返回 result
	 * @return
	 */
	public int test() {
		int divider = 10;
		int result = 100;
		try {
			while (divider > -1) {
				divider --;
				result = result + 100 / divider;
			}
			return result;
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("循环抛出异常了");
			return -1;
		}
	}
	
	/**
	 * divider(除数)
	 * result(结果)
	 * try-catch 捕获 while 循环
	 * 每次循环 divider 减一  result = result + 100 / divider
	 * 如果 捕获异常 打印输出 "抛出异常了" 返回 result = 999
	 * 否则 返回 result
	 * finally 打印输出 这是 finally 哈哈 同时打印输出 result 的值
	 * @return
	 */
	public int test2() {
		int divider = 10;
		int result = 100;
		try {
			while (divider > -1) {
				divider --;
				result = result + 100 / divider;
			}
			return result;
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("循环抛出异常了");
			return result = 999;
		} finally {
			System.out.println("这是 finally 哈哈");
			System.out.println("我是 result 我的值是: " + result);
		}
	}
}
