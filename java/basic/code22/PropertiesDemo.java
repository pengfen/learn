package com.test;

import java.util.Properties;
import java.util.Set;

/*
 * Properties:���Լ����ࡣ��һ�����Ժ�IO������ʹ�õļ����ࡣ
 * Properties �ɱ��������л�����м��ء������б���ÿ���������Ӧֵ����һ���ַ����� 
 * 
 * ��Hashtable�����࣬˵����һ��Map���ϡ�
 */
public class PropertiesDemo {
	public static void main(String[] args) {
		// ��ΪMap���ϵ�ʹ��
		// ���������÷��Ǵ���ģ�һ��Ҫ��API�����û��<>����˵�����಻��һ��������,��ʹ�õ�ʱ��Ͳ��ܼӷ���
		// Properties<String, String> prop = new Properties<String, String>();

		Properties prop = new Properties();

		// ���Ԫ��
		prop.put("it002", "hello");
		prop.put("it001", "world");
		prop.put("it003", "java");

		// System.out.println("prop:" + prop);

		// ��������
		Set<Object> set = prop.keySet();
		for (Object key : set) {
			Object value = prop.get(key);
			System.out.println(key + "---" + value);
		}
	}
}
