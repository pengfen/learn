package com.test;

/*
 * String s = new String(��hello��)��String s = ��hello��;������?
 * �С�ǰ�߻ᴴ��2�����󣬺��ߴ���1������
 * 
 * ==:�Ƚ��������ͱȽϵ��ǵ�ֵַ�Ƿ���ͬ
 * equals:�Ƚ���������Ĭ��Ҳ�ǱȽϵ�ֵַ�Ƿ���ͬ����String����д��equals()�������Ƚϵ��������Ƿ���ͬ��
 */
public class StringDemo3 {
	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = "hello";

		System.out.println(s1 == s2);// false �Ƚϵ�ֵַ
		System.out.println(s1.equals(s2));// true
	}
}
