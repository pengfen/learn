package cn.itcast_04;

import java.util.Date;

public class ThreadStop extends Thread {
	@Override
	public void run() {
		System.out.println("��ʼִ�У�" + new Date());

		// ��Ҫ��Ϣ10���ӣ��ף���Ҫ������Ŷ
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// e.printStackTrace();
			System.out.println("�̱߳���ֹ��");
		}

		System.out.println("����ִ�У�" + new Date());
	}
}
