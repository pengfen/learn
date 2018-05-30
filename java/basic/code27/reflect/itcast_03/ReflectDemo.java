package cn.itcast_03;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/*
 * 通过发生获取成员变量并使用
 */
public class ReflectDemo {
	public static void main(String[] args) throws Exception {
		// 获取字节码文件对象
		Class c = Class.forName("cn.itcast_01.Person");

		// 获取所有的成员变量
		// Field[] fields = c.getFields();
		// Field[] fields = c.getDeclaredFields();
		// for (Field field : fields) {
		// System.out.println(field);
		// }

		/*
		 * Person p = new Person(); p.address = "北京"; System.out.println(p);
		 */

		// 通过无参构造方法创建对象
		Constructor con = c.getConstructor();
		Object obj = con.newInstance();
		System.out.println(obj);

		// 获取单个的成员变量
		// 获取address并对其赋值
		Field addressField = c.getField("address");
		// public void set(Object obj,Object value)
		// 将指定对象变量上此 Field 对象表示的字段设置为指定的新值。
		addressField.set(obj, "北京"); // 给obj对象的addressField字段设置值为"北京"
		System.out.println(obj);

		// 获取name并对其赋值
		// NoSuchFieldException
		Field nameField = c.getDeclaredField("name");
		// IllegalAccessException
		nameField.setAccessible(true);
		nameField.set(obj, "林青霞");
		System.out.println(obj);

		// 获取age并对其赋值
		Field ageField = c.getDeclaredField("age");
		ageField.setAccessible(true);
		ageField.set(obj, 27);
		System.out.println(obj);
	}
}
