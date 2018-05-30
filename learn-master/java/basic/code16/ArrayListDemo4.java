package com.test;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ����ArrayList�洢�Զ�����󲢱�����Ҫ����뷺�ͣ�������ǿfor������
 * A:������
 * B:��ͨfor
 * C:��ǿfor
 * 
 * LinkedList,Vector,Colleciton,List�ȴ洢�һ�����?�������ˣ�����Ҫ��������ϰ��
 * 
 * ��ǿfor���������������
 */
public class ArrayListDemo4 {
	public static void main(String[] args) {
		// �������϶���
		ArrayList<Student> array = new ArrayList<Student>();

		// ����ѧ������
		Student s1 = new Student("����ϼ", 27);
		Student s2 = new Student("����", 22);
		Student s3 = new Student("����", 24);
		Student s4 = new Student("��ʩ", 21);
		Student s5 = new Student("���Ѿ�", 23);

		// ��ѧ��������ӵ�������
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		array.add(s5);

		// ������
		Iterator<Student> it = array.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}
		System.out.println("---------------");

		// ��ͨfor
		for (int x = 0; x < array.size(); x++) {
			Student s = array.get(x);
			System.out.println(s.getName() + "---" + s.getAge());
		}
		System.out.println("---------------");

		// ��ǿfor
		for (Student s : array) {
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}