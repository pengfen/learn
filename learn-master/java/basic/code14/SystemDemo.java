package com.test;

/*
 * System�����һЩ���õ����ֶκͷ����������ܱ�ʵ������ 
 * 
 * ������
 * 		public static void gc()������������������ 
 *		public static void exit(int status)
 *		public static long currentTimeMillis()
 *		public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
 */
public class SystemDemo {
	public static void main(String[] args) {
		Person p = new Person("����֥", 60);
		System.out.println(p);

		p = null; // ��p����ָ�����ڴ�
		System.gc();
	}
}
