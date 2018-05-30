package cn.itcast.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/*
 * �Ҹ���ArrayList<Integer>��һ������������������������һ���ַ������ݣ����ʵ���أ�
 */
public class ArrayListDemo {
	public static void main(String[] args) throws NoSuchMethodException,
			SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		// �������϶���
		ArrayList<Integer> array = new ArrayList<Integer>();

		// array.add("hello");
		// array.add(10);

		Class c = array.getClass(); // ����ArrayList��class�ļ�����
		Method m = c.getMethod("add", Object.class);

		m.invoke(array, "hello"); // ����array��add�����������ֵ��hello
		m.invoke(array, "world");
		m.invoke(array, "java");

		System.out.println(array);
	}
}
