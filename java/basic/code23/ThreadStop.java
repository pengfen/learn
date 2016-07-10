package cn.itcast_04;

import java.util.Date;

public class ThreadStop extends Thread {
	@Override
	public void run() {
		System.out.println("开始执行：" + new Date());

		// 我要休息10秒钟，亲，不要打扰我哦
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// e.printStackTrace();
			System.out.println("线程被终止了");
		}

		System.out.println("结束执行：" + new Date());
	}
}
