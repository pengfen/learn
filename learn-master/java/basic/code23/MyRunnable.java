package cn.itcast_05;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int x = 0; x < 100; x++) {
			// ����ʵ�ֽӿڵķ�ʽ�Ͳ���ֱ��ʹ��Thread��ķ�����,���ǿ��Լ�ӵ�ʹ��
			System.out.println(Thread.currentThread().getName() + ":" + x);
		}
	}

}