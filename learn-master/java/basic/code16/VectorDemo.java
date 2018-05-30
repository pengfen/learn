package com.test;

import java.util.Enumeration;
import java.util.Vector;

/*
 * Vector的特有功能：
 * 1：添加功能
 * 		public void addElement(Object obj)		--	add()
 * 2：获取功能
 * 		public Object elementAt(int index)		--  get()
 * 		public Enumeration elements()			--	Iterator iterator()
 * 				boolean hasMoreElements()				hasNext()
 * 				Object nextElement()					next()
 * 
 * JDK升级的原因：
 * 		A:安全
 * 		B:效率
 * 		C:简化书写
 */
public class VectorDemo {
	public static void main(String[] args) {
		// 创建集合对象
		Vector v = new Vector();

		// 添加功能
		v.addElement("hello");
		v.addElement("world");
		v.addElement("java");

		// 遍历
		for (int x = 0; x < v.size(); x++) {
			String s = (String) v.elementAt(x);
			System.out.println(s);
		}

		System.out.println("------------------");

		Enumeration en = v.elements(); // 返回的是实现类的对象
		while (en.hasMoreElements()) {
			String s = (String) en.nextElement();
			System.out.println(s);
		}
	}
}
