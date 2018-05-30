package cn.itcast_10;

/*
 * 举例：
 * 		火车上厕所。
 * 
 * 同步的特点：
 * 		前提：
 * 			多个线程
 *		解决问题的时候要注意：
 *			多个线程使用的是同一个锁对象
 * 同步的好处 
 *		同步的出现解决了多线程的安全问题。
 * 同步的弊端
 *		当线程相当多时，因为每个线程都会去判断同步上的锁，这是很耗费资源的，无形中会降低程序的运行效率。
 */
public class SellTicketDemo {
	public static void main(String[] args) {
		// 创建资源对象
		SellTicket st = new SellTicket();

		// 创建三个线程对象
		Thread t1 = new Thread(st, "窗口1");
		Thread t2 = new Thread(st, "窗口2");
		Thread t3 = new Thread(st, "窗口3");

		// 启动线程
		t1.start();
		t2.start();
		t3.start();
	}
}