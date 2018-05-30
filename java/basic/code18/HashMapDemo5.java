package com.test;

import java.util.HashMap;
import java.util.Set;

/*
 * HashMap嵌套HashMap
 * 
 * 传智播客
 * 		jc	基础班
 * 				陈玉楼		20
 * 				高跃		22
 * 		jy	就业班
 * 				李杰		21
 * 				曹石磊		23
 * 
 * 先存储元素，然后遍历元素
 */
public class HashMapDemo5 {
	public static void main(String[] args) {
		// 创建集合对象
		HashMap<String, HashMap<String, Integer>> czbkMap = new HashMap<String, HashMap<String, Integer>>();

		// 创建基础班集合对象
		HashMap<String, Integer> jcMap = new HashMap<String, Integer>();
		// 添加元素
		jcMap.put("陈玉楼", 20);
		jcMap.put("高跃", 22);
		// 把基础班添加到大集合
		czbkMap.put("jc", jcMap);

		// 创建就业班集合对象
		HashMap<String, Integer> jyMap = new HashMap<String, Integer>();
		// 添加元素
		jyMap.put("李杰", 21);
		jyMap.put("曹石磊", 23);
		// 把基础班添加到大集合
		czbkMap.put("jy", jyMap);
		
		//遍历集合
		Set<String> czbkMapSet = czbkMap.keySet();
		for(String czbkMapKey : czbkMapSet){
			System.out.println(czbkMapKey);
			HashMap<String, Integer> czbkMapValue = czbkMap.get(czbkMapKey);
			Set<String> czbkMapValueSet = czbkMapValue.keySet();
			for(String czbkMapValueKey : czbkMapValueSet){
				Integer czbkMapValueValue = czbkMapValue.get(czbkMapValueKey);
				System.out.println("\t"+czbkMapValueKey+"---"+czbkMapValueValue);
			}
		}
	}
}
