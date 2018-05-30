package com.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Map集合的遍历。
 * Map -- 夫妻对
 * 思路：
 * 		A:把所有的丈夫给集中起来。
 * 		B:遍历丈夫的集合，获取得到每一个丈夫。
 * 		C:让丈夫去找自己的妻子。
 * 
 * 转换：
 * 		A:获取所有的键
 * 		B:遍历键的集合，获取得到每一个键
 * 		C:根据键去找值
 */
public class MapDemo3 {
	public static void main(String[] args) {
		// 创建集合对象
		Map<String, String> map = new HashMap<String, String>();

		// 创建元素并添加到集合
		map.put("杨过", "小龙女");
		map.put("郭靖", "黄蓉");
		map.put("杨康", "穆念慈");
		map.put("陈玄风", "梅超风");

		// 遍历
		// 获取所有的键
		Set<String> set = map.keySet();
		// 遍历键的集合，获取得到每一个键
		for (String key : set) {
			// 根据键去找值
			String value = map.get(key);
			System.out.println(key + "---" + value);
		}
	}
}
