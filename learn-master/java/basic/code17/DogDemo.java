package com.test;

import java.util.HashSet;

/*
 * HashSet���ϴ洢�Զ�����󲢱������������ĳ�Ա����ֵ��ͬ��Ϊͬһ������
 * 
 * ע���ˣ�
 * 		��ʹ�õ���HashSet���ϣ�������ϵĵײ��ǹ�ϣ��ṹ��
 * 		����ϣ��ṹ�ײ�����:hashCode()��equals()������
 * 		�������Ϊ����ĳ�Ա����ֵ��ͬ��Ϊͬһ������Ļ������Ӧ����д������������
 * 		�����д��?��ͬ���ģ��Զ����ɼ��ɡ�
 */
public class DogDemo {
	public static void main(String[] args) {
		// �������϶���
		HashSet<Dog> hs = new HashSet<Dog>();

		// ����������
		Dog d1 = new Dog("����", 25, "��ɫ", '��');
		Dog d2 = new Dog("��ٴ", 22, "��ɫ", 'Ů');
		Dog d3 = new Dog("����", 25, "��ɫ", '��');
		Dog d4 = new Dog("����", 20, "��ɫ", 'Ů');
		Dog d5 = new Dog("κ����", 28, "��ɫ", '��');
		Dog d6 = new Dog("����Ӣ", 23, "��ɫ", 'Ů');
		Dog d7 = new Dog("����Ӣ", 23, "��ɫ", 'Ů');
		Dog d8 = new Dog("����Ӣ", 23, "��ɫ", '��');

		// ���Ԫ��
		hs.add(d1);
		hs.add(d2);
		hs.add(d3);
		hs.add(d4);
		hs.add(d5);
		hs.add(d6);
		hs.add(d7);
		hs.add(d8);

		// ����
		for (Dog d : hs) {
			System.out.println(d.getName() + "---" + d.getAge() + "---"
					+ d.getColor() + "---" + d.getSex());
		}
	}
}
