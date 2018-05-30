package cn.itcast_02;

import java.lang.reflect.Constructor;

import cn.itcast_01.Person;

/*
 * ͨ�������ȡ���췽����ʹ�á�
 */
public class ReflectDemo {
	public static void main(String[] args) throws Exception {
		// ��ȡ�ֽ����ļ�����
		Class c = Class.forName("cn.itcast_01.Person");

		// ��ȡ���췽��
		// public Constructor[] getConstructors():���й������췽��
		// public Constructor[] getDeclaredConstructors():���й��췽��
		// Constructor[] cons = c.getDeclaredConstructors();
		// for (Constructor con : cons) {
		// System.out.println(con);
		// }

		// ��ȡ�������췽��
		// public Constructor<T> getConstructor(Class<?>... parameterTypes)
		// ������ʾ���ǣ���Ҫ��ȡ�Ĺ��췽���Ĺ�������������������͵�class�ֽ����ļ�����
		Constructor con = c.getConstructor();// ���ص��ǹ��췽������

		// Person p = new Person();
		// System.out.println(p);
		// public T newInstance(Object... initargs)
		// ʹ�ô� Constructor �����ʾ�Ĺ��췽���������ù��췽�������������ʵ��������ָ���ĳ�ʼ��������ʼ����ʵ����
		Object obj = con.newInstance();
		System.out.println(obj);
		
		// Person p = (Person)obj;
		// p.show();
	}
}
