package com.test;

import java.util.Properties;
import java.util.Set;

/*
 * 特殊功能：
 * public Object setProperty(String key,String value)：添加元素
 * public String getProperty(String key):获取元素
 * public Set<String> stringPropertyNames():获取所有的键的集合
 */
public class PropertiesDemo2 {
	public static void main(String[] args) {
		// 创建集合对象
		Properties prop = new Properties();

		// 添加元素
		prop.setProperty("张三", "30");
		prop.setProperty("李四", "40");
		prop.setProperty("王五", "50");

		// public Set<String> stringPropertyNames():获取所有的键的集合
		Set<String> set = prop.stringPropertyNames();
		for (String key : set) {
			String value = prop.getProperty(key);
			System.out.println(key + "---" + value);
		}
	}
}

/*
 * class Hashtalbe<K,V> { public V put(K key,V value) { ... } }
 * 
 * class Properties extends Hashtable { public V setProperty(String key,String
 * value) { return put(key,value); } }
 */