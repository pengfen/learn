package com.test;

import java.util.ArrayList;
import java.util.List;

/*
 * JDK5�������ԣ��Զ���װ��,����,��ǿfor,��̬����,�ɱ����,ö��
 * 
 * ��ǿfor:��forѭ����һ�֡�
 * 
 * ��ʽ��
 * 		for(Ԫ���������� ���� : �������Collection����) {
 *			ʹ�ñ������ɣ��ñ�������Ԫ��
 *   	}
 *   
 * �ô�����������ͼ��ϵı�����
 * 
 * �׶ˣ� ��ǿfor��Ŀ�겻��Ϊnull��
 * ��ν����?����ǿfor��Ŀ���Ƚ��в�Ϊnull���жϣ�Ȼ����ʹ�á�
 */
public class ForDemo {
	public static void main(String[] args) {
		// ����һ��int����
		int[] arr = { 1, 2, 3, 4, 5 };
		for (int x = 0; x < arr.length; x++) {
			System.out.println(arr[x]);
		}
		System.out.println("---------------");
		// ��ǿfor
		for (int x : arr) {
			System.out.println(x);
		}
		System.out.println("---------------");
		// ����һ���ַ�������
		String[] strArray = { "����ϼ", "������", "��������", "����" };
		// ��ǿfor
		for (String s : strArray) {
			System.out.println(s);
		}
		System.out.println("---------------");
		// ����һ������
		ArrayList<String> array = new ArrayList<String>();
		array.add("hello");
		array.add("world");
		array.add("java");
		// ��ǿfor
		for (String s : array) {
			System.out.println(s);
		}
		System.out.println("---------------");

		List<String> list = null;
		// NullPointerException
		// ���s�����Ǵ�list�����ȡ�����ģ��ڻ�ȡǰ�����϶�������һ���ж�
		// ˵���ˣ�����ǵ������Ĺ���
		if (list != null) {
			for (String s : list) {
				System.out.println(s);
			}
		}

		// ��ǿfor��ʵ�����������������
		//ConcurrentModificationException
		// for (String s : array) {
		// if ("world".equals(s)) {
		// array.add("javaee");
		// }
		// }
		// System.out.println("array:" + array);
	}
}
