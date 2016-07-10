package cn.itcast_08;

/*
 * 实现Runnable接口的方式实现
 * 
 * 通过加入延迟后，就产生了连个问题：
 * A:相同的票卖了多次
 * 		CPU的一次操作必须是原子性的
 * B:出现了负数票
 * 		随机性和延迟导致的
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