package cn.itcast_04;

/*
 * public final void stop():���߳�ֹͣ����ʱ�ˣ����ǻ�����ʹ�á�
 * public void interrupt():�ж��̡߳� ���̵߳�״̬��ֹ�����׳�һ��InterruptedException��
 */
public class ThreadStopDemo {
	public static void main(String[] args) {
		ThreadStop ts = new ThreadStop();
		ts.start();

		// �㳬�����벻�ѹ������Ҿ͸�����
		try {
			Thread.sleep(3000);
			// ts.stop();
			ts.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
