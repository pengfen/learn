package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*
 *需求：
 *假设HashMap集合的元素是ArrayList。有3个。
 *每一个ArrayList集合的值是字符串。
 *元素我已经完成，请遍历。
 *结果：
 *		 三国演义
 *		 	吕布
 *		 	周瑜
 *		 笑傲江湖
 *		 	令狐冲
 *		 	林平之
 *		 神雕侠侣
 *		 	郭靖
 *		 	杨过  
 */
public class HashMapIncludeArrayListDemo {
	public static void main(String[] args) {
		// 创建集合对象
		HashMap<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();

		// 创建元素集合1
		ArrayList<String> array1 = new ArrayList<String>();
		array1.add("吕布");
		array1.add("周瑜");
		hm.put("三国演义", array1);

		// 创建元素集合2
		ArrayList<String> array2 = new ArrayList<String>();
		array2.add("令狐冲");
		array2.add("林平之");
		hm.put("笑傲江湖", array2);

		// 创建元素集合3
		ArrayList<String> array3 = new ArrayList<String>();
		array3.add("郭靖");
		array3.add("杨过");
		hm.put("神雕侠侣", array3);
		
		//遍历集合
		Set<String> set = hm.keySet();
		for(String key : set){
			System.out.println(key);
			ArrayList<String> value = hm.get(key);
			for(String s : value){
				System.out.println("\t"+s);
			}
		}
	}
}