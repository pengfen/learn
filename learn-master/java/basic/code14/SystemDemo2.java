package com.test;

/*
 * System�����һЩ���õ����ֶκͷ����������ܱ�ʵ������ 
 * 
 * ������
 * 		public static void gc()������������������ 
 *		public static void exit(int status):��ֹ��ǰ�������е� Java ���������������״̬�룻���ݹ������� 0 ��״̬���ʾ�쳣��ֹ�� 
 *		public static long currentTimeMillis():�����Ժ���Ϊ��λ�ĵ�ǰʱ��
 *		public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
 */
public class SystemDemo2 {
	public static void main(String[] args) {
		// System.out.println("����ϲ������ϼ(��������)");
		// System.exit(0);
		// System.out.println("����Ҳϲ������֥(������)");

		// System.out.println(System.currentTimeMillis());

		// �����õ�������ʵ��Ŀǰ��������˵���岻��
		// ��ô����������ʲô������?
		// Ҫ�����Ҹ���ͳ����γ��������ʱ��
		long start = System.currentTimeMillis();
		for (int x = 0; x < 100000; x++) {
			System.out.println("hello" + x);
		}
		long end = System.currentTimeMillis();
		System.out.println("����ʱ��" + (end - start) + "����");
	}
}
