package com.test;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/*
 * 需求 ："aababcabcdabcde",获取字符串中每一个字母出现的次数要求结果:a(5)b(4)c(3)d(2)e(1)
 * 
 * 分析：
 * 		A:定义一个字符串(可以改进为键盘录入)
 * 		B:定义一个TreeMap集合
 * 			键:Character
 * 			值：Integer
 * 		C:把字符串转换为字符数组
 * 		D:遍历字符数组，得到每一个字符
 * 		E:拿刚才得到的字符作为键到集合中去找值，看返回值
 * 			是null:说明该键不存在，就把该字符作为键，1作为值存储
 * 			不是null:说明该键存在，就把值加1，然后重写存储该键和值
 * 		F:定义字符串缓冲区变量
 * 		G:遍历集合，得到键和值，进行按照要求拼接
 * 		H:把字符串缓冲区转换为字符串输出
 * 
 * 录入：linqingxia
 * 结果：result:a(1)g(1)i(3)l(1)n(2)q(1)x(1)
 */
public class TreeMapDemo3 {
	public static void main(String[] args) {
		// 定义一个字符串(可以改进为键盘录入)
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String line = sc.nextLine();

		// 定义一个TreeMap集合
		TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>();
		
		//把字符串转换为字符数组
		char[] chs = line.toCharArray();
		
		//遍历字符数组，得到每一个字符
		for(char ch : chs){
			//拿刚才得到的字符作为键到集合中去找值，看返回值
			Integer i =  tm.get(ch);
			
			//是null:说明该键不存在，就把该字符作为键，1作为值存储
			if(i == null){
				tm.put(ch, 1);
			}else {
				//不是null:说明该键存在，就把值加1，然后重写存储该键和值
				i++;
				tm.put(ch,i);
			}
		}
		
		//定义字符串缓冲区变量
		StringBuilder sb=  new StringBuilder();
		
		//遍历集合，得到键和值，进行按照要求拼接
		Set<Character> set = tm.keySet();
		for(Character key : set){
			Integer value = tm.get(key);
			sb.append(key).append("(").append(value).append(")");
		}
		
		//把字符串缓冲区转换为字符串输出
		String result = sb.toString();
		System.out.println("result:"+result);
	}
}

