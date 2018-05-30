package com.test;

/*
 * Object:�� Object �����νṹ�ĸ��ࡣÿ���඼ʹ�� Object ��Ϊ���ࡣ
 * ÿ���඼ֱ�ӻ��߼�ӵļ̳���Object�ࡣ
 * 
 * Object��ķ�����
 * 		public int hashCode():���ظö���Ĺ�ϣ��ֵ��
 * 			ע�⣺��ϣֵ�Ǹ��ݹ�ϣ�㷨���������һ��ֵ�����ֵ�͵�ֵַ�йأ����ǲ���ʵ�ʵ�ֵַ��
 * 			           ��������Ϊ��ֵַ��
 * 
 *		public final Class getClass():���ش� Object ������ʱ��
 *			Class��ķ�����
 *				public String getName()���� String ����ʽ���ش� Class ��������ʾ��ʵ��
 */
public class StudentDemo3 {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1.hashCode()); // 11299397
		Student s2 = new Student();
		System.out.println(s2.hashCode());// 24446859
		Student s3 = s1;
		System.out.println(s3.hashCode()); // 11299397
		System.out.println("-----------");

		Student s = new Student();
		Class c = s.getClass();
		String str = c.getName();
		System.out.println(str); // cn.itcast_01.Student
		
		//��ʽ���
		String str2  = s.getClass().getName();
		System.out.println(str2);
	}
}
