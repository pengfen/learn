package cn.itcast_09;

public class SellTicket implements Runnable {
	// 定义100张票
	private int tickets = 100;
	//创建锁对象
	private Object obj = new Object();

//	@Override
//	public void run() {
//		while (true) {
//			synchronized(new Object()){
//				if (tickets > 0) {
//					try {
//						Thread.sleep(100); 
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//					System.out.println(Thread.currentThread().getName() + "正在出售第"
//							+ (tickets--) + "张票");
//				}
//			}
//		}
//	}
	
	@Override
	public void run() {
		while (true) {
			synchronized (obj) {
				if (tickets > 0) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()
							+ "正在出售第" + (tickets--) + "张票");
				}
			}
		}
	}
}
