package cn.itcast_02;

import java.lang.reflect.Constructor;

import cn.itcast_01.Person;

/*
 * 通过反射获取构造方法并使用。
 */
public class ReflectDemo {
	public static void main(String[] args) throws Exception {
		// 获取字节码文件对象
		Class c = Class.forName("cn.itcast_01.Person");

		// 获取构造方法
		// public Constructor[] getConstructors():所有公共构造方法
		// public Constructor[] getDeclaredConstructors():所有构造方法
		// Constructor[] cons = c.getDeclaredConstructors();
		// for (Constructor con : cons) {
		// System.out.println(con);
		// }

		// 获取单个构造方法
		// public Constructor<T> getConstructor(Class<?>... parameterTypes)
		// 参数表示的是：你要获取的构造方法的构造参数个数及数据类型的class字节码文件对象
		Constructor con = c.getConstructor();// 返回的是构造方法对象

		// Person p = new Person();
		// System.out.println(p);
		// public T newInstance(Object... initargs)
		// 使用此 Constructor 对象表示的构造方法来创建该构造方法的声明类的新实例，并用指定的初始化参数初始化该实例。
		Object obj = con.newInstance();
		System.out.println(obj);
		
		// Person p = (Person)obj;
		// p.show();
	}
}
