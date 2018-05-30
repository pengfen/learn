package com.test;

/*
 *	protected void finalize()��������������ȷ�������ڶԸö���ĸ�������ʱ���ɶ�����������������ô˷����������������գ�����ʲôʱ����ղ�ȷ����
 *	protected Object clone():���������ش˶����һ��������
 *		A:��д�÷���
 *
 *  Cloneable:����ʵ���� Cloneable �ӿڣ���ָʾ Object.clone() �������ԺϷ��ضԸ���ʵ�����а��ֶθ��ơ� 
 *  	����ӿ��Ǳ�ǽӿڣ���������ʵ�ָýӿڵ���Ϳ���ʵ�ֶ���ĸ����ˡ�
 */
public class StudentDemo6 {
	public static void main(String[] args) throws CloneNotSupportedException {
		//����ѧ������
		Student6 s = new Student6();
		s.setName("����ϼ");
		s.setAge(27);
		
		//��¡ѧ������
		Object obj = s.clone();
		Student6 s2 = (Student6)obj;
		System.out.println("---------");
		
		System.out.println(s.getName()+"---"+s.getAge());
		System.out.println(s2.getName()+"---"+s2.getAge());
		
		//��ǰ������
		Student6 s3 = s;
		System.out.println(s3.getName()+"---"+s3.getAge());
		System.out.println("---------");
		
		//��ʵ���������
		s3.setName("����");
		s3.setAge(30);
		System.out.println(s.getName()+"---"+s.getAge());
		System.out.println(s2.getName()+"---"+s2.getAge());
		System.out.println(s3.getName()+"---"+s3.getAge());
		
	}
}
