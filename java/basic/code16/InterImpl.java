package com.test;

//实现类在实现接口的时候
//第一种情况：已经知道该是什么类型的了

//public class InterImpl implements Inter<String> {
//
//	@Override
//	public void show(String t) {
//		System.out.println(t);
//	}
//}

//第二种情况：还不知道是什么类型的
public class InterImpl<T> implements Inter<T> {

	@Override
	public void show(T t) {
		System.out.println(t);
	}
}
