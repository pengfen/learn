package com.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * List���ϵ��ص㣺
 * 		����(�洢��ȡ����Ԫ��һ��)�����ظ��ġ�
 */
public class ListDemo2 {
	public static void main(String[] args) {
		// �������϶���
		List list = new ArrayList();

		// �洢Ԫ��
		list.add("hello");
		list.add("world");
		list.add("java");
		list.add("javaee");
		list.add("android");
		list.add("javaee");
		list.add("android");

		// ��������
		Iterator it = list.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}
	}
}
