package cn.itcast_03;

/*
 * ����ģʽ��
 * 		����ʽ����һ���ؾʹ�������
 * 		����ʽ���õ�ʱ�򣬲�ȥ��������
 * 
 * �����⣺����ģʽ��˼����ʲô?��дһ���������֡�
 * 
 * 		����������ʽ(�ǲ��������ĵ���ģʽ)
 * 		���ԣ�����ʽ(���ܻ������ĵ���ģʽ)
 * 			A:������(�ӳټ���)	
 * 			B:�̰߳�ȫ����
 * 				a:�Ƿ���̻߳���	��
 * 				b:�Ƿ��й�������	��
 * 				c:�Ƿ��ж����������������� 	��
 */
public class Teacher {
	private Teacher() {
	}

	private static Teacher t = null;

	public synchronized static Teacher getTeacher() {
		// t1,t2,t3
		if (t == null) {
			//t1,t2,t3
			t = new Teacher();
		}
		return t;
	}
}
