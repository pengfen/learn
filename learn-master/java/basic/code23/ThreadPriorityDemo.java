package cn.itcast_04;

/*
 * ���ǵ��߳�û���������ȼ�,�϶���Ĭ�����ȼ���
 * ��ô��Ĭ�����ȼ��Ƕ�����?
 * ��λ�ȡ�̶߳�������ȼ�?
 * 		public final int getPriority():�����̶߳�������ȼ�
 * ��������̶߳�������ȼ���?
 * 		public final void setPriority(int newPriority)�������̵߳����ȼ��� 
 * 
 * ע�⣺
 * 		�߳�Ĭ�����ȼ���5��
 * 		�߳����ȼ��ķ�Χ�ǣ�1-10��
 * 		�߳����ȼ��߽�����ʾ�̻߳�ȡ�� CPUʱ��Ƭ�ļ��ʸߣ�����Ҫ�ڴ����Ƚ϶࣬���߶�����е�ʱ����ܿ����ȽϺõ�Ч����
 * 		
 * IllegalArgumentException:�Ƿ������쳣��
 * �׳����쳣�����򷽷�������һ�����Ϸ�����ȷ�Ĳ����� 
 * 
 */
public class ThreadPriorityDemo {
	public static void main(String[] args) {
		ThreadPriority tp1 = new ThreadPriority();
		ThreadPriority tp2 = new ThreadPriority();
		ThreadPriority tp3 = new ThreadPriority();

		tp1.setName("��������");
		tp2.setName("����Ⱥ");
		tp3.setName("��ƽ֮");

		// ��ȡĬ�����ȼ�
		// System.out.println(tp1.getPriority());
		// System.out.println(tp2.getPriority());
		// System.out.println(tp3.getPriority());

		// �����߳����ȼ�
		// tp1.setPriority(100000);
		
		//������ȷ���߳����ȼ�
		tp1.setPriority(10);
		tp2.setPriority(1);

		tp1.start();
		tp2.start();
		tp3.start();
	}
}
