package cn.itcast_04;

import java.util.Date;

public class ThreadSleep extends Thread {
	@Override
	public void run() {
		for (int x = 0; x < 100; x++) {
			System.out.println(getName() + ":" + x + ",ÈÕÆÚ£º" + new Date());
			// Ë¯Ãß
			// À§ÁË£¬ÎÒÉÔÎ¢ÐÝÏ¢1ÃëÖÓ
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
