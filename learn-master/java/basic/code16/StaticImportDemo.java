package com.test;

/*
 * ��̬���룺
 * ��ʽ��import static ������.����.������;
 * ����ֱ�ӵ��뵽�����ļ���
 * 
 * ��̬�����ע�����
 * 		A:���������Ǿ�̬��
 * 		B:����ж��ͬ���ľ�̬���������ײ�֪��ʹ��˭?���ʱ��Ҫʹ�ã������ǰ׺���ɴ˿ɼ������岻������һ�㲻�ã�����Ҫ�ܿ�����
 */
import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.max;

//����
//import static java.util.ArrayList.add;

public class StaticImportDemo {
	public static void main(String[] args) {
		// System.out.println(java.lang.Math.abs(-100));
		// System.out.println(java.lang.Math.pow(2, 3));
		// System.out.println(java.lang.Math.max(20, 30));
		// ̫���ӣ����Ǿ����뵽import

		// System.out.println(Math.abs(-100));
		// System.out.println(Math.pow(2, 3));
		// System.out.println(Math.max(20, 30));
		// ̫���ӣ��и���

//		System.out.println(abs(-100));
		System.out.println(java.lang.Math.abs(-100));
		System.out.println(pow(2, 3));
		System.out.println(max(20, 30));
	}
	
	public static void abs(String s){
		System.out.println(s);
	}
}
