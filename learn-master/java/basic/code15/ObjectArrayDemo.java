package com.test;

/*
 * ����5��ѧ����������5��ѧ������Ϣ�洢�������У����������飬��ȡ�õ�ÿһ��ѧ����Ϣ��
 *		 ѧ����Student
 *		 ��Ա������name,age
 *		 ���췽�����޲�,����
 *		 ��Ա������getXxx()/setXxx()
 *		 �洢ѧ��������?�Լ�����Ӧ����ʲô���ӵ�?
 * ������
 * 		A:����ѧ���ࡣ
 * 		B:����ѧ������(��������)��
 * 		C:����5��ѧ�����󣬲���ֵ��
 * 		D:��C�����Ԫ�أ��ŵ������С�
 * 		E:����ѧ�����顣
 */
public class ObjectArrayDemo {
	public static void main(String[] args) {
		// ����ѧ������(��������)��
		Student[] students = new Student[5];
		// for (int x = 0; x < students.length; x++) {
		// System.out.println(students[x]);
		// }
		// System.out.println("---------------------");

		// ����5��ѧ�����󣬲���ֵ��
		Student s1 = new Student("����ϼ", 27);
		Student s2 = new Student("������", 30);
		Student s3 = new Student("����", 30);
		Student s4 = new Student("����֥", 60);
		Student s5 = new Student("������", 35);

		// ��C�����Ԫ�أ��ŵ������С�
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		students[3] = s4;
		students[4] = s5;

		// ���������ƣ�����ѭ����
		// for (int x = 0; x < students.length; x++) {
		// students[x] = s + "" + (x + 1);
		// }
		// ������������

		// ����
		for (int x = 0; x < students.length; x++) {
			//System.out.println(students[x]);
			
			Student s = students[x];
			System.out.println(s.getName()+"---"+s.getAge());
		}
	}
}
