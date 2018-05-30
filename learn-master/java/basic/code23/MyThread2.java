package cn.itcast_02;

/*
 * 该类要重写run()方法,为什么呢?
 * 不是类中的所有代码都需要被线程执行的。
 * 而这个时候，为了区分哪些代码能够被线程执行，java提供了Thread类中的run()用来包含那些被线程执行的代码。
 */
public class MyThread extends Thread {

	@Override
	public void run() {
		// 自己写代码
		// System.out.println("好好学习，天天向上");
		// 一般来说，被线程执行的代码肯定是比较耗时的。所以我们用循环改进
		for (int x = 0; x < 200; x++) {
			System.out.println(x);
		}
	}

}
