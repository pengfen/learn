package com.test;

/*
 * public String toString():���ظö�����ַ�����ʾ��
 * 
 * Integer���µ�һ����̬������
 * 		public static String toHexString(int i)����һ������ת��һ��ʮ�����Ʊ�ʾ���ַ���
 * 
 * �����Ϣ��������ǽ�������ˣ����������Ϣ��û���κ�����ġ����ԣ������������඼��д�÷�����
 * ��ô��д��?
 * 		�Ѹ�������г�Ա����ֵ��ɷ��ؼ��ɡ�
 * ��д�����հ淽�������Զ�����toString()������
 * 
 * ע�⣺
 * 	 ֱ�����һ����������ƣ���ʵ���ǵ��øö����toString()������
 */
public class StudentDemo4 {
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.hashCode());
		System.out.println(s.getClass().getName());
		System.out.println("--------------------");
		System.out.println(s.toString());// cn.itcast_02.Student@42552c
		System.out.println("--------------------");
		// toString()������ֵ�ȼ�����
		// getClass().getName() + '@' + Integer.toHexString(hashCode())
		// this.getClass().getName()+'@'+Integer.toHexString(this.hashCode())

		// cn.itcast_02.Student@42552c
		// cn.itcast_02.Student@42552c

		System.out.println(s.getClass().getName() + '@'
				+ Integer.toHexString(s.hashCode()));

		System.out.println(s.toString());

		// ֱ��������������
		System.out.println(s);
	}
}
