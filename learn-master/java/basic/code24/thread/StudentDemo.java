package cn.itcast_03;

/*
 * ������
 * 		��Դ�ࣺStudent	
 * 		����ѧ������:SetThread(������)
 * 		��ȡѧ�����ݣ�GetThread(������)
 * 		������:StudentDemo
 * 
 * ����1������˼·д���룬��������ÿ�ζ���:null---0
 * ԭ��������ÿ���߳��ж��������µ���Դ,������Ҫ���ʱ�����úͻ�ȡ�̵߳���ԴӦ����ͬһ��
 * ���ʵ����?
 * 		������������ݴ���������ͨ�����췽�����ݸ��������ࡣ
 * 
 */
public class StudentDemo {
	public static void main(String[] args) {
		//������Դ
		Student s = new Student();
		
		//���úͻ�ȡ����
		SetThread st = new SetThread(s);
		GetThread gt = new GetThread(s);

		//�߳���
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(gt);

		//�����߳�
		t1.start();
		t2.start();
	}
}
