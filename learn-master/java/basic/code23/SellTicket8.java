package cn.itcast_08;

public class SellTicket implements Runnable {
	// ����100��Ʊ
	private int tickets = 100;

//	@Override
//	public void run() {
//		while (true) {
//			// t1,t2,t3�����߳�
//			// ��һ�ε�tickets = 100;
//			if (tickets > 0) {
//				// Ϊ��ģ�����ʵ�ĳ���������������Ϣ
//				try {
//					Thread.sleep(100); // t1��������Ϣ,t2��������Ϣ
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//
//				System.out.println(Thread.currentThread().getName() + "���ڳ��۵�"
//						+ (tickets--) + "��Ʊ");
//				// ����״̬��
//				// ����1���ڳ��۵�100��Ʊ
//				// ����2���ڳ��۵�99��Ʊ
//				// ������?
//				// CPU��ÿһ��ִ�б�����һ��ԭ����(��򵥻�����)�Ĳ�����
//				// �ȼ�¼��ǰ��ֵ
//				// ���Ű�ticket--
//				// Ȼ�������ǰ��ֵ(t2����)
//				// ticket��ֵ�ͱ����99
//				// ����1���ڳ��۵�100��Ʊ
//				// ����2���ڳ��۵�100��Ʊ
//
//			}
//		}
//	}
	
	@Override
	public void run() {
		while (true) {
			// t1,t2,t3�����߳�
			// ��һ�ε�tickets = 1;
			if (tickets > 0) {
				// Ϊ��ģ�����ʵ�ĳ���������������Ϣ
				try {
					Thread.sleep(100); //t1�����˲���Ϣ��t2�����˲���Ϣ��t3�����˲���Ϣ��
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				System.out.println(Thread.currentThread().getName() + "���ڳ��۵�"
						+ (tickets--) + "��Ʊ");
				//����1���ڳ��۵�1��Ʊ,tickets=0
				//����2���ڳ��۵�0��Ʊ,tickets=-1
				//����3���ڳ��۵�-1��Ʊ,tickets=-2
			}
		}
	}
}
