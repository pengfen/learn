package cn.itcast_02;

/*
 * ͬ���ı׶ˣ�
 * 		A:Ч�ʵ�
 * 		B:���ײ�������
 * 
 * ������
 * 		�������������ϵ��߳���������Դ�Ĺ����У�������һ���໥�ȴ�������
 * 
 * ������
 * 		�й��ˣ������˳Է�������
 * 		���������
 * 			�й���:������֧
 * 			������:���Ͳ�
 * 		���ڣ�
 * 			�й��ˣ�����1֧����һ��
 * 			�����ˣ�����1֧����һ��
 */
public class DieLockDemo {
	public static void main(String[] args) {
		DieLock dl1 = new DieLock(true);
		DieLock dl2 = new DieLock(false);

		dl1.start();
		dl2.start();
	}
}
