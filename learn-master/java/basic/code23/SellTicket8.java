package cn.itcast_08;

public class SellTicket implements Runnable {
	// 定义100张票
	private int tickets = 100;

//	@Override
//	public void run() {
//		while (true) {
//			// t1,t2,t3三个线程
//			// 这一次的tickets = 100;
//			if (tickets > 0) {
//				// 为了模拟更真实的场景，我们稍作休息
//				try {
//					Thread.sleep(100); // t1就稍作休息,t2就稍作休息
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//
//				System.out.println(Thread.currentThread().getName() + "正在出售第"
//						+ (tickets--) + "张票");
//				// 理想状态：
//				// 窗口1正在出售第100张票
//				// 窗口2正在出售第99张票
//				// 但是呢?
//				// CPU的每一次执行必须是一个原子性(最简单基本的)的操作。
//				// 先记录以前的值
//				// 接着把ticket--
//				// 然后输出以前的值(t2来了)
//				// ticket的值就变成了99
//				// 窗口1正在出售第100张票
//				// 窗口2正在出售第100张票
//
//			}
//		}
//	}
	
	@Override
	public void run() {
		while (true) {
			// t1,t2,t3三个线程
			// 这一次的tickets = 1;
			if (tickets > 0) {
				// 为了模拟更真实的场景，我们稍作休息
				try {
					Thread.sleep(100); //t1进来了并休息，t2进来了并休息，t3进来了并休息，
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				System.out.println(Thread.currentThread().getName() + "正在出售第"
						+ (tickets--) + "张票");
				//窗口1正在出售第1张票,tickets=0
				//窗口2正在出售第0张票,tickets=-1
				//窗口3正在出售第-1张票,tickets=-2
			}
		}
	}
}
