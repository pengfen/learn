package com.test;

import java.util.Properties;
import java.util.Set;

/*
 * ���⹦�ܣ�
 * public Object setProperty(String key,String value)�����Ԫ��
 * public String getProperty(String key):��ȡԪ��
 * public Set<String> stringPropertyNames():��ȡ���еļ��ļ���
 */
public class PropertiesDemo2 {
	public static void main(String[] args) {
		// �������϶���
		Properties prop = new Properties();

		// ���Ԫ��
		prop.setProperty("����", "30");
		prop.setProperty("����", "40");
		prop.setProperty("����", "50");

		// public Set<String> stringPropertyNames():��ȡ���еļ��ļ���
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