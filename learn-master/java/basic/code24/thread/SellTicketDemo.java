package cn.itcast_01;
/*
 * ��Ȼ���ǿ������ͬ��������ͬ�����������������⣬�������ǲ�û��ֱ�ӿ�������������������������ͷ�������
 * Ϊ�˸������ı����μ������ͷ���,JDK5�Ժ��ṩ��һ���µ�������Lock��
 * 
 * Lock��
 * 		void lock()�� ��ȡ����
 * 		void unlock():�ͷ�����  
 * ReentrantLock��Lock��ʵ����.
 */
public class SellTicketDemo {
	public static void main(String[] args) {
		// ������Դ����
		SellTicket st = new SellTicket();

		// ������������
		Thread t1 = new Thread(st, "����1");
		Thread t2 = new Thread(st, "����2");
		Thread t3 = new Thread(st, "����3");

		// �����߳�
		t1.start();
		t2.start();
		t3.start();
	}
}
