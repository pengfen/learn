package com.test;
import java.util.Hashtable;

/*
 * 1:Hashtable和HashMap的区别?
 * Hashtable:线程安全，效率低。不允许null键和null值
 * HashMap:线程不安全，效率高。允许null键和null值
 * 
 * 2:List,Set,Map等接口是否都继承子Map接口?
 * List，Set不是继承自Map接口，它们继承自Collection接口
 * Map接口本身就是一个顶层接口
 */
public class HashtableDemo {
	public static void main(String[] args) {
		// HashMap<String, String> hm = new HashMap<String, String>();
		Hashtable<String, String> hm = new Hashtable<String, String>();

		hm.put("it001", "hello");
		// hm.put(null, "world"); //NullPointerException
		// hm.put("java", null); // NullPointerException

		System.out.println(hm);
	}
}